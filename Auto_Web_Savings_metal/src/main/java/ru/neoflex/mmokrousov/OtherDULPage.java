package ru.neoflex.mmokrousov;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;

public class OtherDULPage {
    WebDriver driver;

    public OtherDULPage(WebDriver driver) {
        this.driver = driver;
    }

    @ElementTitle("Текст:Покупка слитков")
    @FindBy(xpath = "//*[@id=\"root\"]/span")
    private WebElement textSaleBullion;

    @ElementTitle("Текст:Руководство")
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/span[2]")
    private WebElement textUser;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/button/div/div")//Ссылка на руководство текст
    private WebElement linkToManual;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/span")//ДУЛ текст
    private WebElement textDUL;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/label")//Доумент текст
    private WebElement textDocument;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[1]/div/div[1]/div/div[1]")//Кнопка выплывающего списка документа
    private WebElement buttonDocument;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/label")//Номер документа
    private WebElement textNumberDocument;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[1]/div[2]/div/div/div[1]/input")//Поле документа
    private WebElement fieldNumberDocument;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[1]/button")//Кнопка выйти
    private WebElement buttonExit;
    @FindBy(xpath = "//*[@id=\"root\"]/form/div[2]/div[2]/div/button")//Кнопка продолжить
    private WebElement buttonNext;

    public void headerBlock(){
        Assert.assertEquals("Покупка слитков", textSaleBullion.getText());
        Assert.assertEquals("Воспользуйтесь руководством пользователя. В нем пошаговая инструкция по процессу оформления продукта.", textUser.getText());
        Assert.assertEquals("Открыть руководство", linkToManual.getText());
    }

    public void clickButton(){
        buttonNext.click();
    }

}
