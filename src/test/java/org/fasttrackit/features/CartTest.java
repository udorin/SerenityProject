package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.CartSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)

    private WebDriver driver;

    @Steps
    CartSteps cartSteps;
    @Steps
    AddToCartSteps addToCartSteps;


    @Test
    public  void checkIfUserCanSuccesfullyUpdateQuantity(){
        cartSteps.goToProductPage("1");
        cartSteps.addNewQantity("2");
        cartSteps.clickOnUpdateButton();
        cartSteps.checkUpdate("268,00 RON");

    }

    @Test
    public void checkIfUserCanDeleteAllProductsFromCart(){
        cartSteps.goToProductPage("1");
        cartSteps.clickOnEmptyCartButton();
        cartSteps.checkIfCartIsEmpty("SHOPPING CART IS EMPTY");
    }

    @Test
    public void checkIfUserCanEditProduct(){
        cartSteps.goToProductPage("1");
        cartSteps.clickOnEditLink();
        addToCartSteps.setProductSizeToL();
        addToCartSteps.selectProductColorToWhite();
        addToCartSteps.selectCustomOption();
        addToCartSteps.selectQuantity("1");
        addToCartSteps.clickOnAddToCart();
        addToCartSteps.checkIfCheckOutButtonIsDispayed();




    }






}
