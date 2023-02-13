package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kk company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kayalvizhi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kk");
		driver.findElement(By.name("departmentName")).sendKeys("tech");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("bsjahkdsdmdmkjjj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d =new Select(source);
		d.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("description")).sendKeys("chbjknhuvcc");
		driver.findElement(By.name("importantNote")).sendKeys("avhhgdejhdeudbjhd");
		driver.findElement(By.className("smallSubmit")).click();
System.out.println("The title is  :"+driver.getTitle());
	}
	}


