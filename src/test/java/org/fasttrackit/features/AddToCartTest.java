package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AddToCartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    AddToCartSteps addToCartSteps;

    @Test
    public void addToCartWithoutSelectOptions(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfAddToCartIsDispalyed();
    }

    @Test
    public void addToCartBySelectOnlyColor(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.selectProductColorToBlack();
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfAddToCartIsDispalyed();
    }

    @Test
    public void addToCartBySelectOnlySize(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.selectSizeXL();
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfAddToCartIsDispalyed();
    }

    @Test
    public void addToCartBySelectOnlyCustomOption(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.selectCustomOption();
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfAddToCartIsDispalyed();
    }
    @Test
    public void addToCartByAddOnlyQuantity(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.selectQuantity("2");
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfAddToCartIsDispalyed();
    }

    @Test
    public void addToCartSelectingAllOption(){
        addToCartSteps.navigateToHomepage();
        addToCartSteps.goToProductPage();
        addToCartSteps.selectProductColorToBlack();
        addToCartSteps.selectSizeXL();
        addToCartSteps.selectCustomOption();
        addToCartSteps.selectQuantity("2");
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfCheckOutButtonIsDispayed();

    }

}
