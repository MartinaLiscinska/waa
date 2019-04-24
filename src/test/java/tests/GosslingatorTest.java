package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GosslingatorTest {

    @Test

    public void itShouldAddOneRyan() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // 0.spustit prehliadac
        WebDriver driver = new ChromeDriver();
        // 1.otorit stranku
        driver.get("http://localhost:82/gosslingator.php");
        // 2. kliknut na tlacidlo pridat
        driver.findElement(By.id("addRyan")).click();
        // 3. overit pocitanie ryanov
        Assert.assertEquals("1", driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());
        System.out.println("Number of ryans:" + driver.findElement(By.cssSelector("div.ryan-counter h2")).getText());
        // vypisem si do console aktualny pocet ryanov
        Assert.assertEquals("ryan", driver.findElement(By.cssSelector("div.ryan-counter h3")).getText());
        // 4. zatvorit prehliadac
        driver.close();
        // 5. ukoncit session
        driver.quit();
        //CTRL+D
    }


    @Test

    public void itShouldDisplayTitle() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // 0.spustit prehliadac
        WebDriver driver = new ChromeDriver();
        // 1.otorit stranku
        driver.get("http://localhost:82/gosslingator.php");

        System.out.printf(driver.findElement(By.cssSelector(".ryan-title")).getText());
        Assert.assertEquals("GOSLINGATE ME", driver.findElement(By.cssSelector(".ryan-title")).getText());

        // 4. zatvorit prehliadac
        driver.close();
        // 5. ukoncit session
        driver.quit();
    }

    @Test

    public void itShouldDisplayWarningMessage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // 0.spustit prehliadac
        WebDriver driver = new ChromeDriver();
        // 1.otorit stranku
        driver.get("http://localhost:82/gosslingator.php");
        // 2. kliknut na tlacidlo pridat
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        driver.findElement(By.id("addRyan")).click();
        // 3. overit pocitanie ryanov
        Assert.assertEquals("NUMBER OF\n" +
                "RYANS\n" +
                "IS TOO DAMN\n" +
                "HIGH", driver.findElement(By.cssSelector("h1.tooManyRyans")).getText());

        // 4. zatvorit prehliadac
        driver.close();
        // 5. ukoncit session
        driver.quit();
        //CTRL+D
    }
}