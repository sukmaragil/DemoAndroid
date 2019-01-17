package com.icehousecorp.android.test.functional;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary",
    tags = {
        "@Regression"
    })
public class DefinitionTestSuite {}
