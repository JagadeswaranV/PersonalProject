package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends LibGlobal
{
	public BookingConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement getOrderNo;

	public WebElement getGetOrderNo() {
		return getOrderNo;
	}
	
	public String bookingConfirmation(String value)
	{
		String orderNo = getAttribute(getGetOrderNo(),value);
		return orderNo;
	}

}
