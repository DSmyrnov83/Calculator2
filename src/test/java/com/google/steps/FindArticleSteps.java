package com.google.steps;

import com.google.WebDriverManager;
import com.google.pages.ArticlePage;
import com.google.pages.WikipediaHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FindArticleSteps {

    private WikipediaHomePage wikipediaHomePage;
    private ArticlePage articlePage;

    public FindArticleSteps(WikipediaHomePage wikipediaHomePage, ArticlePage articlePage) {
        this.wikipediaHomePage = wikipediaHomePage;
        this.articlePage = articlePage;
    }

    @Given("^website '(.*)' is opened$")
    public void openWebsiteWithWebAddress(String webAddress){
        WebDriverManager.getDriver().get(webAddress);
    }

    @When("^(?:user |)enters '(.*)' into search field$")
    public void enterQueryIntoSearchField(String query) {
        wikipediaHomePage.enterSearchText(query);
    }

    @When("^(?:user |)clicks on search button$")
    public void clickOnSearchButton() {
        wikipediaHomePage.clickSearchButton();
    }

    @Then("^the article about (.*) is opened$")
    public void checkArticleName(String expectedArticle){
        String actualArticle = articlePage.getArticleName();
        Assert.assertEquals(expectedArticle,actualArticle);
    }
}
