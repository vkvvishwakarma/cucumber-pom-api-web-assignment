package com.StepDefinition;

import com.api.ApiService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

public class ApiStepDefTest {
    ApiService apiService ;
    Response response = null;
    Response postResponse = null;

    @Given("The base uri is {string}")
    public void theBaseUriIs(String url) {
        apiService = new ApiService(url);
    }

    @When("user inquires for page {string}")
    public void userInquiresForPage(String page) {
        response = apiService.getUserPage(page);
    }

    @Then("status for the reponse should be {string}")
    public void statusForTheReponseShouldBe(String status) {
        System.out.println("integer value" + Integer.parseInt(status));
        Assert.assertEquals(response.getStatusCode(), Integer.parseInt(status));
    }

    @And("first name for id {string} should be {string}")
    public void firstNameForIdShouldBe(String id, String name) {
        System.out.println("id values = " + id);
        Assert.assertEquals(apiService.getNameWithServiceId(response, Integer.parseInt(id)), name);
    }

    @When("user posts with name {string} and job {string}")
    public void userPostsWithNameAndJob(String name, String job) {
        postResponse = apiService.postUser(name, job);
    }

    @Then("status code should be {string}")
    public void statusCodeShouldBe(String status) {
        Assert.assertEquals(postResponse.getStatusCode(), Integer.parseInt(status));
    }

    @And("the id should be generated")
    public void theIdShouldBeGenerated() {
        //Assert.assertTrue(apiService.verifyId(postResponse));
    }

    @And("verify schema with file {string}")
    public void verifySchemaWithFile(String arg0) {
      //  service.verifyResponseSchemaForPostUser(postResponse, pathTofile);
    }
}
