package com;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
webDriverClass driverClass = new webDriverClass();
@Before
public void open(){

    driverClass.openBrowser();
}




    @After
    public void close(){

    //driver class.close browser
        //close browser
        driverClass.closeBrowser();
    }




}
