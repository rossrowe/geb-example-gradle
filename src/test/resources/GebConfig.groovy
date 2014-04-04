/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import geb.driver.SauceLabsDriverFactory

waiting {
    timeout = 2
}

def sauceBrowser = System.getProperty("geb.sauce.browser")
if (sauceBrowser) {
    driver = {
        def username = System.getenv("GEB_SAUCE_LABS_USER")
        def accessKey = System.getenv("GEB_SAUCE_LABS_ACCESS_PASSWORD")
        new SauceLabsDriverFactory().create(sauceBrowser, username, accessKey)
    }
}
