package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;



public class US_014_StepDef_AsK {

    HomePage homePage= new HomePage();

    @When("user verifies What's Near You button is clickable")
    public void userVerifiesWhatSNearYouButtonIsClickable() {

        Assert.assertTrue(homePage.link_whatsNearYou.isDisplayed());
        Assert.assertTrue(homePage.link_whatsNearYou.isEnabled());

    }

    @And("user verifies Post Your Goods button is clickable")
    public void userVerifiesPostYourGoodsButtonIsClickable() {
        Assert.assertTrue( homePage.link_postYourGoods.isDisplayed() );
        Assert.assertTrue( homePage.link_postYourGoods.isEnabled() );
    }

    }


