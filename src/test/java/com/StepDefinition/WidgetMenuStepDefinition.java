package com.StepDefinition;

import com.factory.DriverFactory;
import com.pages.ControlgroupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WidgetMenuStepDefinition extends DriverFactory{

    private ControlgroupPage controlgroupPage = new ControlgroupPage(DriverFactory.getDriver());

    @Given("user navigate to Control group link from left menu")
    public void user_navigate_to_Control_group_link_from_left_menu() {
        controlgroupPage.clickOnElement();
    }

    @When("user on control page frame for horizontal care rental options")
    public void user_on_control_page_frame_for_horizontal_care_rental_options() {
        Assert.assertEquals(controlgroupPage.getTitlePage(),"Controlgroup");
    }

    @Then("user can select {string} from drop down")
    public void user_can_select_from_drop_down(String expectedCarType) {
        controlgroupPage. clickOnCarTypeButton();
        Assert.assertTrue(controlgroupPage.setCarType(expectedCarType.toLowerCase()));
    }

    @Then("user can select {string} radio button")
    public void user_can_select_radio_button(String expectedRadioButton) {
       Assert.assertTrue(controlgroupPage.selectAutomaticRadioButton());
    }

    @Then("user can select the {string} check box")
    public void user_can_select_the_check_box(String string) {
       Assert.assertTrue( controlgroupPage.checkInsurance());
    }

    @Then("user can give the number {string} for car input")
    public void user_can_give_the_number_for_car_input(String expectedNumberToSelect) {
       controlgroupPage. setNumberOfCarForHorizontal(expectedNumberToSelect);
    }

    @When("user on vertical car rental menu options")
    public void user_on_vertical_car_rental_menu_options() {
        controlgroupPage.clickOnVerticalMenuCarType();
    }

    @Then("user can select {string} option from select menu")
    public void user_can_select_option_from_select_menu(String expectedCarToSelect) {
      controlgroupPage.selectCarTypeFromVertical(expectedCarToSelect);
    }

    @Then("user should be able to select {string} radio button")
    public void user_should_be_able_to_select_radio_button(String string) {
        Assert.assertTrue(controlgroupPage.clickOnVerticalRadioStandardButton());
    }

    @Then("user can check {string} checkbox")
    public void user_can_check_checkbox(String string) {
       Assert.assertTrue( controlgroupPage.clickOnVerticalInsurance());
    }

    @And("user can put the {string} number of cars")
    public void user_can_put_the_number_of_cars(String expectedNumberToType) {
        controlgroupPage.typeTheNumberOfCar(expectedNumberToType);
    }
}
