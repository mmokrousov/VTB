package ru.neoflex.mmokrousov;

import com.beust.ah.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/span")//Данные сотрудника для подписания договора
    private WebElement textEmployee;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/label")//Текст должность в род падеже
    private WebElement textJodTitleEmployee;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div/div[1]/input")//Поле должность в род падеже
    private WebElement fieldJodTitleEmployee;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div[1]/label")//Текст Ф.И.О. в родительном падеже
    private WebElement textFullNameEmployee;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div[1]/div/div[1]/input")//Поле Ф.И.О. в родительном падеже
    private WebElement fieldFullNameEmployee;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[1]/label")//Текст номер доверенности
    private WebElement textNumberAttorney;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[1]/div/div[1]/input")//Поле номер доверенности
    private WebElement fieldNumberAttorney;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div[2]/label")//Текст Фамилия и инициалы
    private WebElement textSecondNameAndInitials;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div[2]/div/div[1]/input")//Поле Фамилия и инициалы
    private WebElement fieldSecondNameAndInitials;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[2]/label")//Текст Дата выдачи доверенности
    private WebElement textDateOfIssueAttorney;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div")//Календарь для даты выдачи доверенности
    private WebElement calendarDateOfIssueAttorney;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[1]/div[6]")//Число календаря
    private WebElement numberСalendar;
    @FindBy(xpath = "/html/body/div/form/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/input")//Поле Дата выдачи доверенности
    private WebElement fieldDateOfIssueAttorney;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/span")//Итоговый расчет текст
    private WebElement textFinalCalculate;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/div/label")//Валюта текст
    private WebElement textCurrency;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/div/div/div[1]/div/div[1]/span")//Текст Рубль
    private WebElement fieldCurrencyRUB;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/div/div/div[1]/div/div[1]")//Кнопка выплывающего списка валют
    private WebElement buttonCurrency;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/div/div/div[1]")//Проверка активности кнопки валюты
    private WebElement buttonRequired;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[2]/div/label")//Счет списания текст
    private WebElement textDebitAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[2]/div/div/div[1]/div/div[1]/span[1]")//Мастер счет
    private WebElement textMasterAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[2]/div/div/div[1]/div/div[1]/span[2]")//Сумма мастра счета
    private WebElement textSummAccount;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[1]/label")//Тип слитка текст
    private WebElement textTypeBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[1]/div/div[1]")//Тип слитка поле
    private WebElement fieldTypeBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[1]/div/div[1]")//Кнопка выплывающего списка
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
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[2]/label")//Количество слитков текст
    private WebElement textAmountBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[2]/div/div[1]/input")//Количество слитков поле
    private WebElement fieldAmountBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[3]/div[2]/div/div[2]/div")//Количество слитков поле (обязательно для заполнения)
    private WebElement textRequiredAmountBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[1]/label")//Масса слитков текст
    private WebElement textMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[1]/div/div[1]/input")//Масса слитков поле
    private WebElement fieldMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[1]/div/div[2]/div")//Масса слитков (обязательно для заполнения)
    private WebElement textRequiredMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[1]/div/div[2]/div")//Граница массы слитков текст
    private WebElement textLimMassBullion;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[2]/label")//Масса хим чистого золота текст
    private WebElement textMassChemicalGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[2]/div/div[1]/input")//Масса хим чистого золота поле
    private WebElement fieldMassChemicalGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[4]/div[2]/div/div[2]/div")//Масса хим чистого золота поле (обязательно для заполнения)
    private WebElement textRequiredMassChemicalGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[5]/div[1]/label")//Курс золота за грамм текст
    private WebElement textCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[5]/div[1]/div/div[1]/input")//Курс золота за грамм поле
    private WebElement fieldCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[5]/div[1]/div/div[2]/div")//Курс золота за грамм поле (обязательно для заполнения)
    private WebElement textRequiredCourseGold;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[5]/div[2]/label")//На сумму текст
    private WebElement textFinalSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[5]/div[2]/div/div[1]/input")//На сумму поле
    private WebElement fieldFinalSumm;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/span")//После покупки текст
    private WebElement textBeforeSale;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/fieldset/label[1]/span")//Слитки в банке текст
    private WebElement textBullionInBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/fieldset/label[1]/div/span")//Радиокнопка слитки в банке
    private WebElement radioButtonBullionInBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/fieldset/label[2]/span")//Слитки забрают с собой текст
    private WebElement textBullionNotBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[3]/fieldset/label[2]/div/span")//Радиокнопка слитки забрают с собой текст
    private WebElement radioButtonBullionNotBank;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[4]/div[1]/button")//Кнопка отмены
    private WebElement buttonCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[4]/div[2]/div[1]/button")//Кнопка назад
    private WebElement buttonDown;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[4]/div[2]/div[2]")//Кнопка продолжить
    private WebElement buttonNext;

    public WebElement getButtonTypeBullion() {
        return buttonTypeBullion;
    }

    public WebElement getButtonMeasuredBullion() {
        return buttonMeasuredBullion;
    }

    public WebElement getButtonStandardBullion() {
        return buttonStandardBullion;
    }

    public WebElement getButtonStandardAndMeasuresBullion() {
        return buttonStandardAndMeasuresBullion;
    }

    public WebElement getFieldJodTitleEmployee() {
        return fieldJodTitleEmployee;
    }

    public WebElement getFieldFullNameEmployee() {
        return fieldFullNameEmployee;
    }

    public WebElement getFieldNumberAttorney() {
        return fieldNumberAttorney;
    }

    public WebElement getFieldSecondNameAndInitials() {
        return fieldSecondNameAndInitials;
    }

    public WebElement getFieldDateOfIssueAttorney() {
        return fieldDateOfIssueAttorney;
    }

    public WebElement getFieldCurrencyRUB() {
        return fieldCurrencyRUB;
    }

    public WebElement getFieldAmountBullion() {
        return fieldAmountBullion;
    }

    public WebElement getFieldMassBullion() {
        return fieldMassBullion;
    }

    public WebElement getFieldMassChemicalGold() {
        return fieldMassChemicalGold;
    }

    public WebElement getFieldCourseGold() {
        return fieldCourseGold;
    }

    public WebElement getFieldFinalSumm() {
        return fieldFinalSumm;
    }

    public ThirdWindowObject clickNext(){
        buttonNext.click();
        return new ThirdWindowObject(driver);
    }

    public void headerBlock(){
        Assert.assertEquals("Покупка слитков", textSaleBullion.getText());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", textUser.getText());
        Assert.assertEquals("Открыть руководство", textLinkToManual.getText());
        Assert.assertEquals("Этапы итогового расчета", textStageFinalCalculate.getText());
        Assert.assertEquals("Свяжитесь с золотым деском (УОГТСР)", textConnectionGoldDesc.getText());
        Assert.assertEquals("Запросите наличие массы и актуальный курс в УОГТСР по номеру телефона +7 (999) 999 99 99, +7 (495) 589 21 55.", textPhone.getText());
        Assert.assertEquals("Заполните данные в итоговом расчете", textEnterData.getText());
        Assert.assertEquals("Количество, тип слитков, курс, масса, масса химически чистого золота. Озвучьте клиенту полученные параметры.", textEnterDataTwo.getText());
        Assert.assertEquals("Итоговый расчет", textFinalCalculate.getText());
        Assert.assertEquals(null, buttonNext.getAttribute("disabled"));
    }

    public void employeeBlock(){
        Assert.assertEquals("Данные сотрудника для подписания договора", textEmployee.getText());
        Assert.assertEquals("Должность в родительном падеже", textJodTitleEmployee.getText());
        Assert.assertEquals("", fieldJodTitleEmployee.getAttribute("value"));
        Assert.assertEquals("Ф.И.О. в родительном падеже", textFullNameEmployee.getText());
        Assert.assertEquals("", fieldFullNameEmployee.getAttribute("value"));
        Assert.assertEquals("Номер доверенности", textNumberAttorney.getText());
        Assert.assertEquals("", fieldNumberAttorney.getAttribute("value"));
        Assert.assertEquals("Фамилия и инициалы", textSecondNameAndInitials.getText());
        Assert.assertEquals("", fieldSecondNameAndInitials.getAttribute("value"));
        Assert.assertEquals("Дата выдачи доверенности", textDateOfIssueAttorney.getText());
        Assert.assertEquals("__.__.____", fieldDateOfIssueAttorney.getAttribute("value"));
    }

    public void currency(String currency){
        Assert.assertEquals("Валюта", textCurrency.getText());
        Assert.assertEquals(currency, fieldCurrencyRUB.getText());
        Assert.assertEquals("true", buttonRequired.getAttribute("data-disabled"));
    }

    public void accountBlock(String money){
        money = money.replace(" ", "");
        money = money.substring(0, money.length()-3);
        String moneyTwo = textSummAccount.getText().replace(" ", "");
        moneyTwo = moneyTwo.substring(0, money.length());
        Assert.assertEquals("Счет списания", textDebitAccount.getText());
        Assert.assertEquals("Текущий счет • 7949", textMasterAccount.getText());
        Assert.assertEquals(money, moneyTwo);
    }

    public void typeBullion(){
        Assert.assertEquals("Тип слитка", textTypeBullion.getText());
        Assert.assertEquals("Выберите тип слитка", fieldTypeBullion.getText());
    }

    public void massBullion(String mass){
        Assert.assertEquals("Масса слитков", textMassBullion.getText());
        Assert.assertEquals(mass, fieldMassBullion.getAttribute("value"));
        Assert.assertEquals("до 100 000 г", textLimMassBullion.getText());
    }

    public void courseGoldToGram(){
        Assert.assertEquals("Курс золота за грамм", textCourseGold.getText());
        Assert.assertEquals("4 045,3 ₽", fieldCourseGold.getAttribute("value"));
    }

    public void amountBullion(){
        Assert.assertEquals("Количество слитков", textAmountBullion.getText());
        Assert.assertEquals("0 шт", fieldAmountBullion.getAttribute("placeholder"));
    }

    public void massChemicPureGold(){
        Assert.assertEquals("Масса химически чистого золота", textMassChemicalGold.getText());
        Assert.assertEquals("0 г", fieldMassChemicalGold.getText());
    }

    public void onSumma(String summa){
        summa = summa.replace(" ", "");
        String summaTwo = fieldFinalSumm.getAttribute("value").replace(" ", "");
        Assert.assertEquals("На сумму", textFinalSumm.getText());
        Assert.assertEquals(summa, summaTwo);
    }

    public void afterSale(){
        Assert.assertEquals("После покупки", textBeforeSale.getText());
        Assert.assertEquals("Слитки остаются на хранение в банке", textBullionInBank.getText());
        Assert.assertEquals(null, buttonNext.getAttribute("disabled"));
        Assert.assertEquals(null, radioButtonBullionInBank.getAttribute("checked"));
    }

    public void clearField(){
        try {
            fieldAmountBullion.sendKeys("0");
            fieldMassBullion.sendKeys(Keys.chord(Keys.CONTROL, "a"), "55");//sendKeys("1");
            fieldMassChemicalGold.sendKeys("0");
            fieldCourseGold.sendKeys("1");
            Thread.sleep(1000);
            Assert.assertEquals("Обязательно для заполнения", textRequiredMassBullion.getText());
            Assert.assertEquals("Обязательно для заполнения", textRequiredCourseGold.getText());
            Assert.assertEquals("Обязательно для заполнения", textRequiredAmountBullion.getText());
            Assert.assertEquals("Масса не может равняться 0 г", textRequiredMassChemicalGold.getText());
            Assert.assertEquals(null, buttonNext.getAttribute("disabled"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void limMassChemicalGold(String mass){
        fieldMassChemicalGold.sendKeys(mass);
        fieldAmountBullion.sendKeys("1");
        Assert.assertEquals("Масса химически чистого золота не может превышать Массу слитков", textRequiredMassChemicalGold.getText());
        Assert.assertEquals(null, buttonNext.getAttribute("disabled"));
    }

    public void selectTypeBullion(WebElement currentType, String textNeedType, WebElement needType){
        try {
            currentType.click();
            Thread.sleep(500);
            Assert.assertEquals(textNeedType,needType.getText());
            needType.click();
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectNumberCalender(){
        try {
            calendarDateOfIssueAttorney.click();
            Thread.sleep(500);
            numberСalendar.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void inaccessibilityButtonNext(){
        Assert.assertEquals(null, buttonNext.getAttribute("disabled"));
    }

    public void inputElement(WebElement element, String data){
        element.sendKeys(data);
    }

    public void inputFullData(){
        fieldJodTitleEmployee.sendKeys("Руководитель направления");
        fieldFullNameEmployee.sendKeys("Иванов Иван Иванович");
        fieldNumberAttorney.sendKeys("174-АР-47-PG");
        fieldSecondNameAndInitials.sendKeys("Иванов И.И.");
        selectNumberCalender();
        selectTypeBullion(getButtonTypeBullion(), "Мерный", getButtonMeasuredBullion());
        fieldAmountBullion.sendKeys("1");
        fieldMassChemicalGold.sendKeys("1000");
    }

}
