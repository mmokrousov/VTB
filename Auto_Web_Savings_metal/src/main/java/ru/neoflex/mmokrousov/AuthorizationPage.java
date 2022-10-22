package ru.neoflex.mmokrousov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage {
    private WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"details-button\"]")
    private WebElement additionallyButton;
    @FindBy(xpath = "//*[@id=\"proceed-link\"]")
    private WebElement inputToWebSite;
    @FindBy(xpath = "//*[@id='clientSessionId']")
    private WebElement sessionId;
    @FindBy(xpath = "//*[@id=\"wiremock\"]")
    private WebElement wireMock;
    @FindBy(xpath = "//*[@id=\"headers.x-epa-sub\"]")
    private WebElement sub;
    @FindBy(xpath = "//*[@id=\"headers.x-epa-ctxi\"]")
    private WebElement ctxi;
    @FindBy(xpath = "//*[@id=\"headers.x-epa-channel\"]")
    private WebElement channel;
    @FindBy(xpath = "//*[@id=\"headers.x-epa-jti\"]")
    private WebElement jti;
    @FindBy(xpath = "//*[@id=\"headers.x-epa-ip\"]")
    private WebElement ip;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/form/div[10]/button/div/div")
    private WebElement inputButton;


    public void inputSessionId(String session){sessionId.sendKeys(session);}

    public void inputWireMock(){wireMock.sendKeys("https://wiremock-savc.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/bsc-wire-mock/");}

    public void inputSub(){
        sub.clear();
        sub.sendKeys("prime");
    }

    public void inputCtxi(){ctxi.sendKeys("123");}

    public void inputChannel(){channel.sendKeys("internal");}

    public void inputJti(){jti.sendKeys("123");}

    public void inputIp(){ip.sendKeys("123");}

    public FirstWindowObject inputButton(){
        inputButton.click();
        return new FirstWindowObject(driver);
    }

    public FirstWindowObject inputFirstWindow(String session){
        inputSessionId(session);
        inputWireMock();
        inputSub();
        inputCtxi();
        inputChannel();
        inputJti();
        inputIp();
        inputButton();
        return new FirstWindowObject(driver);
    }

}
