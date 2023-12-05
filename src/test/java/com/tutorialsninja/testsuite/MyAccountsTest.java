package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest   extends BaseTest  {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        homePage.clickOnMyAccount();

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");

        //1.3 Verify the text “Register Account”.
        String actualRegisterAccountText = registerPage.verifyTheRegisterAccountText();
        Assert.assertEquals(actualRegisterAccountText, "Register Account", "Incorrect Text");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        homePage.clickOnMyAccount();

        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");

        //2.3 Verify the text “Returning Customer”.
        String actualLoginText = loginPage.verifyTheLoginText();
        Assert.assertEquals(actualLoginText, "Returning Customer", "Incorrect Text");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Click on My Account Link.
        homePage.clickOnMyAccount();

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");

        //3.3 Enter First Name
        registerPage.enterFirstName("Avinash");

        //3.4 Enter Last Name
        registerPage.enterLastName("Patel");

        //3.5 Enter Email
        registerPage.enterEmail("avvvinnaassshhhp22200111@gmail.com");

        //3.6 Enter Telephone
        registerPage.enterTelephone("07759463259");

        //3.7 Enter Password
        registerPage.enterPassword("Prime12345");

        //3.8 Enter Password Confirm
        registerPage.enterPasswordConfirm("Prime12345");

        //3.9 Select Subscribe Yes radio button
        registerPage.clickOnSubscribeRadioButtonField();

        //3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicyBox();

        //3.11 Click on Continue button
        registerPage.clickOnContinueButton();

        //3.12 Verify the message “Your Account Has Been Created!”
        Thread.sleep(2000);
        String actualAccountCreateText = registerPage.verifyTheAccountCreateText();
        Assert.assertEquals(actualAccountCreateText, "Your Account Has Been Created!", "Incorrect Text");

        //3.13 Click on Continue button
        registerPage.clickOnContinueButton1();

        //3.14 Click on My Account Link.
        homePage.clickOnMyAccount();

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        homePage.selectMyAccountOptions("Logout");

        //3.16 Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTheLogOutText();
        Assert.assertEquals(actualLogoutText, "Account Logout", "Incorrect Text");

        //3.17 Click on Continue button
        myAccountPage.clickOnContinueButton2();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        homePage.clickOnMyAccount();

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");

        //4.3 Enter Email address
        loginPage.enterEmail1("avinashp22@gmail.com");

        //4.5 Enter Password
        loginPage.enterPassword1("Prime12345");

        //4.6 Click on Login button
        loginPage.clickOnLoginButton();

        //4.7 Verify text “My Account”
        String actualMyAccountText = myAccountPage.verifyMyAccountText();
        Assert.assertEquals(actualMyAccountText, "My Account", "Not Logged in");

        //4.8 Click on My Account Link.
        homePage.clickOnMyAccount();

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        homePage.selectMyAccountOptions("Logout");

        //4.10 Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTheLogOutText();
        Assert.assertEquals(actualLogoutText, "Account Logout", "Not Logout");

        //4.11 Click on Continue button
        myAccountPage.clickOnContinue3();
    }

}
