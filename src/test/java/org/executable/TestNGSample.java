package org.executable;

import java.io.IOException;


import org.libglobal.LibGlobal;
import org.pages.BookAHotelPage;
import org.pages.BookingConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample extends LibGlobal
{
	int i;
	@BeforeClass
	public static void beforeClass()
	{
		getDriver();
		maximizeWindow();
		implicitWait(10);
		url("https://adactinhotelapp.com/");
	}
	@AfterClass
	public static void afterClass()
	{
		quit();
	}
	@BeforeMethod
	public void before()
	{
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	@AfterMethod
	public void after()
	{
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
	@Test(priority=-1)
	public void adactinLogin() throws IOException
	{
		LoginPage loginPage = new LoginPage();
		loginPage.login(getData("Adactin Data", 2, 5),getData("Adactin Data", 3, 5));
	}
	@Test
	public void adactinSearchHotel() throws IOException
	{
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.searchHotel(getData("Adactin Data", 5, 5), getData("Adactin Data", 6, 5),getData("Adactin Data", 7, 5), 
		getData("Adactin Data", 8, 5), getData("Adactin Data", 11, 5),getData("Adactin Data", 12, 5));
	}
	@Test(priority=1)
	public void adactinSelectHotel()
	{
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		selectHotelPage.selectHotel();
	}
	@Test(priority=2)
	public void adactinBookAHotel() throws IOException
	{
		BookAHotelPage bookAHotelPage = new BookAHotelPage();
		bookAHotelPage.bookHotel(getData("Adactin Data", 16, 5),getData("Adactin Data", 17, 5),getData("Adactin Data", 18, 5),
	getData("Adactin Data", 19, 5),getData("Adactin Data", 20, 5),getData("Adactin Data", 21, 5),
	getData("Adactin Data", 22, 5),getData("Adactin Data", 23, 5));
	}
	@Test(priority=3)
	public void adactinBookingConfirmation() throws IOException
	{
		BookingConfirmationPage bookingConfirmationPage = new BookingConfirmationPage();
	String bookingConfirmation = bookingConfirmationPage.bookingConfirmation(getData("Adactin Data", 25, 5));
	updateData("Adactin Data", 26, 7, bookingConfirmation);
	}
	@Test(priority=4,enabled=false)
	public void disableMethod()
	{
		System.out.println("disableMethod");
	}
	@Test(priority=5,invocationCount=10)
	public void multipleExecute()
	{
		i++;
		System.out.println("Count is:"+i);
	}

	


}
