package com.tcs.dews.lobintegration.to;

import java.util.Date;

public class PolicyDetails {

	private String policyNumber ;
	private Double individualMonthlyPrice;
	private Double individualTermPrice;
	private RiskItem riskItem;
	private String productName;
	private String stateCode;
	private String countryCode;
	private Date effectiveDate;
	private Date policyExpirationDate;
	
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Double getIndividualMonthlyPrice() {
		return individualMonthlyPrice;
	}
	public void setIndividualMonthlyPrice(Double individualMonthlyPrice) {
		this.individualMonthlyPrice = individualMonthlyPrice;
	}
	public Double getIndividualTermPrice() {
		return individualTermPrice;
	}
	public void setIndividualTermPrice(Double individualTermPrice) {
		this.individualTermPrice = individualTermPrice;
	}
	public RiskItem getRiskItem() {
		return riskItem;
	}
	public void setRiskItem(RiskItem riskItem) {
		this.riskItem = riskItem;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getPolicyExpirationDate() {
		return policyExpirationDate;
	}
	public void setPolicyExpirationDate(Date policyExpirationDate) {
		this.policyExpirationDate = policyExpirationDate;
	}
	
	
}
