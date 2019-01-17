package com.icehousecorp.android.test.functional.steps;

import com.icehousecorp.android.test.functional.behaviour.AddTodo;
import com.icehousecorp.android.test.functional.controller.JsonPlaceHolder;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddTodoItemSteps {

    @Steps
    AddTodo todo;

    @Steps
    JsonPlaceHolder api;

    @Given("^the user in to-do list screen$")
    public void userTodoList() {
        todo.openTodo();
    }

    @When("^the user add new to-do with title \"([^\"]*)\" and description \"([^\"]*)\"$")
    public void theUserAddNewToDoWithTitleAndDescription(String title, String description) {
        todo.addNewTodo(title, description);
//        api.post_signin_session("ih0@icehouse.com", "password");
    }

    @Given("^user want to get some data$")
    public void userWantToGetSomeData() {

    }

    @When("^user want input data$")
    public void userWantInputData() throws Exception {
        api.post_signin_session("ih0@icehouse.com", "password");
        todo.getToken();
    }

    @Then("^Active Task on Statistics menu should be (\\d+)$")
    public void activeTaskOnStatisticsMenuShouldBe(int statistics) {
        todo.clickMenu();
        todo.clickStatisticMenu();
        todo.checkActivityTasks(statistics);
    }

}
