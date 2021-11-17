package Automation_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tea_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium jar\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://www.practiceselenium.com/");
		

		//welcome
		w.findElement(By.linkText("Welcome")).click();
		
		
		//Herbal Tea(See Collection)
		
		
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[22]/div/a/span")).click();
		
		//Green Tea Check Out 
		
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span")).click();
		w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
		w.findElement(By.id("name")).sendKeys("rohini");
		w.findElement(By.id("address")).sendKeys("dhule");
		
		//drop down
		Select s = new Select(w.findElement(By.id("card_type")));
		s.selectByVisibleText("Visa");
		s.selectByVisibleText("Mastercard");
		s.selectByVisibleText("American Express");
		s.selectByVisibleText("Diners Club");
		w.findElement(By.id("card_number")).sendKeys("345677");
		w.findElement(By.id("cardholder_name")).sendKeys("kodhe");
		w.findElement(By.id("verification_code")).sendKeys("997867676");
		
		//place holder 
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
		w.findElement(By.linkText("Check Out")).click();
		
		//cancel(defect)
		w.findElement(By.linkText("Cancel")).click();
		
		
		
		//Red Tea Check Out
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[15]/div/a/span")).click();
		w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
		w.findElement(By.id("name")).sendKeys("rohini");
		w.findElement(By.id("address")).sendKeys("dhule");
		
		//drop down
		Select s1 = new Select(w.findElement(By.id("card_type")));
		s1.selectByVisibleText("Visa");
		s1.selectByVisibleText("Mastercard");
		s1.selectByVisibleText("American Express");
		s1.selectByVisibleText("Diners Club");
		w.findElement(By.id("card_number")).sendKeys("344678");
		w.findElement(By.id("cardholder_name")).sendKeys("jagtap");
		w.findElement(By.id("verification_code")).sendKeys("5789423324");
		
		//cancle (defect)
		w.findElement(By.linkText("Cancel")).click();
		w.findElement(By.linkText("Check Out")).click();
		
		//place holder
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
		
		//Oolong Tea Check Out
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[27]/div/a/span")).click();
		w.findElement(By.id("email")).sendKeys("jagtap@gmail.com");
		w.findElement(By.id("name")).sendKeys("rohini");
		w.findElement(By.id("address")).sendKeys("pune");
		
		//drop down
		Select s3 = new Select(w.findElement(By.id("card_type")));
		s3.selectByVisibleText("Visa");
		s3.selectByVisibleText("Mastercard");
		s3.selectByVisibleText("American Express");
		s3.selectByVisibleText("Diners Club");
		w.findElement(By.id("card_number")).sendKeys("799605690");
		w.findElement(By.id("cardholder_name")).sendKeys("sonali");
		w.findElement(By.id("verification_code")).sendKeys("545677888");
		
		//cancle
		w.findElement(By.linkText("Cancel")).click();
		w.findElement(By.linkText("Check Out")).click();
		
		//place holder
		w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
		w.navigate().to("http://www.practiceselenium.com/welcome.html");
		
		        //Loose Tea
		        w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[25]/div/a/span")).click();
		
		        //Green Tea Check Out 
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("dhule");
				
				//drop down
				Select v = new Select(w.findElement(By.id("card_type")));
				v.selectByVisibleText("Visa");
				v.selectByVisibleText("Mastercard");
				v.selectByVisibleText("American Express");
				v.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("345677");
				w.findElement(By.id("cardholder_name")).sendKeys("kodhe");
				w.findElement(By.id("verification_code")).sendKeys("997867676");
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				
				//Red Tea Check Out
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[15]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("dhule");
				
				//drop down
				Select t = new Select(w.findElement(By.id("card_type")));
				t.selectByVisibleText("Visa");
				t.selectByVisibleText("Mastercard");
				t.selectByVisibleText("American Express");
				t.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("344678");
				w.findElement(By.id("cardholder_name")).sendKeys("jagtap");
				w.findElement(By.id("verification_code")).sendKeys("5789423324");
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				
				//Oolong Tea Check Out
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[27]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("jagtap@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("pune");
				
				//drop down
				Select k = new Select(w.findElement(By.id("card_type")));
				k.selectByVisibleText("Visa");
				k.selectByVisibleText("Mastercard");
				k.selectByVisibleText("American Express");
				k.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("799605690");
				w.findElement(By.id("cardholder_name")).sendKeys("sonali");
				w.findElement(By.id("verification_code")).sendKeys("545677888");
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				
				//Flavored Tea
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[14]/div/a/span")).click();
				
				//Green Tea Check Out 
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("dhule");
				
				//drop down
				Select r = new Select(w.findElement(By.id("card_type")));
				r.selectByVisibleText("Visa");
				r.selectByVisibleText("Mastercard");
				r.selectByVisibleText("American Express");
				r.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("345677");
				w.findElement(By.id("cardholder_name")).sendKeys("kodhe");
				w.findElement(By.id("verification_code")).sendKeys("997867676");
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				
				
				//Red Tea Check Out
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[15]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("kodhe@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("dhule");
				
				//drop down
				Select a = new Select(w.findElement(By.id("card_type")));
				a.selectByVisibleText("Visa");
				a.selectByVisibleText("Mastercard");
				a.selectByVisibleText("American Express");
				a.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("344678");
				w.findElement(By.id("cardholder_name")).sendKeys("jagtap");
				w.findElement(By.id("verification_code")).sendKeys("5789423324");
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				
				
				//Oolong Tea Check Out
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[27]/div/a/span")).click();
				w.findElement(By.id("email")).sendKeys("jagtap@gmail.com");
				w.findElement(By.id("name")).sendKeys("rohini");
				w.findElement(By.id("address")).sendKeys("pune");
				
				//drop down
				Select z = new Select(w.findElement(By.id("card_type")));
				z.selectByVisibleText("Visa");
				z.selectByVisibleText("Mastercard");
				z.selectByVisibleText("American Express");
				z.selectByVisibleText("Diners Club");
				w.findElement(By.id("card_number")).sendKeys("799605690");
				w.findElement(By.id("cardholder_name")).sendKeys("sonali");
				w.findElement(By.id("verification_code")).sendKeys("545677888");
				
				//cancel
				w.findElement(By.linkText("Cancel")).click();
				w.findElement(By.linkText("Check Out")).click();
				
				//place holder
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				//Welcome page 1st Morelink
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[18]/div/p/a/span")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				//Welcome page 2nd Morelink
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[15]/div/p/a/span")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				//Our Passion 
				w.findElement(By.linkText("Our Passion")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				
				//Menu 
				w.findElement(By.linkText("Menu")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				//Let's Talk Tea
				w.findElement(By.linkText("Let's Talk Tea")).click();
				w.navigate().to("http://www.practiceselenium.com/welcome.html");
				
				
				w.findElement(By.linkText("Let's Talk Tea")).click();
				w.findElement(By.name("name")).sendKeys("Rohini");
				w.findElement(By.name("email")).sendKeys("kodhe45@gmail.com");
				w.findElement(By.name("subject")).sendKeys("search location");
				w.findElement(By.name("message")).sendKeys("welcome to pune");
				
				
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[18]/div/div[1]/div[5]/input")).click();
				
				
				//Check Out
				w.findElement(By.linkText("Check Out")).click();
				w.findElement(By.id("email")).sendKeys("jagtap56@gmail.com");
				w.findElement(By.id("name")).sendKeys("Yogita");
				w.findElement(By.id("address")).sendKeys("shirud");
				
				
				Select f = new Select(w.findElement(By.id("card_type")));
				f.selectByVisibleText("Visa");
				f.selectByVisibleText("Mastercard");
				f.selectByVisibleText("American Express");
				f.selectByVisibleText("Diners Club");
				
				w.findElement(By.id("card_number")).sendKeys("7337337");
				w.findElement(By.id("cardholder_name")).sendKeys("Yogita.A.Gaikwad");
				w.findElement(By.id("verification_code")).sendKeys("5467");
				w.findElement(By.linkText("Cancel")).click();
				w.navigate().to("http://www.practiceselenium.com/check-out.html");
				w.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
				w.close();// 
				
				
				
	}

}
