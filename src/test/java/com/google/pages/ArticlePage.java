package com.google.pages;

import org.openqa.selenium.By;

public class ArticlePage extends AbstractPage {
    private By articleName = By.xpath("//h1[@id='firstHeading']");

    public String getArticleName(){
        return getElement(articleName).getText();
    }
}
