package wave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonLib.Browser;
import Inputs.URL;
import Inputs.URL2;
import Locators.LoginElements;
import Locators.LoginElements2;
import Locators.LoginElements3;

public class wave {
	
	Browser br=new Browser();
	URL url=new URL();
	URL2 url2=new URL2();
	LoginElements log=new LoginElements();
	LoginElements2 log2=new LoginElements2();
	LoginElements3 log3=new LoginElements3();
	
	
	@Test(priority=1)
	public void verify_waveurl() throws InterruptedException {
		
		br.firefox(url.wave_url);
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=2)
	
	public void cred_verify() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log.username)).sendKeys(url.username);
		br.driver.findElement(By.xpath(log.password)).sendKeys(url.password);
		br.driver.findElement(By.xpath(log.signin)).click();
	
		
	}
	
	@Test(priority=3)
	public void esteem() throws InterruptedException{
		
		String expectedresult="This field is required.";
		br.driver.findElement(By.xpath(log.dashboard)).click();
		br.driver.findElement(By.xpath(log.create_new)).click();
		br.driver.findElement(By.xpath(log.esteem)).click();
		br.driver.findElement(By.xpath(log.select_id)).click();
		br.driver.findElement(By.cssSelector(log.select_id1)).click();
		br.driver.findElement(By.xpath(log.save)).click();
		Thread.sleep(2000);
	
		WebElement result=br.driver.findElement(By.xpath(log.verification_esteem));
		Thread.sleep(2000);
		String actual_result=result.getText().toString();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);		
		
		
	}
	
	@Test(priority=4)
	public void esteem_username() throws InterruptedException {
		
		String expectedresult="This field is required";
		br.driver.findElement(By.xpath(log.name_dashboard)).click();
		Thread.sleep(2000);
		br.driver.findElement(By.xpath(log.create_new)).click();
		br.driver.findElement(By.xpath(log.esteem)).click();
		br.driver.findElement(By.xpath(log.select_username)).click();
		br.driver.findElement(By.cssSelector(log.select_username1)).click();
		br.driver.findElement(By.xpath(log.save)).click();
		Thread.sleep(2000);
		
		WebElement result=br.driver.findElement(By.cssSelector(log.verification_username));
		Thread.sleep(2000);
		String actual_result=result.getText().toString();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
	}
	
	@Test(priority=5)
	public void esteem_nothing() throws InterruptedException {
		
		String expectedresult="This field is required";
		br.driver.findElement(By.xpath(log.name_esteem)).click();
		br.driver.findElement(By.xpath(log.create_esteem_nothing)).click();
		br.driver.findElement(By.xpath(log.save)).click();
//		Thread.sleep(2000);
		
		WebElement result=br.driver.findElement(By.cssSelector(log.verfication_nothing));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=6)
	public void esteem_name() throws InterruptedException {
		
		String expectedresult="This field is required.";
		br.driver.findElement(By.xpath(log.name_esteem)).click();
		br.driver.findElement(By.xpath(log.create_esteem_nothing)).click();
		br.driver.findElement(By.xpath(log.select_username)).click();
		br.driver.findElement(By.cssSelector(log.select_username1)).click();
		
		br.driver.findElement(By.xpath(log.select_id)).click();
		br.driver.findElement(By.cssSelector(log.select_id2)).click();
		
		br.driver.findElement(By.xpath(log.estimate_name)).clear();
		br.driver.findElement(By.xpath(log.estimate_number)).clear();
		br.driver.findElement(By.xpath(log.estimate_number)).sendKeys(url.estimate_number);
		br.driver.findElement(By.xpath(log.save)).click();
		Thread.sleep(3000);
		
		WebElement result=br.driver.findElement(By.cssSelector(log.verification_estimatenumber));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=7)
	public void customer_menu() throws InterruptedException {
		
		
		br.driver.findElement(By.xpath(log2.coustomer_menu)).click();
		String expectedresult="Customers";
		WebElement result = br.driver.findElement(By.xpath(log2.verification1));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
	}
	
	@Test(priority=8)
	public void customer_search() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log2.customer_search)).sendKeys(url2.search_string);
		String expectedresult="0";
		WebElement result= br.driver.findElement(By.xpath(log2.verification2));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=9)
	public void customer_addverify() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log2.add_menu)).click();
		Thread.sleep(3000);
		String expectedresult="Add a customer";
		WebElement result=br.driver.findElement(By.xpath(log2.verification3));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
	
	}
	
	@Test(priority=10)
	public void customer_add() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log2.save)).click();
		String expectedresult="This field is required.";
		WebElement result=br.driver.findElement(By.xpath(log2.verification4));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=11)
	public void customer_add1() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log2.customer_name)).sendKeys(url2.name);
		br.driver.findElement(By.xpath(log2.save)).click();
		String expectedresult="Test";
		WebElement result=br.driver.findElement(By.cssSelector(log2.verification5));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=12)
	public void invoice_menu() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log3.invoice_menu)).click();
		String expectedresult="Invoices";
		WebElement result=br.driver.findElement(By.xpath(log3.verification1));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=13)
	public void invoice_search1() throws InterruptedException  {
		
		br.driver.findElement(By.cssSelector(log3.search1)).click();
		br.driver.findElement(By.xpath(log3.select1)).click();
		String expectedresult="No invoices found for your current filters.";
		WebElement result=br.driver.findElement(By.xpath(log3.verification2));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=14)
	public void invoice_search2() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log3.close1)).click();
		br.driver.findElement(By.cssSelector(log3.status)).click();
		br.driver.findElement(By.xpath(log3.status_select)).click();
		String expectedresult="No invoices found for your current filters.";
		WebElement result=br.driver.findElement(By.xpath(log3.verification3));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=15)
	public void invoice_search_draft() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log3.draft)).click();
		String expectedresult="No invoices found for your current filters.";
		WebElement result=br.driver.findElement(By.xpath(log3.verification4));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	@Test(priority=16)
	public void invoice_search_allinvoice() throws InterruptedException {
		
		br.driver.findElement(By.xpath(log3.all_invoice)).click();
		String expectedresult="No invoices found for your current filters.";
		WebElement result=br.driver.findElement(By.xpath(log3.verification5));
		Thread.sleep(3000);
		String actual_result=result.getText().toString();
		Thread.sleep(3000);
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, expectedresult);
		
		
	}
	
	
}
