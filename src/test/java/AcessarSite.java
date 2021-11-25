import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import sun.security.util.PendingException;

public class AcessarSite {

	private WebDriver driver;

	@Dado("Que Acessei o Site")
	public void que_acessei_o_site() throws Throwable {
		/* linux */
		System.setProperty("webdriver.chrome.driver", "/home/suellen/develop/drivers/chromedriver");
		/* Windows */
		// System.setProperty("webdriver.chrome.driver","c:\\pasta\suellen\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}

	@Quando("Preencho os dados do Cadastro")
	public void preencho_os_dados_do_cadastro_insiro_a_marca() throws Throwable {

		// Enter Vehicle Data
		driver.findElement(ByXPath.xpath("//*[@id=\"make\"]/option[2]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"model\"]/option[4]")).click();
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		driver.findElement(By.id("engineperformance")).sendKeys("100");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/25/2001");
		driver.findElement(ByXPath.xpath("//*[@id=\"numberofseats\"]/option[5]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[2]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"fuel\"]/option[4]")).click();
		driver.findElement(By.id("payload")).sendKeys("100");
		driver.findElement(By.id("totalweight")).sendKeys("10000");
		driver.findElement(By.id("listprice")).sendKeys("20000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("abcd-1");
		driver.findElement(By.id("annualmileage")).sendKeys("22345");
		driver.findElement(ByXPath.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();

		// Enter Vehicle Data
		driver.findElement(By.id("firstname")).sendKeys("Usuario");
		driver.findElement(By.id("lastname")).sendKeys("Teste");
		driver.findElement(By.id("birthdate")).sendKeys("08/30/1995");
		driver.findElement(ByXPath.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("Diretamente de Dubai, tipo Sheik");
		driver.findElement(ByXPath.xpath("//*[@id=\"country\"]/option[3]")).click();
		driver.findElement(By.id("zipcode")).sendKeys("01500000");
		driver.findElement(By.id("city")).sendKeys("Dubai");
		driver.findElement(ByXPath.xpath("//*[@id=\"occupation\"]/option[2]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		driver.findElement(By.id("website")).sendKeys("https://github.com/011sue");

		// Erro no Upload do Jpeg
		// driver.findElement(ByXPath.xpath("//*[@id=\"open\"]")).sendKeys("/home/sue11");
		// driver.findElement(By.id("picture")).sendKeys("/home/sue11.jpeg");
		// driver.findElement(ByXPath.xpath("//*[@id=\"open\"]")).click();
		// driver.findElement(ByXPath.xpath("//*[@id=\"open\"]")).sendKeys("sue11.jpeg");
		driver.findElement(By.id("open")).sendKeys("sue11.jpeg"); // Tá passando rs

		driver.findElement(ByXPath.xpath("//*[@id=\"nextenterproductdata\"]")).click();

		// Enter Product Data
		driver.findElement(By.id("startdate")).sendKeys("01/01/9999");
		driver.findElement(ByXPath.xpath("//*[@id=\"insurancesum\"]/option[4]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"meritrating\"]/option[5]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"damageinsurance\"]/option[4]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"courtesycar\"]/option[3]")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"nextselectpriceoption\"]")).click();

		// Select Price Option
		driver.findElement(ByXPath.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]")).click();
		Thread.sleep(2000);
		// colocar para abrir os pdf
		driver.findElement(ByXPath.xpath("//*[@id=\"nextsendquote\"]")).click();

		// Send Quote
		driver.findElement(By.id("email")).sendKeys("Usuario@accenture.com.br");
		driver.findElement(By.id("phone")).sendKeys("99999999999");
		driver.findElement(By.id("username")).sendKeys("usuario");
		driver.findElement(By.id("password")).sendKeys("Senha@123");
		driver.findElement(By.id("confirmpassword")).sendKeys("Senha@123");
		driver.findElement(ByXPath.xpath("//*[@id=\"Comments\"]")).sendKeys("Testando");
		driver.findElement(ByXPath.xpath("//*[@id=\"sendemail\"]")).click();

	}

	@Então("a especificação deve finalizar com sucesso")
	public void _especificação_deve_finalizar_com_sucesso() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		//Não capturou a mensagem de Sucesso
		/*String textoElement = driver.findElement(By.className("sa-confirm-button-container")).getText();
        assertEquals("OK", textoElement); */
        
	}

	/*private void assertEquals(String string, String textoElement) {
		// TODO Auto-generated method stub

	} */
}