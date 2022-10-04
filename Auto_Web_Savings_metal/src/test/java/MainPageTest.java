import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import java.util.UUID;


public class MainPageTest extends BaseTest{

    //Базовая проверка
    @Test
    public void FirstWindowTest_1(){
        mainPage.inputFirstWindow("First" + UUID.randomUUID());
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
/*
    //Отказано
    @Test
    public void FirstWindowTest_2() throws InterruptedException {
        mainPage.inputFirstWindow("FirstBLDeny" + UUID.randomUUID());

        Assert.assertEquals("Покупка слитков", firstWindowObject.getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", firstWindowObject.getTextUser());
        //Проверка, что при нажатии на кнопку "Открыть инструкцию" открывается новое окно
        Assert.assertEquals("Предварительный расчет", firstWindowObject.getTextPreCalculate());
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("RUB: Отказано без объяснения причины", firstWindowObject.getTextDenyMessage());

        Assert.assertEquals("Валюта", firstWindowObject.getTextCurrency());
        Assert.assertEquals("Рубль", firstWindowObject.getFieldCurrency());

        Assert.assertEquals("На сумму", firstWindowObject.getTextSumm());
        Assert.assertEquals("0,00 ₽", firstWindowObject.getFieldSumm("placeholder"));

        Assert.assertEquals("Предварительный курс золота", firstWindowObject.getTextCourseGold());
        Assert.assertEquals("4 045,30 ₽ за 1 г", firstWindowObject.getFieldCourseGold());

        Assert.assertEquals("Счет списания", firstWindowObject.getFieldDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", firstWindowObject.getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", firstWindowObject.getFieldMasterAccountSumm());

        Assert.assertEquals("Масса слитков", firstWindowObject.getTextMass());
        Assert.assertEquals("0 г", firstWindowObject.getFieldMass("placeholder"));

        Assert.assertEquals("до 100 000 г", firstWindowObject.getTextBefore());

        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.clickButtonCurrency();
        Thread.sleep(1000);
        Assert.assertEquals("Доллар", firstWindowObject.getFieldElementCurrencyUSD());
        firstWindowObject.clickButtonCurrencyUSD();
        Thread.sleep(3000);
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("USD: Отказано без объяснения причины", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 $", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("45,67 $ за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.clickButtonCurrency_2();
        Thread.sleep(1000);
        Assert.assertEquals("Евро", firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.clickButtonCurrencyEUR();
        Thread.sleep(3000);
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("EUR: Отказано без объяснения причины", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 €", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("34,23 € за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

    }

    //Недостаточно средств
    @Test
    public void FirstWindowTest_3() throws InterruptedException {
        mainPage.inputFirstWindow("First" + UUID.randomUUID());

        firstWindowObject.setFieldMass("100000");
        firstWindowObject.clickFieldSumm();

        Assert.assertEquals("Покупка слитков", firstWindowObject.getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", firstWindowObject.getTextUser());
        //Проверка, что при нажатии на кнопку "Открыть инструкцию" открывается новое окно
        Assert.assertEquals("Предварительный расчет", firstWindowObject.getTextPreCalculate());

        Assert.assertEquals("Валюта", firstWindowObject.getTextCurrency());
        Assert.assertEquals("Рубль", firstWindowObject.getFieldCurrency());

        Assert.assertEquals("Счет списания", firstWindowObject.getFieldDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", firstWindowObject.getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", firstWindowObject.getFieldMasterAccountSumm());
        Assert.assertEquals("Недостаточно средств", firstWindowObject.getTextLowMoney());
        Assert.assertEquals("rgba(218, 11, 32, 1)", firstWindowObject.getTextLowMoneyColor());

        Assert.assertEquals("Предварительный курс золота", firstWindowObject.getTextCourseGold());
        Assert.assertEquals("4 045,30 ₽ за 1 г", firstWindowObject.getFieldCourseGold());

        Thread.sleep(1000);
        Assert.assertEquals("Масса слитков", firstWindowObject.getTextMass());
        Assert.assertEquals("100 000 г", firstWindowObject.getFieldMass("value"));

        Assert.assertEquals("На сумму", firstWindowObject.getTextSumm());
        Assert.assertEquals("0,00 ₽", firstWindowObject.getFieldSumm("placeholder"));

        Assert.assertEquals("до 100 000 г", firstWindowObject.getTextBefore());
    }

    //Отсутствует счет
    @Test
    public void FirstWindowTest_4() throws InterruptedException {
        mainPage.inputFirstWindow("First" + UUID.randomUUID());

        firstWindowObject.clickButtonCurrency();
        Thread.sleep(1000);
        Assert.assertEquals("Доллар", firstWindowObject.getFieldElementCurrencyUSD());
        firstWindowObject.clickButtonCurrencyUSD();
        Thread.sleep(3000);
        Assert.assertEquals("0,00 $", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("45,67 $ за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        Assert.assertEquals("Для покупки слитков нужен текущий счет. Откройте его – это бесплатно.", firstWindowObject.getTextNoAccount());
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }


    //Арбитраж отказано
    @Test
    public void FirstWindowTest_5() throws InterruptedException {
        mainPage.inputFirstWindow("FirstBLArbDn" + UUID.randomUUID());

        Assert.assertEquals("Покупка слитков", firstWindowObject.getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", firstWindowObject.getTextUser());
        //Проверка, что при нажатии на кнопку "Открыть инструкцию" открывается новое окно
        Assert.assertEquals("Предварительный расчет", firstWindowObject.getTextPreCalculate());
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("RUB: arbitration completed with DENY decision", firstWindowObject.getTextDenyMessage());

        Assert.assertEquals("Валюта", firstWindowObject.getTextCurrency());
        Assert.assertEquals("Рубль", firstWindowObject.getFieldCurrency());

        Assert.assertEquals("На сумму", firstWindowObject.getTextSumm());
        Assert.assertEquals("0,00 ₽", firstWindowObject.getFieldSumm("placeholder"));

        Assert.assertEquals("Предварительный курс золота", firstWindowObject.getTextCourseGold());
        Assert.assertEquals("4 045,30 ₽ за 1 г", firstWindowObject.getFieldCourseGold());

        Assert.assertEquals("Счет списания", firstWindowObject.getFieldDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", firstWindowObject.getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", firstWindowObject.getFieldMasterAccountSumm());

        Assert.assertEquals("Масса слитков", firstWindowObject.getTextMass());
        Assert.assertEquals("0 г", firstWindowObject.getFieldMass("placeholder"));

        Assert.assertEquals("до 100 000 г", firstWindowObject.getTextBefore());

        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.clickButtonCurrency();
        Thread.sleep(1000);
        Assert.assertEquals("Доллар", firstWindowObject.getFieldElementCurrencyUSD());
        firstWindowObject.clickButtonCurrencyUSD();
        Thread.sleep(3000);
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("USD: arbitration completed with DENY decision", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 $", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("45,67 $ за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.clickButtonCurrency_2();
        Thread.sleep(1000);
        Assert.assertEquals("Евро", firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.clickButtonCurrencyEUR();
        Thread.sleep(3000);
        Assert.assertEquals("Предоставления продукта в данной валюте запрещено", firstWindowObject.getTextDeny());
        Assert.assertEquals("EUR: arbitration completed with DENY decision", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 €", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("34,23 € за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }

    //Арбитраж в работе
    @Test
    public void FirstWindowTest_6() throws InterruptedException {
        mainPage.inputFirstWindow("FirstBLArbIW" + UUID.randomUUID());

        Assert.assertEquals("Покупка слитков", firstWindowObject.getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", firstWindowObject.getTextUser());
        //Проверка, что при нажатии на кнопку "Открыть инструкцию" открывается новое окно
        Assert.assertEquals("Предварительный расчет", firstWindowObject.getTextPreCalculate());
        Assert.assertEquals("Арбитраж по клиенту в данной валюте находится на рассмотрении", firstWindowObject.getTextDeny());
        Assert.assertEquals("RUB: arbitration IN_WORK", firstWindowObject.getTextDenyMessage());

        Assert.assertEquals("Валюта", firstWindowObject.getTextCurrency());
        Assert.assertEquals("Рубль", firstWindowObject.getFieldCurrency());

        Assert.assertEquals("На сумму", firstWindowObject.getTextSumm());
        Assert.assertEquals("0,00 ₽", firstWindowObject.getFieldSumm("placeholder"));

        Assert.assertEquals("Предварительный курс золота", firstWindowObject.getTextCourseGold());
        Assert.assertEquals("4 045,30 ₽ за 1 г", firstWindowObject.getFieldCourseGold());

        Assert.assertEquals("Счет списания", firstWindowObject.getFieldDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", firstWindowObject.getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", firstWindowObject.getFieldMasterAccountSumm());

        Assert.assertEquals("Масса слитков", firstWindowObject.getTextMass());
        Assert.assertEquals("0 г", firstWindowObject.getFieldMass("placeholder"));

        Assert.assertEquals("до 100 000 г", firstWindowObject.getTextBefore());

        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Доллара
        firstWindowObject.clickButtonCurrency();
        Thread.sleep(1000);
        Assert.assertEquals("Доллар", firstWindowObject.getFieldElementCurrencyUSD());
        firstWindowObject.clickButtonCurrencyUSD();
        Thread.sleep(3000);
        Assert.assertEquals("Арбитраж по клиенту в данной валюте находится на рассмотрении", firstWindowObject.getTextDeny());
        Assert.assertEquals("USD: arbitration IN_WORK", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 $", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("45,67 $ за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());

        //Проверка Евро
        firstWindowObject.clickButtonCurrency_2();
        Thread.sleep(1000);
        Assert.assertEquals("Евро", firstWindowObject.getFieldCurrencyEUR());
        firstWindowObject.clickButtonCurrencyEUR();
        Thread.sleep(3000);
        Assert.assertEquals("Арбитраж по клиенту в данной валюте находится на рассмотрении", firstWindowObject.getTextDeny());
        Assert.assertEquals("EUR: arbitration IN_WORK", firstWindowObject.getTextDenyMessage());
        Assert.assertEquals("0,00 €", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("34,23 € за 1 г", firstWindowObject.getFieldCourseGold());
        Assert.assertEquals("до 10 000 г", firstWindowObject.getTextBefore());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(1000);
        Assert.assertEquals(false, firstWindowObject.isButtonNext());
    }

    //Обязательно для заполнения
    @Test
    public void FirstWindowTest_7() throws InterruptedException {
        mainPage.inputFirstWindow("First" + UUID.randomUUID());

        firstWindowObject.clickButtonNext();
        Thread.sleep(1000);
        Assert.assertEquals("Рубль", firstWindowObject.getFieldCurrency());
        Assert.assertEquals("Текущий счет • 7949", firstWindowObject.getFieldMasterAccount());
        Assert.assertEquals("7 997 695,52 RUR", firstWindowObject.getFieldMasterAccountSumm());
        Assert.assertEquals("0 г", firstWindowObject.getFieldMass("placeholder"));
        Assert.assertEquals("0,00 ₽", firstWindowObject.getFieldSumm("placeholder"));
        Assert.assertEquals("Обязательно для заполнения", firstWindowObject.getTextRequiredMass());
        Assert.assertEquals("Обязательно для заполнения", firstWindowObject.getTextRequiredSumm());

    }

    //2-ой экран
    @Test
    public void SecondWindowTest_1() throws InterruptedException {
        mainPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setFieldMass("1000");
        String mass = firstWindowObject.getFieldMass("value");
        /*String course = firstWindowObject.getTextElementCourseGold_2();
        String course_2;
        StringBuffer crs = new StringBuffer();
        crs.append(course);
        if(crs.substring(crs.length()-10, crs.length()-9).equals("0")){
            crs.delete(crs.length()-10, crs.length()-9);
            crs.delete(crs.length()-7, crs.length());
        }
        else crs.delete(crs.length()-7, crs.length());
        course = crs.toString();*/
    /*
        firstWindowObject.clickFieldSumm();
        Thread.sleep(2000);
        //String summ = firstWindowObject.getTextElementSumm_2("value");
        firstWindowObject.clickButtonNext();
        Assert.assertEquals("Покупка слитков", secondWindowObject.getTextSaleBullion());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", secondWindowObject.getTextUser());
        Assert.assertEquals("Открыть руководство", secondWindowObject.getTextLinkToManual());
        Assert.assertEquals("Этапы итогового расчета", secondWindowObject.getTextStageFinalCalculate());
        Assert.assertEquals("Свяжитесь с золотым деском (УОГТСР)", secondWindowObject.getTextConnectionGoldDesc());
        Assert.assertEquals("Запросите наличие массы и актуальный курс в УОГТСР по номеру телефона +7 (999) 999 99 99, +7 (495) 589 21 55.", secondWindowObject.getTextPhone());
        Assert.assertEquals("Заполните данные в итоговом расчете", secondWindowObject.getTextEnterData());
        Assert.assertEquals("Количество, тип слитков, курс, масса, масса химически чистого золота. Озвучьте клиенту полученные параметры.", secondWindowObject.getTextEnterDataTwo());
        Assert.assertEquals("Итоговый расчет", secondWindowObject.getTextFinalCalculate());
        Assert.assertEquals("Валюта", secondWindowObject.getTextCurrency());
        Assert.assertEquals("Рубль", secondWindowObject.getFieldCurrencyRUB());
        Assert.assertEquals("Счет списания", secondWindowObject.getTextDebitAccount());
        Assert.assertEquals("Текущий счет • 7949", secondWindowObject.getTextMasterAccount());
        Assert.assertEquals("7 997 695,52 ₽", secondWindowObject.getTextSummAccount());
        Assert.assertEquals("Тип слитка", secondWindowObject.getTextTypeBullion());
        Assert.assertEquals("Выберите тип слитка", secondWindowObject.getFieldTypeBullion());
        Assert.assertEquals("Масса слитков", secondWindowObject.getTextMassBullion());
        Assert.assertEquals(mass, secondWindowObject.getFieldMassBullion());
        Assert.assertEquals("до 100 000 г", secondWindowObject.getTextLimMassBullion());
        Assert.assertEquals("Курс золота за грамм", secondWindowObject.getTextCourseGold());
        /*course_2 = secondWindowObject.getFieldCourseGold();
        course_2 = course_2.replaceAll(" ","");
        Assert.assertEquals(course, course_2);*/
    /*
        Assert.assertEquals("Количество слитков", secondWindowObject.getTextAmountBullion());
        Assert.assertEquals("0 шт", secondWindowObject.getFieldAmountBullion());
        Assert.assertEquals("Масса химически чистого золота", secondWindowObject.getTextMassChemicalGold());
        Assert.assertEquals("0 г", secondWindowObject.getFieldMassChemicalGold());
        Assert.assertEquals("На сумму", secondWindowObject.getTextFinalSumm());
        //Assert.assertEquals(summ, secondWindowObject.getFieldFinalSumm());
        Assert.assertEquals("После покупки", secondWindowObject.getTextBeforeSale());
        Assert.assertEquals("Слитки остаются на хранение в банке", secondWindowObject.getTextBullionInBank());
        /*Assert.assertEquals(false, secondWindowObject.isButtonNext());
        Assert.assertEquals(true, secondWindowObject.isButtonCancel());
        Assert.assertEquals(true, secondWindowObject.isButtonDown());*/
    //}

/*
    //3-ий экран
    @Test
    public void ThirdWindowTest_1() throws InterruptedException {
        mainPage.inputFirstWindow("First" + UUID.randomUUID());
        firstWindowObject.setFieldMass("1000");
        firstWindowObject.clickFieldSumm();
        Thread.sleep(2000);
        firstWindowObject.clickButtonNext();
        secondWindowObject.clickButtonTypeBullion();
        secondWindowObject.clickButtonMeasuredBullion();
    }
    */
}
