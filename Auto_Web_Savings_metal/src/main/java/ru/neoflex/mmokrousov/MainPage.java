package ru.neoflex.mmokrousov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.UUID;

public class MainPage {
    WebDriver driver;
    AuthorizationPage authorizationPage;
    FirstWindowObject firstWindowObject;
    SecondWindowObject secondWindowObject;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        authorizationPage = PageFactory.initElements(driver, AuthorizationPage.class);
        firstWindowObject = PageFactory.initElements(driver, FirstWindowObject.class);
        secondWindowObject = PageFactory.initElements(driver, SecondWindowObject.class);
    }

    public FirstWindowObject inputFirstWindow(String session){
        authorizationPage.inputSessionId(session);
        authorizationPage.inputWireMock();
        authorizationPage.inputSub();
        authorizationPage.inputCtxi();
        authorizationPage.inputChannel();
        authorizationPage.inputJti();
        authorizationPage.inputIp();
        authorizationPage.inputButton();
        return new FirstWindowObject(driver);
    }
}
