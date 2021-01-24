import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestofSelenium {

	public static void main(String[] args) {


		//System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\chromedriver_win32 (2)\\chromedriver.exe");

		//WebDriver chdriver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","G:\\Recent 3\\Recent final All videos\\BITM\\geckodriver-v0.28.0-win64\\geckodriver.exe");

		//WebDriver fxdriver = new FirefoxDriver();


		//System.setProperty("webdriver.ie.driver","G:\\Recent 3\\Recent final All videos\\BITM\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");

		//WebDriver iedriver = new InternetExplorerDriver();




		//Driver initialization
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();



		//Access URL
		driver.get("https://opensource-demo.orangehrmlive.com/");



		//LoginTest

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();

		System.out.println("Logged In Successfully");


		//AssignLeaveTest

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]")).sendKeys("Odis Adalwin");


		Select leaveType = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/select")));

		leaveType.selectByVisibleText("US - Vacation");


		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/input")).click();

		Select fromYear = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]")));

		fromYear.selectByValue("2020");

		Select frommonth = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")));

		frommonth.selectByValue("11");

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[2]/a")).click();



		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input")).click();

		Select toYear = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]")));

		toYear.selectByValue("2020");

		Select tomonth = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/select[1]")));

		tomonth.selectByValue("11");
		

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[7]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[10]/textarea")).sendKeys("Test Automation");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input")).click();
		
		System.out.println("Assigned Leave Successfully");



	}
}