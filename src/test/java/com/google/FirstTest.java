package com.google;

import com.google.pages.WikipediaHomePage;
import org.junit.Test;


public class FirstTest {


    @Test
    public void weatherSearch() {
        WebDriverManager.getDriver().get("https://www.wikipedia.org");
        WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();
        wikipediaHomePage.enterSearchText("Tolkin");
        wikipediaHomePage.clickSearchButton();
    }
}
