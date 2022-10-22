package ru.neoflex.mmokrousov;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdWindowObject {
    WebDriver driver;

    public ThirdWindowObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/span")//Покупка слитков (текст)
    private WebElement textSaleBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/span[2]/span")//Подтвердить сделку (текст)
    private WebElement textConfirmDeal;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/button/div/div")//Ссылка на руководство (текст)
    private WebElement textLinkUser;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[1]/span")//Номер договора (текст)
    private WebElement textNumberContract;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[2]/span")//Номер договора (поле)
    private WebElement fieldNumberContract;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/span")//ФИО клиента (текст)
    private WebElement textFullNameClient;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/span")//ФИО клиента (поле)
    private WebElement fieldFullNameClient;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/div[1]/span")//Дата рождение (текст)
    private WebElement textBirthDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/div[2]/span")//Дата рождение (поле)
    private WebElement fieldBirthDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div[1]/span")//Место рождение (текст)
    private WebElement textBirthPlace;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div[2]/span")//Место рождение (поле)
    private WebElement fieldBirthPlace;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[5]/div[1]/span")//Данные паспорта (текст)
    private WebElement textPassportData;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[5]/div[2]/span")//Данные паспорта (поле)
    private WebElement fieldPassportData;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[6]/div[1]/span")//Адрес регистрации (текст)
    private WebElement textRegAddress;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[6]/div[2]/span")//Адрес регистрации (поле)
    private WebElement fieldRegAddress;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[7]/div[1]/span")//Курс золота (текст)
    private WebElement textCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[7]/div[2]/span")//Курс золота (поле)
    private WebElement fieldCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[8]/div[1]/span")//Масса слитка, граммы (текст)
    private WebElement textMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[8]/div[2]/span")//Масса слитка, граммы (поле)
    private WebElement fieldMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[9]/div[1]/span")//Масса хим чистого золота (текст)
    private WebElement textMassChemGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[9]/div[2]/span")//Масса хим чистого золота (поле)
    private WebElement fieldMassChemGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[10]/div[1]/span")//На сумму (текст)
    private  WebElement textSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[10]/div[2]/span")//На сумму (поле)
    private   WebElement fieldSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[11]/div[1]/span")//После покупки (текст)
    private  WebElement textAfterSale;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[11]/div[2]/span")//После покупки (поле)
    private  WebElement fieldAfterSale;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/button")//Кнопка завершить
    private WebElement buttonCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/button")//Кнопка назад
    private WebElement buttonDown;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[2]/button")//Кнопка Скопировать
    private WebElement buttonCopy;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[3]/button")//Кнопка Продолжить
    private WebElement buttonNext;

    public void visibleElement(){
        Assert.assertEquals(true, textConfirmDeal.isDisplayed());
    }

    public void basicCheck(){
        Assert.assertEquals("Номер договора", textNumberContract.getText());
        Assert.assertEquals(true, fieldNumberContract.getText().contains("GLD0000"));
        Assert.assertEquals("Ф.И.О. клиента", textFullNameClient.getText());
        Assert.assertEquals("ГеральдГеральд ОбворожительныйОбворожительный ПетровичПетрович", fieldFullNameClient.getText());
        Assert.assertEquals("Дата рождения", textBirthDate.getText());
        Assert.assertEquals("27 мая 2000", fieldBirthDate.getText());
        Assert.assertEquals("Место рождения", textBirthPlace.getText());
        Assert.assertEquals("Комсомольск-на-Амурееееывапролджлорпsdfjjgfdg", fieldBirthPlace.getText());
        Assert.assertEquals("Паспортные данные", textPassportData.getText());
        Assert.assertEquals("45 10 192837, выдан 10.10.2007, Отделом УФМС России по Белгородской области в Белгородском районеxcjlkjhgfdfghjkmnbvcvb, код подразделения 770-110", fieldPassportData.getText());
        Assert.assertEquals("Адрес регистрации", textRegAddress.getText());
        Assert.assertEquals("Москва, Центральный Проезд Хорошёвского Серебряного Бора, дом 20", fieldRegAddress.getText());
        Assert.assertEquals("Курс золота", textCourseGold.getText());
        Assert.assertEquals("4 045,30 ₽ за 1г", fieldCourseGold.getText());
        Assert.assertEquals("Масса слитка, граммы", textMassBullion.getText());
        Assert.assertEquals("1 000 г", fieldMassBullion.getText());
        Assert.assertEquals("Масса хим чистого золота", textMassChemGold.getText());
        Assert.assertEquals("1 000 г", fieldMassChemGold.getText());
        Assert.assertEquals("На сумму", textSumm.getText());
        Assert.assertEquals("4 045 300,00 ₽", fieldSumm.getText());
        Assert.assertEquals("После покупки", textAfterSale.getText());
        Assert.assertEquals("Слитки остаются на хранение в банке", fieldAfterSale.getText());
    }

}
