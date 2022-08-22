package com.StepDefinition;

import com.factory.DriverFactory;
import com.pages.InteractionPage;
import com.pages.SelectablePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Locale;

public class InteractionMenuStepDefinition extends DriverFactory{
   WebDriver driver = DriverFactory.getDriver();
    private InteractionPage interactionPage = new InteractionPage(driver);
    private SelectablePage selectablePage = new SelectablePage(driver);

    @Given("user selected {string} form left menu")
    public void user_selected_droppable_form_left_menu(String expectedTitle) throws InterruptedException {
        String actualTitle =  interactionPage.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("user click on droppable under interaction from left menu")
    public void user_click_on_droppable_under_interaction_from_left_menu() {
        boolean bDroppable =  interactionPage.getInteractionPageDrop();
        Assert.assertTrue(bDroppable);
        interactionPage.clickOnElement();
    }

    @When("user drag {string} component to {string}")
    public void user_drag_component_to(String string, String string2) throws InterruptedException {
        interactionPage.dragDrop();
    }

    @Then("component should place in inbox")
    public void component_should_place_in_inbox() {
       Assert.assertTrue(interactionPage.getHighlightedColourAfterDrop());
       Assert.assertEquals("Dropped!",interactionPage.getTextAfterDrop());
    }

    @Given("user click on selectable from left menu")
    public void user_click_on_selectable_from_left_menu() {
        selectablePage.clickOnSelectable();
        Assert.assertEquals("selectable",selectablePage.getTitle().toLowerCase(Locale.ROOT));
    }

    @When("user select the items {string} from table")
    public void user_select_the_items_from_table(String expectedItemToSelect) {
            selectablePage.selectItemFromList(expectedItemToSelect.toLowerCase());
    }

    @Then("item {string} should get selected")
    public void item_should_get_selected(String expectedNumberOfItemSelected) {
        System.out.println(expectedNumberOfItemSelected);
        Assert.assertTrue(selectablePage.getSelectItem(expectedNumberOfItemSelected));
    }


}
