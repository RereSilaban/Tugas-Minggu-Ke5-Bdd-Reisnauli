package com.juaracoding.Minggu5.Bdd.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.Minggu5.Bdd.Driver.DriverSingleton;

public class AddToCart {
	
	private static WebDriver driver;
	
	public AddToCart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#block_top_menu > ul > li:nth-child(1)")
	private WebElement btnWomen;
	
	@FindBy(css  = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > h5 > a")
	private WebElement viewWomen;
	
	@FindBy(css = "#quantity_wanted")
	private WebElement addQuantityWomen;
	
	@FindBy(xpath="//*[@id='group_1']")
	private WebElement selectSizeWomen;

	@FindBy(css="#add_to_cart") 
	private WebElement btnAddToCart;
	
	@FindBy(css  = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	private WebElement txtSuccses;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a") 
	private WebElement CO;
	
	@FindBy(css ="#block_top_menu > ul > li:nth-child(2)")
	private WebElement btnDress;
	
	@FindBy (className="fancybox-iframe")
	private WebElement tampilanModal;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]")
	private WebElement viewDress;
	
	@FindBy (css ="#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up")
	private WebElement btnAddQuantity;
	
	@FindBy (css ="#color_8")
	private WebElement btnColorDress;
	
	@FindBy (xpath ="//*[@id=\"group_1\"]")
	private WebElement selectSize;
	
	@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[3]")
	private WebElement btnTshirts;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	private WebElement viewTshirts;
	
	@FindBy (css ="#color_14")
	private WebElement btnColorTshirt;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[1]")
	private WebElement btnCheckOut;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement btnCheckOut2;
	
	@FindBy(xpath ="//*[@id=\"form\"]/p/button")
	private WebElement btnCheckOut3;
	
	@FindBy (css ="#cgv")
	private WebElement checkbox;
	
	@FindBy(xpath ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div")
	private WebElement btnPayment;
	
	@FindBy(xpath ="//*[@id=\"cart_navigation\"]/button")
	private WebElement btnConfirmPayment;
	
	@FindBy (css ="#center_column > div > p")
	private WebElement txtCompleteOrder;
	
		
	public void addToCartWomen(String quantityWomen, String sizeDress) {
		btnWomen.click();
		scrollLayar(driver,"700");
		scroll(viewWomen);
		viewWomen.click();
		scrollLayar(driver,"400");
		addQuantityWomen.clear();
		addQuantityWomen.sendKeys(quantityWomen);
		select(selectSizeWomen).selectByVisibleText(sizeDress);
		btnAddToCart.click();
	}
		
	public void addToCartDress(int quantityDress, String sizeDress) {
		CO.click();
		scrollLayar(driver,"1000");
		btnDress.click();
		scrollLayar(driver,"700");
		scroll(viewDress);
		viewDress.click();
		bacaModal(tampilanModal);
		clickOtomatis(btnAddQuantity, quantityDress);
		btnColorDress.click();
		select(selectSize).selectByVisibleText(sizeDress);
		btnAddToCart.click();
		tutupModal();
		}
	
	public void addToCartTshirts(int quantityTshirts, String sizeTshirts) {
		CO.click();
		scrollLayar(driver,"1000");
		btnTshirts.click();
		scrollLayar(driver,"700");
		scroll(viewTshirts);
		viewTshirts.click();
		clickOtomatis(btnAddQuantity, quantityTshirts);
		btnColorTshirt.click();
		select(selectSize).selectByVisibleText(sizeTshirts);
		btnAddToCart.click();
		}
	
	public void checkOut () {
		CO.click();
		scrollLayar(driver, "1000");
		btnCheckOut.click();
		btnCheckOut2.click();
		checkbox.click();
		btnCheckOut3.click();
		btnPayment.click();
		btnConfirmPayment.click();
		scrollLayar(driver, "500");
	}
	
	public String txtSuccses () {
		return txtSuccses.getText();
		
	}
	
	public boolean txtCompleteOrder () {
	 return txtCompleteOrder.isDisplayed();
	}
	
	public static void bacaModal (WebElement params) {
		try { driver.switchTo().frame(params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void tutupModal () {
		try { driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickOtomatis (WebElement params, int jumlah) {
		for (int i = 0 ; i < jumlah ; i++) {
			params.click();
		}
	}
	
	public static Select select (WebElement params) {
		Select select = new Select(params);
		return select;
		}

	public static void scroll(WebElement params) {
		try {
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true):", params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scrollLayar(WebDriver driver,String num) {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0,"+num+")");
	}
}

