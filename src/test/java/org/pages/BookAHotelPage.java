package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends LibGlobal
{
	public BookAHotelPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccYear;
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	public void bookHotel(String txtFirstName,String txtLastName,String txtAddress,String ccNum,String ccType,String ccMonth,String ccYear,String ccCvv) 
	{
		sendKeys(getTxtFirstName(), txtFirstName);
		sendKeys(getTxtLastName(),txtLastName );
		sendKeys(getTxtAddress(), txtAddress);
		sendKeys(getCcNum(), ccNum);
		
		
		selectByVisibleText(getCcType(),ccType );
		selectByVisibleText(getCcMonth(),ccMonth );
		selectByVisibleText(getCcYear(),ccYear );
		
		sendKeys(getCcCvv(),ccCvv );
		click(getBtnBookNow());
		
		
	}
	
}
	
