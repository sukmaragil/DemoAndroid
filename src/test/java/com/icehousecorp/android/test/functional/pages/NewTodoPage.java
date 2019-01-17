package com.icehousecorp.android.test.functional.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewTodoPage extends PageObject {

    @FindBy(id = "com.example.android.architecture.blueprints.todomvvmlive.mock:id/add_task_title")
    WebElementFacade titleTextInput;

    @FindBy(id = "com.example.android.architecture.blueprints.todomvvmlive.mock:id/add_task_description")
    WebElementFacade descriptionTextInput;

    @FindBy(id ="com.example.android.architecture.blueprints.todomvvmlive.mock:id/fab_edit_task_done")
    WebElementFacade submitTodoButton;

//    for findBy id = is can be shorten like this
//    @FindBy(id = "add_task_title")


    public void typeTextTitle(String Title) {
        titleTextInput.type(Title);
    }

    public void typeDescriptionTitle(String Description) {
        descriptionTextInput.type(Description);
    }

    public void clickSubmit() {
        submitTodoButton.click();
    }
}