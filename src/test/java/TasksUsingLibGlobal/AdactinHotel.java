package TasksUsingLibGlobal;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AdactinHotel extends LibGlobal
{
/*	public void hotelLogin()
	{
		getDriver();
		maximizeWindow();
		loadUrl("https://adactinhotelapp.com/");
	    implicitWait(10);
	    WebElement txtUserName = findElementById("username");
	    insertValue(txtUserName, "Jagades123");
	    WebElement txtPassword = findElementById("password");
	    insertValue(txtPassword, "12345678");
	    WebElement btnLogin = findElementById("login");
	    click(btnLogin);
	}
	public void searchhotel() 
	{
		WebElement ddLocation = findElementByXpath("//select[@id='location']");
		selectOptionByText(ddLocation, "London");
		WebElement ddHotels = findElementById("hotels");
		selectOptionByText(ddHotels, "Hotel Sunshine");
		WebElement ddRoomType = findElementById("room_type");
		selectOptionByText(ddRoomType, "Super Deluxe");
		WebElement ddRoomNos = findElementById("room_nos");
		selectOptionByText(ddRoomNos, "5 - Five");
		/*WebElement txtCheckOut = findElementById("datepick_out");
		insertValue(txtCheckOut, "28/11/2022");
		WebElement txtCheckin = findElementById("datepick_in");
		insertValue(txtCheckin, "27/11/2022");*/
		
	/*	WebElement ddAdultPerRoom = findElementById("adult_room");
		selectOptionByText(ddAdultPerRoom, "4 - Four");
		WebElement ddChildPerRoom = findElementById("child_room");
		selectOptionByText(ddChildPerRoom, "1 - One");
		WebElement btnSearch = findElementById("Submit");
		click(btnSearch);
		
	}
	public void selectHotel() 
	{
		WebElement btnSelect = findElementById("radiobutton_0");
		click(btnSelect);
		WebElement btnContinue = findElementById("continue");
		click(btnContinue);
	}
	public void bookHotel() 
	{
		WebElement txtFirstName = findElementById("first_name");
		insertValue(txtFirstName, "Jagadeswaran");
		WebElement txtLastName = findElementById("last_name");
		insertValue(txtLastName, "Venkat");
		WebElement txtAddress = findElementById("address");
		insertValue(txtAddress, "Coimbatore");
		WebElement txtCardNo = findElementById("cc_num");
		insertValue(txtCardNo, "1234567890123456");
		WebElement ddCreditCardType = findElementById("cc_type");
		selectOptionByText(ddCreditCardType, "Master Card");
		WebElement ddMonth = findElementById("cc_exp_month");
		selectOptionByText(ddMonth, "October");
		WebElement ddYear = findElementById("cc_exp_year");
		selectOptionByText(ddYear, "2022");
		WebElement txtCvv = findElementById("cc_cvv");
		insertValue(txtCvv, "175");
		WebElement btnBookNow = findElementById("book_now");
		click(btnBookNow);
		implicitWait(15);
		
	}
	public String bookOrder()
	{
		WebElement txtOrderNo = findElementById("order_no");
		String attribute = getAttribute(txtOrderNo,"value");
		return attribute;
	}
	
	public static void main(String[] args) 
	{
		
		AdactinHotel obj = new AdactinHotel();
		obj.hotelLogin();
		obj.searchhotel();
	    obj.selectHotel();
	    obj.bookHotel();
	    String orderNo = obj.bookOrder();
	    System.out.println("Order Number is :"+orderNo);
	    
		
	}
*/
}
