import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.UUID;


public class MainPageTest extends BaseTest {

    //Базовая проверка
    @Test
    public void FirstWindowTest_1() {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        otherDULPage.clickButton();
        firstWindowObject.headerBlock();
        firstWindowObject.currency("Рубль", firstWindowObject.getTextButtonCurrencyRUB());
        firstWindowObject.accountBlock();
        firstWindowObject.preCourseGoldRUB();
        firstWindowObject.massBullion();
        firstWindowObject.onSummaRUB();

        //Проверка Доллара
        firstWindowObject.selectCurrency("Доллар", firstWindowObject.getButtonCurrencyRUB(), firstWindowObject.getFieldCurrencyUSD());
        firstWindowObject.preCourseGoldUSD();

        //Проверка Евро
        firstWindowObject.selectCurrency("Евро", firstWindowObject.getButtonCurrencyUSD(), firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.preCourseGoldEUR();
    }

    //Отказано
    @Test
    public void FirstWindowTest_2() throws InterruptedException {
        authorizationPage.inputFirstWindow("FirstBLDeny" + UUID.randomUUID());
        firstWindowObject.headerBlock();
        firstWindowObject.headerBlockCheck("RUB");
        firstWindowObject.currency("Рубль", firstWindowObject.getTextButtonCurrencyRUB());
        firstWindowObject.accountBlock();
        firstWindowObject.preCourseGoldRUB();
        firstWindowObject.massBullion();
        firstWindowObject.onSummaRUB();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.selectCurrency("Доллар", firstWindowObject.getButtonCurrencyRUB(), firstWindowObject.getFieldCurrencyUSD());
        firstWindowObject.headerBlockCheck("USD");
        firstWindowObject.preCourseGoldUSD();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.selectCurrency("Евро", firstWindowObject.getButtonCurrencyUSD(), firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.headerBlockCheck("EUR");
        firstWindowObject.preCourseGoldEUR();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

    }

    //Недостаточно средств
    @Test
    public void FirstWindowTest_3() throws InterruptedException {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setMassBullion("100000");
        firstWindowObject.headerBlock();
        firstWindowObject.currency("Рубль", firstWindowObject.getTextButtonCurrencyRUB());
        firstWindowObject.accountBlockNoMoney();
        firstWindowObject.massBullion();
        firstWindowObject.onSummaRUB();
    }

    //Отсутствует счет
    @Test
    public void FirstWindowTest_4() throws InterruptedException {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.selectCurrency("Доллар", firstWindowObject.getButtonCurrencyRUB(), firstWindowObject.getFieldCurrencyUSD());
        firstWindowObject.preCourseGoldUSD();
        Assert.assertEquals("Для покупки слитков нужен текущий счет. Откройте его – это бесплатно.", firstWindowObject.getTextNoAccount());
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }


    //Арбитраж отказано
    @Test
    public void FirstWindowTest_5() throws InterruptedException {
        authorizationPage.inputFirstWindow("FirstBLArbDn" + UUID.randomUUID());
        firstWindowObject.headerBlock();
        firstWindowObject.headerBlockCheckArbDeny("RUB");
        firstWindowObject.currency("Рубль", firstWindowObject.getTextButtonCurrencyRUB());
        firstWindowObject.onSummaRUB();
        firstWindowObject.preCourseGoldRUB();
        firstWindowObject.accountBlock();
        firstWindowObject.massBullion();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.selectCurrency("Доллар", firstWindowObject.getButtonCurrencyRUB(), firstWindowObject.getFieldCurrencyUSD());
        firstWindowObject.headerBlockCheckArbDeny("USD");
        firstWindowObject.preCourseGoldUSD();
        firstWindowObject.onSummaUSD();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.selectCurrency("Евро", firstWindowObject.getButtonCurrencyUSD(), firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.headerBlockCheckArbDeny("EUR");
        firstWindowObject.preCourseGoldEUR();
        firstWindowObject.onSummaEUR();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }

    //Арбитраж в работе
    @Test
    public void FirstWindowTest_6() throws InterruptedException {
        authorizationPage.inputFirstWindow("FirstBLArbIW" + UUID.randomUUID());

        firstWindowObject.headerBlock();
        firstWindowObject.headerBlockCheckArbInWork("RUB");
        firstWindowObject.currency("Рубль", firstWindowObject.getTextButtonCurrencyRUB());
        firstWindowObject.onSummaRUB();
        firstWindowObject.preCourseGoldRUB();
        firstWindowObject.accountBlock();
        firstWindowObject.massBullion();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.selectCurrency("Доллар", firstWindowObject.getButtonCurrencyRUB(), firstWindowObject.getFieldCurrencyUSD());
        firstWindowObject.headerBlockCheckArbInWork("USD");
        firstWindowObject.preCourseGoldUSD();
        firstWindowObject.onSummaUSD();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.selectCurrency("Евро", firstWindowObject.getButtonCurrencyUSD(), firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.headerBlockCheckArbInWork("EUR");
        firstWindowObject.preCourseGoldEUR();
        firstWindowObject.onSummaEUR();
        firstWindowObject.setMassBullion("1000");
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }

    //Обязательно для заполнения
    @Test
    public void FirstWindowTest_7() throws InterruptedException {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.clickButtonNext();
        Thread.sleep(1000);
        firstWindowObject.accountBlock();
        firstWindowObject.requiredField();

    }

    //2-ой экран общая проверка
    @Test
    public void SecondWindowTest_1(){
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setMassBullion("1000");
        List <String> cache = firstWindowObject.cache();
        firstWindowObject.clickButtonNext();
        secondWindowObject.headerBlock();
        secondWindowObject.employeeBlock();
        secondWindowObject.currency("Рубль");
        secondWindowObject.accountBlock(cache.get(0));
        secondWindowObject.typeBullion();
        secondWindowObject.massBullion(cache.get(1));
        secondWindowObject.courseGoldToGram();
        secondWindowObject.amountBullion();
        secondWindowObject.massChemicPureGold();
        secondWindowObject.onSumma(cache.get(2));
        secondWindowObject.afterSale();
    }

    //2-ой экран Обязательные поля (ошибки)
    @Test
    public void SecondWindowTest_2() {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setMassBullion("1000");
        firstWindowObject.clickButtonNext();
        secondWindowObject.clearField();
        secondWindowObject.selectTypeBullion(secondWindowObject.getButtonTypeBullion(), "Стандартный", secondWindowObject.getButtonStandardBullion());
        secondWindowObject.clearField();
        secondWindowObject.selectTypeBullion(secondWindowObject.getButtonTypeBullion(), "Мерный и стандартный", secondWindowObject.getButtonStandardAndMeasuresBullion());
        secondWindowObject.clearField();
        secondWindowObject.selectTypeBullion(secondWindowObject.getButtonTypeBullion(), "Мерный", secondWindowObject.getButtonMeasuredBullion());
        secondWindowObject.limMassChemicalGold("10000");
    }

    //Недоступность кнопки продолжить
    @Test
    public void SecondWindowTest_3() {
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setMassBullion("1000");
        firstWindowObject.clickButtonNext();
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldJodTitleEmployee(), "Руководитель направления");
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldFullNameEmployee(), "Иванов Иван Иванович");
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldNumberAttorney(), "174-АР-47-PG");
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldSecondNameAndInitials(), "Иванов И.И.");
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.selectNumberCalender();
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.selectTypeBullion(secondWindowObject.getButtonTypeBullion(), "Мерный", secondWindowObject.getButtonMeasuredBullion());
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldAmountBullion(), "1");
        secondWindowObject.inaccessibilityButtonNext();
        secondWindowObject.inputElement(secondWindowObject.getFieldMassChemicalGold(), "1000");
        secondWindowObject.clickNext();
        thirdWindowObject.visibleElement();

    }

    //3-ий экран
    @Test
    public void ThirdWindowTest_1(){
        authorizationPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setMassBullion("1000");
        firstWindowObject.clickButtonNext();
        secondWindowObject.inputFullData();
        secondWindowObject.clickNext();
        thirdWindowObject.basicCheck();

    }

}
