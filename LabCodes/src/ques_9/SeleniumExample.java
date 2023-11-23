package ques_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("https://www.google.com");

        // Find the search box element using its name attribute value
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type a search query
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the form
        searchBox.submit();

        // Wait for the search results page to load (you might need to add explicit waits in a real-world scenario)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the search results page title contains the expected keyword
        String pageTitle = driver.getTitle();
        String expectedKeyword = "Selenium WebDriver";

        if (pageTitle.contains(expectedKeyword)) {
            System.out.println("Test passed! Search results page contains the expected keyword.");
        } else {
            System.out.println("Test failed! Search results page does not contain the expected keyword.");
        }

        // Close the browser
        driver.quit();
    }
}
