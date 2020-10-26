

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Locators_in_Selenium_IDE.locator;
import Xpath.xPathInSelenium;
import alertAndPopup.AlertDemo;
import alertAndPopup.PopUp;
import clickonImageinSelenium.MyClass;
import dropDownusingSelenium.AccessDropDown;
import findElement.NameDemo;
import findElement.NameDemo2;
import handleWebTable.AccessingNestedTables;
import handleWebTable.UseInspectElementforAccessingTablesinSelenium;
import handleWebTable.UsingAttributesAsPredicates;
import handleWebTable.XPathForTable;
import java_Code_Example.PG1;
import java_Code_Example.PG2;
import java_Code_Example.PG3;
import java_Code_Example.PG4;
import linkTextAndPartialLink.MyClassLinkTextAndPartialLink;
import linkTextAndPartialLink.P1;
import linkTextAndPartialLink.P2;
import linkTextAndPartialLink.P3;
import mouseAndKeuboardEvent.Keyboard;
import mouseAndKeuboardEvent.Mouse;
import selenium_Form_WebElement.Form;
import updown.upload;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String urlChromeDrive="";
		System.out.println("nhap duong dan cua chrome drive");
		urlChromeDrive=scan.next();
		String baseURL="";
		System.setProperty("webdriver.chrome.driver",urlChromeDrive);
		WebDriver driver= new ChromeDriver();
		
		int exam = 0;
		
		System.out.println("1.JAVA Code Example");
		System.out.println("2.Locators in Selenium IDE: CSS Selector, DOM, XPath, Link Text, ID");
		System.out.println("3.Find Element and FindElements in Selenium WebDriver");
		System.out.println("4.Selenium Form WebElement: TextBox, Submit Button, sendkeys(), click()");
		System.out.println("5.How to Select CheckBox and Radio Button in Selenium WebDriver");
		System.out.println("6.How to Click on Image in Selenium Webdriver");
		System.out.println("7.How to Select Value from DropDown using Selenium Webdriver");
		System.out.println("8.Locate Elements by Link Text & Partial Link Text in Selenium Webdriver");
		System.out.println("9.Mouse Click & Keyboard Event: Action Class in Selenium Webdriver");
		System.out.println("10.XPath");
		System.out.println("11.Alert & Popup Window Handling in Selenium WebDriver");
		System.out.println("12.How to Handle Web Table in Selenium WebDriver");
		System.out.println("nhap lua chon");
		exam=scan.nextInt();
		switch (exam) {
		case 1:
		{
			int choise1=0;
			System.out.println("1.PG1");
			System.out.println("2.PG2");
			System.out.println("3.PG3");
			System.out.println("4.PG4");
			System.out.println("nhap lua chon");
			choise1=scan.nextInt();
			switch (choise1){
			case 1:
				PG1 pg1 =new PG1();
				pg1.pg1(driver);
				break;
			case 2:
				PG2 pg2=new PG2();
				pg2.pg2(driver);
				break;
			case 3:
				PG3 pg3= new PG3();
				pg3.pg3(driver);
				break;
			case 4:
				PG4 pg4= new PG4();
				pg4.pg4(driver);
			default:
				break;
			}
			break;
		}
		case 2:
			locator loca=new locator();
			loca.loca(driver);
			break;
		case 3: 
			System.out.println("1.Name Demo 1: check radiobutton");
			System.out.println("2.Name Demo 2: check element");
			
			System.out.println("nhap lua chon");
			int choise3=scan.nextInt();
			switch (choise3){
			case 1:
				NameDemo namedemo1= new NameDemo();
				namedemo1.namedemo(driver);
				break;
			case 2:
				NameDemo2 namedemo2= new NameDemo2();
				namedemo2.namedemo2(driver);
				break;
			
			
		default:
			break;
		}
		case 4:
			Form form= new Form();
			form.form(driver);
			break;
		case 5:
			selectCheckBoxandRadioButton.Form form1= new selectCheckBoxandRadioButton.Form();
			form1.Form(driver);
			break;
		case 6:
			MyClass myClass= new MyClass();
			myClass.myclass(driver);
			break;
		case 7:
			AccessDropDown acc= new AccessDropDown();
			acc.accessDropDown(driver);
			break;
		case 8: 
			System.out.println("1.Mouse Event");
			System.out.println("2.Keyboard Event");
			System.out.println("nhap lua chon");
			int choise8=scan.nextInt();
			switch (choise8){
			case 1:
				MyClassLinkTextAndPartialLink myClassLinkTextAndPartialLink= new MyClassLinkTextAndPartialLink();
				myClassLinkTextAndPartialLink.myClassLinkTextAndPartialLink(driver);
				break;
			case 2:
				P1 p1= new P1();
				p1.p1(driver);
				break;
			case 3:
				P2 p2= new P2();
				p2.p2(driver);
				break;
			case 4:
				P3 p3= new P3();
				p3.p3(driver);
				break;
			
			
	}
		case 9:
			System.out.println("1.Mouse Event");
			System.out.println("2.KeyBoard Event");
			System.out.println("nhap lua chon");
			int choise9=scan.nextInt();
			switch (choise9){
			case 1:
				Mouse mouse=new Mouse();
				mouse.mouse(driver);
				break;
			case 2:
				Keyboard keyboard= new Keyboard();
				keyboard.keyboard(driver);
				break;
			
			

}
		case 10:
			xPathInSelenium XPathInSelenium= new xPathInSelenium();
			XPathInSelenium.xpathInSelenium(driver);
			break;
		case 11:
			System.out.println("1.Alert");
			System.out.println("2.Pop-Up");
			System.out.println("nhap lua chon");
			int choise11=scan.nextInt();
			switch (choise11){
			case 1:
				AlertDemo alertDemo= new AlertDemo();
				try {
					alertDemo.alertDemo(driver);
				} catch (NoAlertPresentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				PopUp popup= new PopUp();
				try {
					popup.popup(driver);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
}
		case 12: 
			System.out.println("1.XPath for Table");
			System.out.println("2.Accessing Nested Tables");
			System.out.println("3.Using Attributes as Predicates");
			System.out.println("4.Shortcut: Use Inspect Element for Accessing Tables in Selenium");

			System.out.println("nhap lua chon");
			int choise12=scan.nextInt();
			switch (choise12){
			case 1:
				XPathForTable xPathForTable=new XPathForTable();
				xPathForTable.xpathForTable(driver);
				break;
			case 2:
				AccessingNestedTables accessingNestedTables= new AccessingNestedTables();
				accessingNestedTables.accessingNestedTables(driver);
				break;
			case 3: 
				UsingAttributesAsPredicates usingAttributesAsPredicates= new UsingAttributesAsPredicates();
				usingAttributesAsPredicates.usingAttributesAsPredicates(driver);
				break;
			case 4: 
				UseInspectElementforAccessingTablesinSelenium useInspectElementforAccessingTablesinSelenium= new UseInspectElementforAccessingTablesinSelenium();
				useInspectElementforAccessingTablesinSelenium.useInspectElementforAccessingTablesinSelenium(driver);
				break;
	}
	}
	}
}
	
