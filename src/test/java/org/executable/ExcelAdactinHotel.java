package org.executable;

import java.io.IOException;
import java.net.URL;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.BookAHotelPage;
import org.pages.BookingConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelAdactinHotel extends LibGlobal
{
	public void adactinLogin() throws IOException 
	{
		getDriver();
		maximizeWindow();
		url(getData("Adactin Data", 1, 5));
		implicitWait(10);
		LoginPage loginPage = new LoginPage();
		loginPage.login(getData("Adactin Data", 2, 5),getData("Adactin Data", 3, 5));
	}
	public void adactinSearchHotel() throws IOException 
	{
		
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		
		searchHotelPage.searchHotel(getData("Adactin Data", 5, 5), getData("Adactin Data", 6, 5),getData("Adactin Data", 7, 5), 
		getData("Adactin Data", 8, 5), getData("Adactin Data", 11, 5),getData("Adactin Data", 12, 5));
		
	}
	public void adactinSelectHotel() throws IOException
	{
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		selectHotelPage.selectHotel();
	}
	
	public void adactinBookHotel() throws IOException 
	{
		
		BookAHotelPage bookAHotelPage = new BookAHotelPage();
		bookAHotelPage.bookHotel(getData("Adactin Data", 16, 5),getData("Adactin Data", 17, 5),getData("Adactin Data", 18, 5),
	getData("Adactin Data", 19, 5),getData("Adactin Data", 20, 5),getData("Adactin Data", 21, 5),
	getData("Adactin Data", 22, 5),getData("Adactin Data", 23, 5));
		
	}
	public void adactinOrderNo() throws IOException 
	{
		BookingConfirmationPage bookingConfirmationPage = new BookingConfirmationPage();
		
		String bookingConfirmation = bookingConfirmationPage.bookingConfirmation(getData("Adactin Data", 25, 5));
		
		updateData("Adactin Data", 26, 7, bookingConfirmation);
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException 
	{
		ExcelAdactinHotel obj = new ExcelAdactinHotel();
		obj.adactinLogin();
	    obj.adactinSearchHotel();
	    obj.adactinSelectHotel();
	    obj.adactinBookHotel();
	    obj.adactinOrderNo();
	}

}
