package org.pages;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchHotelPage extends LibGlobal
{
	public SearchHotelPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement ddLocation;
	@FindBy(id="hotels")
	private WebElement ddHotels;
	@FindBy(id="room_type")
	private WebElement ddRoomType;
	@FindBy(id="room_nos")
	private WebElement ddRoomNos;
	@FindBy(id="adult_room")
	private WebElement ddAdultRoom;
	@FindBy(id="child_room")
	private WebElement ddChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	public WebElement getDdLocation() {
		return ddLocation;
	}
	public WebElement getDdHotels() {
		return ddHotels;
	}
	public WebElement getDdRoomType() {
		return ddRoomType;
	}
	public WebElement getDdRoomNos() {
		return ddRoomNos;
	}
	public WebElement getDdAdultRoom() {
		return ddAdultRoom;
	}
	public WebElement getDdChildRoom() {
		return ddChildRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void searchHotel(String ddLocation,String ddHotels, String ddRoomType, String ddRoomNos,String ddAdultRoom,String ddChildRoom) 
	{
		selectByVisibleText(getDdLocation(),ddLocation );
		selectByVisibleText(getDdHotels(),ddHotels );
		selectByVisibleText(getDdRoomType(),ddRoomType );
		selectByVisibleText(getDdRoomNos(),ddRoomNos);
		selectByVisibleText(getDdAdultRoom(),ddAdultRoom );
		selectByVisibleText(getDdChildRoom(),ddChildRoom );
		click(getBtnSubmit());
		
	}
	
	

}
