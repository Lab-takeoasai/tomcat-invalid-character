import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloServletTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		this.driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUrlContainingInvalidCharacters() {
		driver.get("http://localhost:8080/tomcat-gradle/hello?y=1|2");
		WebElement work = driver.findElement(By.id("fine"));
		assertTrue(work != null);
		driver.close();
	}
}
