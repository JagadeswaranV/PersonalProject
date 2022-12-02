package org.excel.concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterDataInExcel 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("hai");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> iphoneList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\ExcelWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Iphone List");
		
		List<String> li = new ArrayList<String>();
		
		for (int i = 0; i < iphoneList.size(); i++)
		{
			WebElement eachIphone = iphoneList.get(i);
			String text = eachIphone.getText();
			//System.out.println(text);
			
			li.add(text);
			//System.out.println("hello");
			//System.out.println(li);
			if(i==iphoneList.size()-1)
			{
				
				
				for (int j = 0; j <li.size(); j++)
				{
					Row createRow = s.createRow(j);
					Cell createCell = createRow.createCell(0);
					createCell.setCellValue(li.get(j));
					
				}
				
				FileOutputStream o = new FileOutputStream(file);
				w.write(o);
				System.out.println("Done");

				
			}
			
		}
		
				
		
	}

}
