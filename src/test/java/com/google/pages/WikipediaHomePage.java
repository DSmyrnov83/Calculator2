package com.google.pages;

import org.openqa.selenium.By;

public class WikipediaHomePage extends AbstractPage {

    private By searchField = By.xpath("//input[@id='searchInput']");
    private By searchButton = By.xpath("//button[@type='submit']");

    public void enterSearchText(String text){
        getElement(searchField).sendKeys(text);
    }

    public void clickSearchButton(){
        getElement(searchButton).click();
    }
}
