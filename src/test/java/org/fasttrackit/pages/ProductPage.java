package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    //Colors
    @FindBy(css = "img[alt=\"Black\"]")
    private WebElementFacade colorBlack;//select color black
    @FindBy(css = "img[alt=\"White\"]")
    WebElementFacade colorWhite;//select color white





    @FindBy(css = "a#swatch81 span.swatch-label ")
    private WebElementFacade sizeXS;//button

    @FindBy(css = "select#select_2")
    private WebElementFacade customDropMenu;//button

    @FindBy(css = "select#select_2 option[value='1']")
    private WebElementFacade optionCustom;


    @FindBy(css = "input[title=\"Qty\"]")
    private  WebElementFacade Qty;


    @FindBy(xpath = "//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/div[2]/div[2]/button")
    private WebElementFacade addButton;

    @FindBy(css = ".option-l")
    WebElementFacade sizeL;





    public void setProductColorB(){
        clickOn(colorBlack);
    }

    public void setProductSize(){
        clickOn(sizeXS);
    }

    public void clickCustomDrop(){
        clickOn(customDropMenu);
    }

    public void setOptionCustom(){
        clickOn(optionCustom);
    }

    public void setQty(String qunatity){
        typeInto(Qty,qunatity);
    }

    public void clickAddbutton(){

        clickOn(addButton);
    }


    public void checkAddButton(){
        addButton.isDisplayed();
    }

    public void setSizeL(){
        clickOn(sizeL);
    }

    public void setProductColorW(){
        clickOn(colorWhite);
    }


}
