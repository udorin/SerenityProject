package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.ProductPage;

public class CartSteps {

    CartPage cartPage;
    Homepage homepage;
    ProductPage productPage;

    @Step
    public void goToProductPage(String quantity){
      homepage.open();
      homepage.clickProductLink();
      productPage.setProductColorB();
      productPage.setProductSize();
      productPage.setOptionCustom();
      productPage.setQty(quantity);
      productPage.clickAddbutton();

    }
    @Step
    public void addNewQantity(String qty){
        cartPage.inputQty(qty);
    }

    @Step
    public void clickOnUpdateButton(){
        cartPage.clikUpdateButton();
    }

    @Step
    public void checkUpdate(String priceProduct){
        cartPage.checkUpdate(priceProduct);
    }


    @Step
    public void clickOnEmptyCartButton(){
        cartPage.clickOnEmptyCartButton();
    }

    @Step
    public void checkIfCartIsEmpty(String text){
        cartPage.checkCartIsEmpty(text);
    }
    @Step
    public void clickOnEditLink(){
        cartPage.clickEditlink();
    }
    @Step
    public void checkIfCheckoutButtonIsPresent() {
        cartPage.checkButtonCheckOut();
    }
}
