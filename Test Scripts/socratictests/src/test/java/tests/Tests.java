package tests;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass {
    
	@Test
	//Linear-Lower Case
	public void testLinear1()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp1);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_LowerCase" + ".jpg"));
            
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp1);
	            System.out.println("App Output: " + outputData.get(10));
	            System.out.println("Expected Output: "+Constants.linearOut1);
	            if (outputData.get(10).trim().contains(Constants.linearOut1)) {
	                System.out.println("Linear Test Case 1: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 1: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Upper Case
	public void testLinear2()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp2);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_UpperCase" + ".jpg"));
            
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(7)+";" + outputData.get(8);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp2);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut2);
	            if (str.trim().contains(Constants.linearOut2)) {
	                System.out.println("Linear Test Case 2: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 2: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Different Language
	public void testLinear3()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp3);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_DiffLanguage" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp3);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut3);
	            if (str.trim().contains(Constants.linearOut3)) {
	                System.out.println("Linear Test Case 3 Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 3: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Different Variables
	public void testLinear4()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp4);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_DiffVariables" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp4);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut4);
	            if (str.trim().contains(Constants.linearOut4)) {
	                System.out.println("Linear Test Case 4: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 4: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Mistake in the Equation
	public void testLinear5()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp5);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_MistakeInEquation" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp5);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut5);
	            if (str.trim().contains(Constants.linearOut5)) {
	                System.out.println("Linear Test Case 5: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 5: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Using Special Characters as Variables
	public void testLinear6()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp6);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_SpecialChars" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp6);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut6);
	            if (str.trim().contains(Constants.linearOut6)) {
	                System.out.println("Linear Test Case 6: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 6: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Linear-Word problem
	public void testLinear7()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.linearInp7);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Linear_WordProblem" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.linearInp7);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.linearOut7);
	            if (str.trim().contains(Constants.linearOut7)) {
	                System.out.println("Linear Test Case 7: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Linear Test Case 7: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	
	@Test
	//Quadratic-Lower Case
	public void testquadratic1()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp1);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_LowerCase" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(11);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp1);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut1);
	            if (str.trim().contains(Constants.quadraticOut1)) {
	                System.out.println("Quadratic Test Case 1: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 1: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Upper Case
	public void testquadratic2()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp2);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_UpperCase" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp2);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut2);
	            if (str.trim().contains(Constants.quadraticOut2)) {
	                System.out.println("Quadratic Test Case 2: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 2: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Different Language
	public void testquadratic3()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp3);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_DiffLanguage" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp3);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut3);
	            if (str.trim().contains(Constants.quadraticOut3)) {
	                System.out.println("Quadratic Test Case 3: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 3: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Different Variables
	public void testquadratic4()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp4);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_DiffVariables" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp4);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut4);
	            if (str.trim().contains(Constants.quadraticOut4)) {
	                System.out.println("Quadratic Test Case 4: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 4: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Mistake in the Equation
	public void testquadratic5()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp5);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_MistakeInEquation" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp5);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut5);
	            if (str.trim().contains(Constants.quadraticOut5)) {
	                System.out.println("Quadratic Test Case 5: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 5: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Using Special Characters as Variables
	public void testquadratic6()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp6);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_SpecialChars" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp6);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut6);
	            if (str.trim().contains(Constants.quadraticOut6)) {
	                System.out.println("Quadratic Test Case 6: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 6: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Quadratic-Word problem
	public void testquadratic7()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.quadraticInp7);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Quadratic_SpecialChars" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.quadraticInp7);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.quadraticOut7);
	            if (str.trim().contains(Constants.quadraticOut7)) {
	                System.out.println("Quadratic Test Case 7: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Quadratic Test Case 7: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	
	@Test
	//Polynomial-Lower Case
	public void testpoly1()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp1);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_LowerCase" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(9);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp1);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut1);
	            if (str.trim().contains(Constants.polyOut1)) {
	                System.out.println("Polynomial Test Case 1: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 1: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Upper Case
	public void testpoly2()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp2);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_UpperCase" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(7);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp2);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut2);
	            if (str.trim().contains(Constants.polyOut2)) {
	                System.out.println("Polynomial Test Case 2: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 2: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Different Language
	public void testpoly3()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp3);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_DiffLanguage" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp3);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut3);
	            if (str.trim().contains(Constants.polyOut3)) {
	                System.out.println("Polynomial Test Case 3: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 3: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Different Variables
	public void testpoly4()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp4);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_DiffVariables" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp4);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut4);
	            if (str.trim().contains(Constants.polyOut4)) {
	                System.out.println("Polynomial Test Case 4: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 4: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Mistake in the Equation
	public void testpoly5()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp5);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_MistakeInEquation" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp5);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut5);
	            if (str.trim().contains(Constants.polyOut5)) {
	                System.out.println("Polynomial Test Case 5: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 5: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Using Special Characters as Variables
	public void testpoly6()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp6);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_SpecialChars" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp6);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut6);
	            if (str.trim().contains(Constants.polyOut6)) {
	                System.out.println("Polynomial Test Case 6: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 6: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Polynomial-Word problem
	public void testpoly7()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.polyInp7);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Polynomial_WordProblem" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.polyInp7);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.polyOut7);
	            if (str.trim().contains(Constants.polyOut7)) {
	                System.out.println("Polynomial Test Case 7: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Polynomial Test Case 7: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	
	@Test
	//Exponential-Lower Case
	public void testexpo1()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp1);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_LowerCase" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp1);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut1);
	            if (str.trim().contains(Constants.expoOut1)) {
	                System.out.println("Exponential Test Case 1: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 1: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Upper Case
	public void testexpo2()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp2);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_UpperCase" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp2);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut2);
	            if (str.trim().contains(Constants.expoOut2)) {
	                System.out.println("Exponential Test Case 2: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 2: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Different Language
	public void testexpo3()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp3);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_DiffLanguage" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp3);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut3);
	            if (str.trim().contains(Constants.expoOut3)) {
	                System.out.println("Exponential Test Case 3: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 3: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Different Variables
	public void testexpo4()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp4);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_DiffVariables" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp4);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut4);
	            if (str.trim().contains(Constants.expoOut4)) {
	                System.out.println("Exponential Test Case 4: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 4: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Mistake in the Equation
	public void testexpo5()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp5);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_MistakeInEquation" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp5);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut5);
	            if (str.trim().contains(Constants.expoOut5)) {
	                System.out.println("Exponential Test Case 5: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 5: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Using Special Characters as Variables
	public void testexpo6()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp6);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_SpecialChars" + ".jpg"));
            
            //System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp6);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut6);
	            if (str.trim().contains(Constants.expoOut6)) {
	                System.out.println("Exponential Test Case 6: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 6: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
	
	
	@Test
	//Exponential-Word problem
	public void testexpo7()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        final String FOLDER_PATH = "output/";
		try
		{
			//Open the app
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Socratic");
			el1.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        
	        //Type the question in text query
	        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Type a question");
	        el2.click();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        MobileElement el3 = (MobileElement) driver.findElementById("com.google.socratic:id/text_query");
	        el3.sendKeys(Constants.expoInp7);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        el3.click();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        //Click on send
	        HashMap<String,String> map = new HashMap();
	        map.put("action", "send");
	        driver.executeScript("mobile:performEditorAction", map);
	        WebDriverWait wait = new WebDriverWait(driver, 50);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        //Get Output Data
	        List<String> outputData = new ArrayList();
	        List<MobileElement> text1 = driver.findElements(By.className("android.widget.TextView"));
	        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File(FOLDER_PATH + "Exponential_WordProblem" + ".jpg"));
            
            System.out.println(text1);
	        for (MobileElement ele : text1) {
	            outputData.add(ele.getText());
	        }
	        System.out.println(outputData);
	        
	        //Check for passed or failed here by comparison
	        String str = outputData.get(3);
	        if (outputData.size() >= 0) {
	            System.out.println("App Input: " + Constants.expoInp7);
	            System.out.println("App Output: " + str);
	            System.out.println("Expected Output: "+Constants.expoOut7);
	            if (str.trim().contains(Constants.expoOut7)) {
	                System.out.println("Exponential Test Case 7: Passed");
	                System.out.println();
	                passedCase++;
	            } else {
	                System.out.println("Exponential Test Case 7: Failed");
	                System.out.println();
	                failedCase++;
	            }
	        }
		}
		catch (Exception e)
        {
			e.printStackTrace();
        }
        
        //Back to Home Screen
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
	}
}
