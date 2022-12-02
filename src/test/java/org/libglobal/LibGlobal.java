package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal 
{
	//WebDriver:I
	public static WebDriver driver;
	
	public static void url(String url) 
	{
		driver.get(url);
	}
	public String getTitle() 
	{
		String title = driver.getTitle();
		return title;
	}
	public String getCurentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public void close() 
	{
	   driver.close();	
	}
	public static void quit() 
	{
		driver.quit();
	}
	public static Options manage() 	
	{
		Options manage = driver.manage();
		return manage;
	}
	public TargetLocator switchTo() 
	{
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}
	public String getWindowHandle() 
	{
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public Set<String> getWindowHandles() 
	{
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public Navigation navigate() 
	{
		Navigation navigate = driver.navigate();
		return navigate;
	}
	
	//WebElement:I
	
	public void sendKeys(WebElement element,String value) 
	{
		element.sendKeys(value);
	}
	public void click(WebElement element) 
	{
		element.click();
	}
	public String getText(WebElement element)
	{
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element,String name)
	{
		String attribute = element.getAttribute(name);
		return attribute;
	}
	public boolean isDisplayed(WebElement element) 
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public boolean isEnabled(WebElement element) 
	{
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public boolean isSelected(WebElement element) 
	{
		boolean selected = element.isSelected();
		return selected;
	}
	public void to(String url) 
	{
		navigate().to(url);
	}
	public void forward() 
	{
		navigate().forward();	
	}
	public void back()
	{
		navigate().back();
	}
	public void refresh()
	{
		navigate().refresh();
	}
	public Actions actions()
	{
		Actions actions = new Actions(driver);
		return actions;
	}
	public void moveToElement(WebElement element) 
	{
		actions().moveToElement(element).perform();
	}
	public void contextClick() 
	{
		actions().contextClick().perform();
	}
	public void doubleClick() 
	{
		actions().doubleClick().perform();
	}
	public void dragAndDrop(WebElement source,WebElement target) 
	{
		actions().dragAndDrop(source, target).perform();
	}
	
	//Select:C
	
	public Select select(WebElement element)
	{
		Select s = new Select(element);
		return s;
	}
	public void selectByIndex(WebElement element,int index) 
	{
		select(element).selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value) 
	{
		select(element).selectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String text)
	{
		select(element).selectByVisibleText(text);
	}
	public void deselectAll(WebElement element)
	{
		select(element).deselectAll();
	}
	public List<WebElement> getOptions(WebElement element)
	{
		List<WebElement> options = select(element).getOptions();
		return options;
	}
	public boolean isMulitiple(WebElement element) 
	{
		boolean multiple = select(element).isMultiple();
		return multiple;
	}
	public List<WebElement> getAllSelectedOptions(WebElement element)
	{
		List<WebElement> allSelectedOptions = select(element).getAllSelectedOptions();
		return allSelectedOptions;
	}
	public WebElement getFirstSelectedOption(WebElement element)
	{
		WebElement firstSelectedOption = select(element).getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	//Alert
	public Alert alert()
	{
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public void accept() 
	{
		alert().accept();
	}
	public void dismiss() 
	{
		alert().dismiss();
	}
	public void alertSendkeys(String text)
	{
		alert().sendKeys(text);
	}
	public String alertgetText()
	{
		String text = alert().getText();
		return text;
	}
	public WebDriver frame(String idOrName) 
	{
		WebDriver frame = switchTo().frame(idOrName);
		return frame;
	}
	public WebDriver frame(int index)
	{
		WebDriver frame = switchTo().frame(index);
		return frame;
	}
	public WebDriver frame(WebElement frameElement)
	{
		WebDriver frame = switchTo().frame(frameElement);
		return frame;
	}
	
	public static void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maximizeWindow() 
	{
		manage().window().maximize();
	}
	
	public static void implicitWait(long seconds) 
	{
		manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public String getData(String sheetName,int rowNum,int cellNum) throws IOException 
	{
		String value = null;
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\AdactinHotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNum);
		Cell cell = r.getCell(cellNum);
		CellType cellType = cell.getCellType();
		switch (cellType) 
		{
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				value = dateFormat.format(dateCellValue);
				
			}
			else
			{
				double numericCellValue = cell.getNumericCellValue();
				 long v = (long)numericCellValue;
				 value = String.valueOf(v);
			}
			
			break;

		}
		return value;	
	}
	public void updateData(String sheetName,int rowNum,int cellNum,String data) throws IOException
	{
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\AdactinHotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNum);
		Cell cell = r.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream o = new FileOutputStream(file);
		w.write(o);
		
	}
	
	
	public WebElement findElementById(String id)
	{
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public WebElement findElementByXpath(String id)
	{
		WebElement element = driver.findElement(By.xpath(id));
		return element;
	}
}
