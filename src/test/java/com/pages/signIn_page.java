package com.pages;

import com.webDriverClass;
import org.openqa.selenium.By;

public class signIn_page extends webDriverClass {

    public void GotoURL(String URL){


        System.out.println(URL);
//   step2 Enter url.
        driver.get(URL);


    }


    public void ClickRegisterbutton() {
        driver.findElement(By.linkText("register")).click();
    }

    public void clickSignInbutton() {driver.findElement(By.linkText("register")).click();

    }

    public void clickSignInbuttonOnsigninPage() {
        driver.findElement(By.linkText("signin")).click();

    }

    public void enterEmailAddress(String emailid) {
        driver.findElement(By.id("email")).sendKeys(emailid);
    }

    public void enterPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
            }


    public void clickSignInbuttonOnSignInPage() {
        driver.findElement(By.linkText("SubmitLogin")).click();
    }

    public void asserterrormessageOnSignInPage(String errorMessage_exp) {
        driver.findElement(By.linkText("SubmitLogin")).click()

    }
}





