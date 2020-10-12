package com.review.library.step_defs;

import com.review.library.pages.LoginPage;
import io.cucumber.java.en.When;

public class LoginStepDefsWithParams {
    LoginPage loginPage = new LoginPage();
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        System.out.println("Enter username -> "+username);
        loginPage.email.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String pw) {
        System.out.println("Enter password -> "+pw);
        loginPage.password.sendKeys(pw);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        System.out.println("Clicking the sign in button");
        loginPage.signIn.click();
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String pw) {
        System.out.println("Logging in using "+username+" and "+pw);
        loginPage.login(username,pw);

    }
}
