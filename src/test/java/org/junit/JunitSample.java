package org.junit;

import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.libglobal.LibGlobal;
import org.pages.BookAHotelPage;
import org.pages.BookingConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;

public class JunitSample extends LibGlobal 
{
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
		@Before
		public void before()
		{
			long startTime = System.currentTimeMillis();
			System.out.println(startTime);
		}
		@After
		public void after()
		{
			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
		}
		@Test
		public void tc1() throws IOException
		{
			LoginPage loginPage = new LoginPage();
			loginPage.login(getData("Adactin Data", 2, 5),getData("Adactin Data", 3, 5));
		}
		@Test
		public void tc2() throws IOException
		{
			SearchHotelPage searchHotelPage = new SearchHotelPage();
			searchHotelPage.searchHotel(getData("Adactin Data", 5, 5), getData("Adactin Data", 6, 5),getData("Adactin Data", 7, 5), 
			getData("Adactin Data", 8, 5), getData("Adactin Data", 11, 5),getData("Adactin Data", 12, 5));
		}
		@Test
		public void tc3()
		{
			SelectHotelPage selectHotelPage = new SelectHotelPage();
			selectHotelPage.selectHotel();
		}
		@Test
		public void tc4() throws IOException
		{
			BookAHotelPage bookAHotelPage = new BookAHotelPage();
			bookAHotelPage.bookHotel(getData("Adactin Data", 16, 5),getData("Adactin Data", 17, 5),getData("Adactin Data", 18, 5),
		getData("Adactin Data", 19, 5),getData("Adactin Data", 20, 5),getData("Adactin Data", 21, 5),
		getData("Adactin Data", 22, 5),getData("Adactin Data", 23, 5));
		}
		@Test
		public void tc5() throws IOException
		{
			BookingConfirmationPage bookingConfirmationPage = new BookingConfirmationPage();
		String bookingConfirmation = bookingConfirmationPage.bookingConfirmation(getData("Adactin Data", 25, 5));
		updateData("Adactin Data", 26, 7, bookingConfirmation);
		}

		


}
