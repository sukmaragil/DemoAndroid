package com.icehousecorp.android.test.functional.pages;

//import io.appium.java_client.MobileElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy (id = "com.example.android.architecture.blueprints.todomvvmlive.mock:id/fab_add_task")
    WebElementFacade addButton;

    @FindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    WebElementFacade hamburgerMenu;

    @FindBy (xpath = "//*[contains(@resource-id,\"design_navigation_view\")]/child::node()[3]")
    WebElementFacade statisticsMenu;

    public void clickAddButton() {
        addButton.click();
    }

    public void clickHamburgerMenu() {
        hamburgerMenu.click();
    }

    public void clickStatisticsMenu() {
        statisticsMenu.click();
    }

}
