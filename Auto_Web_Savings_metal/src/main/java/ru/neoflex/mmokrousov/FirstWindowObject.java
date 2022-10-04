package ru.neoflex.mmokrousov;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstWindowObject {
    WebDriver driver;

    public FirstWindowObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/span")//Покупка слитков текст
    WebElement textSaleBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/span[2]")//Руководство текст
    WebElement textUser;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/button/div")//Ссылка на руководство текст
    WebElement linkToManual;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/span")//Предварительный расчет текст
    WebElement textPreCalculate;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div[2]/div")//Отсутсвует счет текст
    WebElement textNoAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div/div/span[1]")//Отказ текст
    WebElement textDeny;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div/div/span[2]")//Сообщение отказа текст
    WebElement textDenyMessage;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/label")//Валюта текст
    WebElement textCurrency;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div[1]/div/div[1]")//Выплывающий список RUB поле
    WebElement buttonCurrencyRUB;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[1]")//Выбор Рубль
    WebElement fieldCurrencyRUB;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div[1]/div")//Выплывающий список USD поле
    WebElement buttonCurrencyUSD;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[2]")//Выбор Доллар
    WebElement fieldCurrencyUSD;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div[1]/div")//Выплывающий список EUR поле
    WebElement buttonCurrencyEUR;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[3]")//Выбор Евро
    WebElement fieldCurrencyEUR;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/label")// Счет списания текст
    WebElement fieldDebitAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div[1]/div/div[1]/span[1]") //Мастер счет поле
    WebElement fieldMasterAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div[1]/div/div[1]/span[2]") //Мастер счет сумма поле
    WebElement fieldMasterAccountSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div[2]/div")//Недостаточно средств текст
    WebElement textLowMoney;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div/label")//Предварительный курс золота текст
    WebElement textCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div/div/div[1]/input")//Предварительный курс золота поле
    WebElement fieldCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/label")//Масса слитков текст
    WebElement textMass;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[1]/input")//Масса слитков поле
    WebElement fieldMass;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[2]/div")//Обязательно для заполнения Масса текст
    WebElement textRequiredMass;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[2]/label")//На сумму текст
    WebElement textSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[2]/div/div[1]/input")//На сумму поле
    WebElement fieldSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[2]/div")//Обязательно для заполнения Сумма текст
    WebElement textRequiredSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[2]/div")
    WebElement textBefore;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/button")
    WebElement buttonCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[2]/div/button")
    WebElement buttonNext;

    public WebElement getButtonCurrencyRUB() {return buttonCurrencyRUB;}

    public WebElement getButtonCurrencyUSD() {return buttonCurrencyUSD;}

    public WebElement getFieldCurrencyUSD() {return fieldCurrencyUSD;}

    public WebElement getFieldCurrencyEUR() {return fieldCurrencyEUR;}



    public String getTextSaleBullion(){return textSaleBullion.getText();}

    public String getTextUser(){return textUser.getText();}

    public String getTextPreCalculate(){return textPreCalculate.getText();}

    public String getTextNoAccount(){return textNoAccount.getText();}

    public String getTextDeny(){return textDeny.getText();}

    public String getTextDenyMessage(){return textDenyMessage.getText();}

    public String getTextCurrency(){return textCurrency.getText();}

    public String getTextButtonCurrencyRUB(){return buttonCurrencyRUB.getText();}

    public void clickButtonCurrencyRUB(){buttonCurrencyRUB.click();}

    public String getFieldElementCurrencyUSD(){
        try {
            Thread.sleep(1000);
            return fieldCurrencyUSD.getText();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void clickButtonCurrencyUSD(){
        try {
            fieldCurrencyUSD.click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickButtonCurrencyEUR(){buttonCurrencyEUR.click();}

    public String getFieldDebitAccount(){return fieldDebitAccount.getText();}

    public String getFieldMasterAccount(){return fieldMasterAccount.getText();}

    public String getFieldMasterAccountSumm(){return fieldMasterAccountSumm.getText();}

    public String getTextLowMoney(){return textLowMoney.getText();}

    public String getTextLowMoneyColor(){return textLowMoney.getCssValue("color");}

    public String getTextCourseGold(){return textCourseGold.getText();}

    public String getFieldCourseGold(){return fieldCourseGold.getAttribute("value");}

    public String getTextMass(){return textMass.getText();}

    public String getFieldMass(String atr){return fieldMass.getAttribute(atr);}

    public void setFieldMass(String mass){fieldMass.sendKeys(mass);}

    public String getTextRequiredMass(){return textRequiredMass.getText();}

    public String getTextSumm(){return textSumm.getText();}

    public String getFieldSumm(String atr){return fieldSumm.getAttribute(atr);}

    public void clickFieldSumm(){fieldSumm.click();}

    public void setElementSumm(String summ){fieldSumm.sendKeys(summ);}

    public String getTextRequiredSumm(){return textRequiredSumm.getText();}

    public String getTextBefore(){return textBefore.getText();}

    public Boolean isButtonNext(){return buttonNext.isEnabled();}

    public SecondWindowObject clickButtonNext(){
        buttonNext.click();
        return new SecondWindowObject(driver);
    }

    public void headerBlock(){
        Assert.assertEquals("Покупка слитков", getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", getTextUser());
        Assert.assertEquals("Предварительный расчет", getTextPreCalculate());
    }

    public void accountBlock(){
        Assert.assertEquals("Счет списания", getFieldDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", getFieldMasterAccountSumm());
    }

    public void preCourseGoldRUB(){
        Assert.assertEquals("Предварительный курс золота", getTextCourseGold());
        Assert.assertEquals("4 045,30 ₽ за 1 г", getFieldCourseGold());
    }

    public void preCourseGoldUSD(){
        Assert.assertEquals("0,00 $", getFieldSumm("placeholder"));
        Assert.assertEquals("45,67 $ за 1 г", getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", getTextBefore());
    }

    public void preCourseGoldEUR(){
        Assert.assertEquals("0,00 €", getFieldSumm("placeholder"));
        Assert.assertEquals("34,23 € за 1 г", getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", getTextBefore());
    }

    public void currency(String currency, String currencyElement){
        Assert.assertEquals("Валюта", getTextCurrency());
        Assert.assertEquals(currency, currencyElement);
    }

    public void massBullion(){
        Assert.assertEquals("Масса слитков", getTextMass());
        Assert.assertEquals("0 г", getFieldMass("placeholder"));
        Assert.assertEquals("до 100 824 г", getTextBefore());
    }

    public void onSummaRUB(){
        Assert.assertEquals("На сумму", getTextSumm());
        Assert.assertEquals("0,00 ₽", getFieldSumm("placeholder"));
    }

    public void selectCurrency(String currency, WebElement clickButtonCurrencyNow, WebElement clickButtonCurrencyNeed){
        try {
            clickButtonCurrencyNow.click();
            Thread.sleep(2000);
            Assert.assertEquals(currency, getFieldElementCurrencyUSD());
            clickButtonCurrencyNeed.click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
