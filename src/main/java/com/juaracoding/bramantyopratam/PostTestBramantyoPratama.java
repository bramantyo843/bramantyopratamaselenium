package com.juaracoding.bramantyopratam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class PostTestBramantyoPratama {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\chromedriver.exe");

        // WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        delay();
        //*[@id="first-name"]
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstName.sendKeys("Bramantyo"); //sendKeys("JuaraCoding")
        System.out.println("input first name berhasil");

        delay();
        //*[@id="last-name"]
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        lastName.sendKeys("Pratama"); //sendKeys("JuaraCoding")
        System.out.println("input last name berhasil");

        delay();
        //*[@id="job-title"]
        WebElement pekerjaan = driver.findElement(By.xpath("//*[@id=\"job-title\"]"));
        pekerjaan.sendKeys("Administrasi"); //sendKeys("JuaraCoding")
        System.out.println("input Pekerjaan berhasil");

        delay();
        driver.findElement(By.xpath("//*[@id=\"radio-button-1\"]")).click();
        System.out.println("High School klik");

        delay();
        driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]")).click();
        System.out.println("Collage klik");

        delay();
        driver.findElement(By.xpath("//*[@id=\"radio-button-3\"]")).click();
        System.out.println("Grad School klik");

        delay();
        driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
        System.out.println(" jenis kelamin laki laki klik");

        delay();
        driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]")).click();
        System.out.println("jenis kelamin perempuan klik");

        //*[@id="checkbox-3"]

        delay();
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click();
        System.out.println("tidak ingin input kelamin klik");

       // driver.findElement(By.id("userEmail")).sendKeys("info@juaracoding.com");
       // System.out.println("input user email");

//        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
  //      System.out.println("input current address");

    //    driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
      //  System.out.println("input permanent address");

        delay();
        js.executeScript("window.scrollBy(0,1000)");


        delay();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("Submit klik");



        delay();
    }

    static void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

    }
}
