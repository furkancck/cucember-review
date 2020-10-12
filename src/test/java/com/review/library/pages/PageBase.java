package com.review.library.pages;

import com.review.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title'][.='Users']")
    public WebElement users;

    @FindBy(xpath = "//span[@class='title'][.='Books']")
    public WebElement books;

    @FindBy(xpath = "//span[@class='title'][.='Dashboard']")
    public WebElement dashboard;

    @FindBy(tagName = "h3")
    public WebElement pageHeader;



}
