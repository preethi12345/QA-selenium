package com.bofa.loans.carloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINOD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\VINOD\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        FirefoxDriver ravi = new FirefoxDriver();
        ravi.get("http://www.seleniumhq.org/");*/
        
        System.setProperty("webdriver.ie.driver", "C:\\Users\\VINOD\\Downloads\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
        InternetExplorerDriver mili = new InternetExplorerDriver();
        mili.get("http://www.seleniumhq.org/");
	}

}
