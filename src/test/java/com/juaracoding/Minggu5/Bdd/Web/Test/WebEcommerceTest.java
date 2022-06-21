package com.juaracoding.Minggu5.Bdd.Web.Test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.Minggu5.Bdd.Config.AutomationFrameworkConfig;
import com.juaracoding.Minggu5.Bdd.Driver.DriverSingleton;
import com.juaracoding.Minggu5.Bdd.Pages.AddToCart;
import com.juaracoding.Minggu5.Bdd.Pages.SignIn;
import com.juaracoding.Minggu5.Bdd.Utils.ConfigurationProperties;
import com.juaracoding.Minggu5.Bdd.Utils.Constants;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class WebEcommerceTest {

	private static WebDriver driver;
	private SignIn signIn;
	private AddToCart addTocart;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		signIn = new SignIn();
		addTocart = new AddToCart();
	}
	
	@AfterAll
	public static void quitDriver() {
		tunggu(5);
		driver.quit();
	}
	// 1 Login.feature
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer login dengan email dan password")
	public void customer_login_dengan_email_password() {
		signIn.loginForm(configurationProperties.getEmail(), configurationProperties.getPassword());
		tunggu(5);
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		assertEquals(configurationProperties.getTxtWelcome(), signIn.getTxtWelcome());
		tunggu(5);
	}
	
	// 2. AddTocart.feature
	@When("Customer menambahkan produk jenis women ke cart")
	public void Customer_memasukan_produk_jenis_women_ke_cart() {
		addTocart.addToCartWomen(configurationProperties.getQuantityWomen(), configurationProperties.getSizeWomen());
		tunggu(5);
	}
	
	@Then("Customer berhasil menambahkan produk jenis women ke cart")
	public void Customer_berhasil_menambahkan_produk_jenis_women_ke_cart() {
		assertEquals(configurationProperties.getTxtSuccses(),addTocart.txtSuccses());
	}
	
	@And("Customer menambahkan produk jenis dress ke cart")
	public void Customer_memasukan_produk_jenis_dress_ke_cart() {
		addTocart.addToCartDress(configurationProperties.getQuantityDress(), configurationProperties.getSizeDress());
		tunggu(5);
	}
	
	@Then("Customer berhasil menambahkan produk jenis dress ke cart")
	public void Customer_berhasil_menambahkan_produk_jenis_dress_ke_cart() {
		assertEquals(configurationProperties.getTxtSuccses(),addTocart.txtSuccses());
		tunggu(5);
	}
	
	@And("Customer menambahkan produk jenis Tshirts ke cart")
	public void Customer_memasukan_produk_jenis_Tshirts_ke_cart() {
		addTocart.addToCartTshirts(configurationProperties.getQuantityTshirts(), configurationProperties.getSizeTshirts());
		tunggu(5);
	}
	
	@Then("Customer berhasil menambahkan produk jenis Tshirts ke cart")
	public void Customer_berhasil_menambahkan_produk_jenis_Tshirts_ke_cart() {
		assertEquals(configurationProperties.getTxtSuccses(),addTocart.txtSuccses());
		tunggu(5);
	}
	
	
	// 3 Payment.features
	@And("Customer melakukan proses checkout")
	public void Customer_melakukan_proses_checkout() {
		addTocart.checkOut();
		tunggu(5);
	}
	
	@Then("Costumer berhasil checkout")
	public void Costumer_berhasil_checkout() {
		if (addTocart.txtCompleteOrder()) {
			System.out.println("content true");
		}else {
			System.out.println(" content false");
		}
		tunggu(5);
	}
	
	
	public static void tunggu(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
