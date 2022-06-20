package com.juaracoding.Minggu5.Bdd.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("frameworkData.properties")
public class ConfigurationProperties {

	
	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value ("${quantityWomen}")
	private String quantityWomen;
	
	@Value ("${sizeWomen}")
	private String sizeWomen; 

	@Value ("${quantityDress}")
	private int quantityDress;
	
	@Value ("${sizeWomen}")
	private String sizeDress; 

	@Value ("${quantityTshirts}")
	private int quantityTshirts;
	
	@Value ("${sizeTshirts}")
	private String sizeTshirts; 
	
	@Value ("${txtSuccses}")
	private String txtSuccses;
	
	
//Getter dan Setter
	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}
	
	public String getQuantityWomen() {
		return quantityWomen;
	}

	public void setQuantityWomen(String quantityWomen) {
		this.quantityWomen = quantityWomen;
	}

	public String getSizeWomen() {
		return sizeWomen;
	}

	public void setSizeWomen(String sizeWomen) {
		this.sizeWomen = sizeWomen;
	}

	public int getQuantityDress() {
		return quantityDress;
	}

	public void setQuantityDress(int quantityDress) {
		this.quantityDress = quantityDress;
	}

	public String getSizeDress() {
		return sizeDress;
	}

	public void setSizeDress(String sizeDress) {
		this.sizeDress = sizeDress;
	}

	public String getTxtSuccses() {
		return txtSuccses;
	}

	public void setTxtSuccses(String txtSuccses) {
		this.txtSuccses = txtSuccses;
	}

	public int getQuantityTshirts() {
		return quantityTshirts;
	}

	public void setQuantityTshirts(int quantityTshirts) {
		this.quantityTshirts = quantityTshirts;
	}

	public String getSizeTshirts() {
		return sizeTshirts;
	}

	public void setSizeTshirts(String sizeTshirts) {
		this.sizeTshirts = sizeTshirts;
	}
	
}
