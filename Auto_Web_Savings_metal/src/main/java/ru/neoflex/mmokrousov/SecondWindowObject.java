package ru.neoflex.mmokrousov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondWindowObject {
    WebDriver driver;

    public SecondWindowObject(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/span")//Покупка слитков текст
    private WebElement textSaleBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div/span[2]")//Текст Руководства
    private WebElement textUser;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/button/div/div")//Текст ссылки на руководство
    private WebElement textLinkToManual;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/span")//Этапы итогового расчета текст
    private WebElement textStageFinalCalculate;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/span[1]")//Свяжитесь с золотым деском (УОГТСР)
    private WebElement textConnectionGoldDesc;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/span[2]")//Телефоны
    private WebElement textPhone;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/span[1]")//Текст заполните данные
    private WebElement textEnterData;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/span[2]")//Текст заполните данные_2
    private WebElement textEnterDataTwo;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/span")//Итоговый расчет текст
    private WebElement textFinalCalculate;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/label")//Валюта текст
    private WebElement textCurrency;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div/div[1]/div/div[1]/span")//Текст Рубль
    private WebElement fieldCurrencyRUB;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div/div[1]/div/div[1]")//Кнопка выплывающего списка валют
    private WebElement buttonCurrency;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/label")//Счет списания текст
    private WebElement textDebitAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div/div[1]/div/div[1]/span[1]")//Мастер счет
    private WebElement textMasterAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div/div[1]/div/div[1]/span[2]")//Сумма мастра счета
    private WebElement textSummAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[1]/label")//Тип слитка текст
    private WebElement textTypeBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[1]/div/div[1]")//Тип слитка поле
    private WebElement fieldTypeBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[1]/div/div[1]")//Кнопка выплывающего списка
    private WebElement buttonTypeBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[1]")//Мерный слиток
    private WebElement fieldMeasuredBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[1]")//Кнопка мерного слитка
    private WebElement buttonMeasuredBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[2]")//Стандартный слиток
    private WebElement fieldStandardBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[2]")//Кнопка стандартного слиток
    private WebElement buttonStandardBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[3]")//Стандартный и мерный слиток
    private WebElement fieldStandardAndMeasuresBullion;
    @FindBy(xpath = "/html/body/div[2]/div[2]/li[3]")//Кнопка стандартного и мерного слитока
    private WebElement buttonStandardAndMeasuresBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[2]/label")//Количество слитков текст
    private WebElement textAmountBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[2]/div/div[1]/input")//Количество слитков поле
    private WebElement fieldAmountBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/label")//Масса слитков текст
    private WebElement textMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[1]/input")//Масса слитков поле
    private WebElement fieldMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[1]/div/div[2]/div")//Граница массы слитков текст
    private WebElement textLimMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[2]/label")//Масса хим чистого золота текст
    private WebElement textMassChemicalGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[4]/div[2]/div/div[1]/input")//Масса хим чистого золота поле
    private WebElement fieldMassChemicalGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[5]/div[1]/label")//Курс золота за грамм текст
    private WebElement textCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[5]/div[1]/div/div[1]/input")//Курс золота за грамм поле
    private WebElement fieldCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[5]/div[2]/label")//На сумму текст
    private WebElement textFinalSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[5]/div[2]/div/div[1]/input")//На сумму поле
    private WebElement fieldFinalSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/span")//После покупки текст
    private WebElement textBeforeSale;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/fieldset/label[1]/span")//Слитки в банке текст
    private WebElement textBullionInBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/fieldset/label[1]/div/span")//Радиокнопка слитки в банке
    private WebElement radioButtonBullionInBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/fieldset/label[2]/span")//Слитки забрают с собой текст
    private WebElement textBullionNotBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/fieldset/label[2]/div/span")//Радиокнопка слитки забрают с собой текст
    private WebElement radioButtonBullionNotBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/div[1]/button")//Кнопка отмены
    private WebElement buttonCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/div[2]/div[1]/button")//Кнопка назад
    private WebElement buttonDown;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/div[2]/div[2]")//Кнопка продолжить
    private WebElement buttonNext;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/div[2]/div[2]/button[@disabled]")
    private WebElement buttonNextDis;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/div[2]/div[1]/button[@disabled]")//Кнопка назад
    private WebElement buttonDownDis;



    public String getTextSaleBullion(){return textSaleBullion.getText();}
    public String getTextUser(){return textUser.getText();}
    public String getTextLinkToManual(){return textLinkToManual.getText();}
    public String getTextStageFinalCalculate(){return textStageFinalCalculate.getText();}
    public String getTextConnectionGoldDesc(){return textConnectionGoldDesc.getText();}
    public String getTextPhone(){return textPhone.getText();}
    public String getTextEnterData(){return textEnterData.getText();}
    public String getTextEnterDataTwo(){return textEnterDataTwo.getText();}
    public String getTextFinalCalculate(){return textFinalCalculate.getText();}
    public String getTextCurrency(){return textCurrency.getText();}
    public String getFieldCurrencyRUB(){return fieldCurrencyRUB.getText();}
    public String getTextDebitAccount(){return textDebitAccount.getText();}
    public String getTextMasterAccount(){return textMasterAccount.getText();}
    public String getTextSummAccount(){return textSummAccount.getText();}
    public String getTextTypeBullion(){return textTypeBullion.getText();}
    public String getFieldTypeBullion(){return fieldTypeBullion.getText();}
    public void clickButtonTypeBullion(){
        try {
            Thread.sleep(1000);
            buttonTypeBullion.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getFieldMeasuredBullion(){return fieldMeasuredBullion.getText();}
    public void clickButtonMeasuredBullion(){buttonMeasuredBullion.click();}
    public String getFieldStandardBullion(){return fieldStandardBullion.getText();}
    public void clickButtonStandardBullion(){buttonStandardBullion.click();}
    public String getFieldStandardAndMeasuresBullion(){return fieldStandardAndMeasuresBullion.getText();}
    public void clickButtonStandardAndMeasuresBullion(){buttonStandardAndMeasuresBullion.click();}
    public String getTextAmountBullion(){return textAmountBullion.getText();}
    public String getFieldAmountBullion(){return fieldAmountBullion.getAttribute("placeholder");}
    public String getTextMassBullion(){return textMassBullion.getText();}
    public String getFieldMassBullion(){return fieldMassBullion.getAttribute("value");}
    public String getTextLimMassBullion(){return textLimMassBullion.getText();}
    public String getTextMassChemicalGold(){return textMassChemicalGold.getText();}
    public String getFieldMassChemicalGold(){return fieldMassChemicalGold.getAttribute("placeholder");}
    public String getTextCourseGold(){return textCourseGold.getText();}
    public String getFieldCourseGold(){return fieldCourseGold.getAttribute("value");}
    public String getTextFinalSumm(){return textFinalSumm.getText();}
    public String getFieldFinalSumm(){return fieldFinalSumm.getAttribute("value");}
    public String getTextBeforeSale(){return textBeforeSale.getText();}
    public String getTextBullionInBank(){return textBullionInBank.getText();}
    public Boolean getRadioButtonBullionInBank(){return radioButtonBullionInBank.isSelected();}
    public String getTextBullionNotBank(){return textBullionNotBank.getText();}
    public void clickRadioButtonBullionInBank(){radioButtonBullionInBank.click();}
    public Boolean getRadioButtonBullionNotBank(){return radioButtonBullionNotBank.isSelected();}
    public void clickRadioButtonBullionNotBank(){radioButtonBullionNotBank.click();}
    public void clickButtonCancel(){buttonCancel.click();}
    public Boolean isButtonCancel(){return buttonCancel.isEnabled();}
    public void clickButtonDown(){buttonDown.click();}
    public Boolean isButtonDown(){return buttonDown.isEnabled();}
    public void clickButtonNext(){buttonNext.click();}
    public Boolean isButtonNext(){return buttonNext.isEnabled();}
}
