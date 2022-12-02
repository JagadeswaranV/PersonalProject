package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal
{
	public SelectHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnHotel;
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	public WebElement getBtnHotel() {
		return btnHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotel()
	{
		click(getBtnHotel());
		click(getBtnContinue());
	}
}
