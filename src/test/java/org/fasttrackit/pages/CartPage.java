package org.fasttrackit.pages;

import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;




public class CartPage extends PageObject {

    @FindBy(css = "button.btn-checkout")
    WebElementFacade buttonCheckOut;

    @FindBy(css = "input[title='Qty']")
    WebElementFacade inputQty;//textbox

    @FindBy(css = "button[title='Update']")
    WebElementFacade updateButton;

    @FindBy(css = ".product-cart-total .price")
    WebElementFacade priceProduct ;//text
    @FindBy(css = "button[title='Empty Cart']")
    WebElementFacade emptyCartButton;

    @FindBy(css = ".page-title h1")
    WebElementFacade cartIsEmpty;//text result

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/ul/li/a")
    WebElementFacade linkEditProduct;









    public void checkButtonCheckOut(){
        buttonCheckOut.isEnabled();
    }

    public void inputQty(String Qty){
        typeInto(inputQty,Qty);
    }

    public void clikUpdateButton() {
        clickOn(updateButton);
    }

    public void checkUpdate(String tPrice){
       priceProduct.shouldContainText(tPrice);


    }


public void clickOnEmptyCartButton(){
        clickOn(emptyCartButton);
}
public void checkCartIsEmpty(String check){
        cartIsEmpty.shouldContainText(check);

}


public  void clickEditlink(){
        clickOn(linkEditProduct);
}
}
