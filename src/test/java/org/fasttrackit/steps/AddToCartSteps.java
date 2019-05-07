package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.ProductPage;

public class AddToCartSteps {

    Homepage homepage;
    ProductPage productPage;
    CartPage cartPage;

    @Step
    public void navigateToHomepage(){
        homepage.open();
    }

    @Step
    public void goToProductPage(){
        homepage.clickProductLink();
    }

    @Step
    public void selectProductColorToBlack(){
        productPage.setProductColorB();
    }
    @Step
    public void selectSizeXL(){
        productPage.setProductSize();
    }
    @Step
    public void selectCustomOption(){
        productPage.clickCustomDrop();
        productPage.setOptionCustom();
    }
    @Step
    public void selectQuantity(String Quantity){
        productPage.setQty(Quantity);
    }

    @Step
    public void clickOnAddToCart(){
        productPage.clickAddbutton();
    }

    @Step
    public void checkIfAddToCartIsDispalyed(){
        productPage.checkAddButton();
    }



    @Step
    public void checkIfCheckOutButtonIsDispayed(){
        cartPage.checkButtonCheckOut();

    }
    @Step
    public void selectProductColorToWhite(){
        productPage.setProductColorW();
    }

    @Step
    public void setProductSizeToL()
    {
        productPage.setSizeL();
    }
}
