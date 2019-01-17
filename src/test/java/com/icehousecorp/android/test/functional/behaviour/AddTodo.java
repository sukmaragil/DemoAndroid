package com.icehousecorp.android.test.functional.behaviour;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.icehousecorp.android.test.functional.AndroidDriverSource;
import com.icehousecorp.android.test.functional.models.DataObject;
import com.icehousecorp.android.test.functional.models.LoginEntity;
import com.icehousecorp.android.test.functional.pages.HomePage;
import com.icehousecorp.android.test.functional.pages.NewTodoPage;
import com.icehousecorp.android.test.functional.pages.StatisticsPage;
import net.thucydides.core.annotations.Step;

import java.io.FileReader;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddTodo {

    HomePage homePage;
    NewTodoPage todoPage;
    StatisticsPage statPage;

    @Step
    public void openTodo() {
        homePage.setDriver(homePage.getDriver());
        System.out.println(AndroidDriverSource.ANDROID_DRIVER);
    }

    @Step
    public void addNewTodo (String title, String description) {
        homePage.clickAddButton();
        todoPage.typeTextTitle(title);
        todoPage.typeDescriptionTitle(description);
        todoPage.clickSubmit();
    }

    @Step
    public void clickMenu() {
        homePage.clickHamburgerMenu();
    }

    @Step
    public void clickStatisticMenu() { homePage.clickStatisticsMenu(); }

    @Step
    public void checkActivityTasks(int activeTasks) {
        assertThat("Active task is not expected", statPage.getTextActiveTask(), equalTo("Active tasks: " + activeTasks));
    }

    public void getToken() throws Exception{
        DataObject<LoginEntity> data =
                new Gson().fromJson(new FileReader(System.getProperty("user.dir") + "//target//Login.json"),
                new TypeToken<DataObject<LoginEntity>>() {}.getType());
        System.out.println("Data token : " + data.getData().getFirebaseToken());
        System.out.println("Data array : " + data.getData().getPrivileges().get(2));
    }
}
