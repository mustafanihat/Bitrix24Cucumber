package com.nextbasecrm.step_defs;

import com.nextbasecrm.utilities.ConfigurationReader;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class SpartanStepdefs {
    Response response;
    @Given("User send a get request to spartan api")
    public void user_send_a_get_request_to_spartan_api() {
         response = RestAssured.given().pathParam("id",101).when().
                get(ConfigurationReader.get("api")+"/api/spartans/{id}");
        Assert.assertEquals(200,response.getStatusCode());
    }

    @Then("result should be {string}")
    public void result_should_be(String string) {
        System.out.println(response.jsonPath().getString("name"));
        Assert.assertEquals(string,response.jsonPath().getString("name"));

        //select name from spartans
        //where spartan_id=101;
    }

}
