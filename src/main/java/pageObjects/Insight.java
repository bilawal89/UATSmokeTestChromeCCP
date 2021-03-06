package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Insight {

	public WebDriver driver ;
	//public Select Se1;
	
	
	public Insight(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By PAnalysis = By.xpath("//a[@class='top-link' and text()='Purchase Analysis']");
	By CAnalysis = By.xpath("//a[@class='top-link' and text()='Comparative Analysis']");
	By Recommendation = By.xpath("//a[@class='top-link' and text()='Recommendations']");
	By Report=By.xpath("//a[@class='top-link' and text()='Reports']");
	
	By Dashboard= By.xpath("//a[@class='top-link' and text()='Dashboard']");
	By Reports= By.xpath("//a[@class='top-link' and text()='Reports']");
	By SpendAnalysis = By.xpath("//a[@class='top-link' and text()='Spend Analysis']");
	
	
	//By MonthlyView= By.xpath("//*[@id='track-calandar']/div/section/div[1]/div[2]/div/span");
	//By DetailView= By.xpath("//*[@id='track-calandar']/div/section/div[1]/div[2]/div/a/span");
	//By FirstPlus=By.xpath("(//a[@class='btn-expand-content'])[1]");
	//By ReportLink=By.linkText("(6) PLANAR SYSTEMS");
	
	//By CalendarDropdown=By.id("calendarSelectYearMonthly");
	
	//Select Se1= new Select(driver.findElement(By.className("small native-drop native-drop-large")));
	
	public WebElement getSpendAnalysis()
	{
		return driver.findElement(SpendAnalysis);
		
	}
	
	public WebElement getPAnalysis()
	{
		return driver.findElement(PAnalysis);
		
	}
	
	public WebElement getCAnalysis()
	{
		return driver.findElement(CAnalysis);
		
	}
	
	public WebElement getRecommendation()
	{
		return driver.findElement(Recommendation);
		
	}
	
	public WebElement getDashboard()
	{
		return driver.findElement(Dashboard);
		
	}
	
	
	public WebElement getReports()
	{
		return driver.findElement(Report);
		
	}
	/*
	public WebElement getFirstPlus()
	{
		return driver.findElement(FirstPlus);
		
	}
	
	public WebElement getSubscribeBtn()
	{
		return driver.findElement(SubscribeBtn);
		
	}
	
	public WebElement getMonthlyView()
	{
		return driver.findElement(MonthlyView);
		
	}

	public WebElement getDetailView()
	{
		return driver.findElement(DetailView);
		
	}

	public Select getCalendar()
	{
		
		return Se1;
		
	}
	*/
}
