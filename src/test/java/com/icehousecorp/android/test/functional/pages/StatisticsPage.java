package com.icehousecorp.android.test.functional.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StatisticsPage extends PageObject {

    @FindBy ( xpath = "//*[contains(@resource-id, \"statistics\")]//*[@index=\"0\"]")
    WebElementFacade activeTaskLabel;

    public String getTextActiveTask() {
        return activeTaskLabel.getText();
    }
}
