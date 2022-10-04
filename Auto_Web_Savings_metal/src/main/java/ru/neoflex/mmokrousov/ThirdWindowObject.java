package ru.neoflex.mmokrousov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdWindowObject {
    WebDriver driver;

    public ThirdWindowObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/span")//Покупка слитков (текст)
    WebElement textSaleBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/span[2]")//Подтвердить сделку (текст)
    WebElement textConfirmDeal;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/button/div/div")//Ссылка на руководство (текст)
    WebElement textLinkUser;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[1]/span")//Номер договора (текст)
    WebElement textNumberContract;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[2]/span")//Номер договора (поле)
    WebElement fieldNumberContract;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/span")//ФИО клиента (текст)
    WebElement textFullNameClient;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/span")//ФИО клиента (поле)
    WebElement fieldFullNameClient;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/div[1]/span")//Дата рождение (текст)
    WebElement textBirthDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[3]/div[2]/span")//Дата рождение (поле)
    WebElement fieldBirthDate;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div[1]/span")//Место рождение (текст)
    WebElement textBirthPlace;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[4]/div[2]/span")//Место рождение (поле)
    WebElement fieldBirthPlace;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[5]/div[1]/span")//Данные паспорта (текст)
    WebElement textPassportData;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[5]/div[2]/span")//Данные паспорта (поле)
    WebElement fieldPassportData;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[6]/div[1]/span")//Адрес регистрации (текст)
    WebElement textRegAddress;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[6]/div[2]/span")//Адрес регистрации (поле)
    WebElement fieldRegAddress;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[7]/div[1]/span")//Курс золота (текст)
    WebElement textCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[7]/div[2]/span")//Курс золота (поле)
    WebElement fieldCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[8]/div[1]/span")//Масса слитка, граммы (текст)
    WebElement textMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[8]/div[2]/span")//Масса слитка, граммы (поле)
    WebElement fieldMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[9]/div[1]/span")//Масса хим чистого золота (текст)
    WebElement textMassChemGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[9]/div[2]/span")//Масса хим чистого золота (поле)
    WebElement fieldMassChemGold;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[10]/div[1]/span")//На сумму (текст)
    WebElement textSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[10]/div[2]/span")//На сумму (поле)
    WebElement fieldSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[11]/div[1]/span")//После покупки (текст)
    WebElement textAfterSale;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[11]/div[2]/span")//После покупки (поле)
    WebElement fieldAfterSale;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[1]/button")//Кнопка завершить
    WebElement buttonCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[1]/button")//Кнопка назад
    WebElement buttonDown;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[2]/button")//Кнопка Скопировать
    WebElement buttonCopy;
    @FindBy(xpath = "//*[@id=\"root\"]/div[3]/div[2]/div[3]/button")//Кнопка Продолжить
    WebElement buttonNext;


}
