package com.tcs.dews.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tcs.dews.lobintegration.server.LobIntegrationServer;
import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.Coverage;
import com.tcs.dews.lobintegration.to.DisplayData;
import com.tcs.dews.lobintegration.to.PolicyDetails;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;
import com.tcs.dews.lobintegration.to.RiskItem;
import com.tcs.dews.lobintegration.to.TextualDescription;

@Component
public class AutoQuoteServiceImpl implements LobIntegrationServer {

	public BundleItemData retrieveProductDetails(
			ProductDetailsRequestTO productDetails) {

		BundleItemData bundleItemData = new BundleItemData();
		bundleItemData.setPolicyDetails(createPolicyDetails());

		return bundleItemData;
	}

	private PolicyDetails createPolicyDetails() {
		PolicyDetails polDetails = new PolicyDetails();
		polDetails.setIndividualTermPrice(480.00);
		polDetails.setIndividualMonthlyPrice(80.00);
		polDetails.setProductName("Auto Insurance Quote");
		polDetails.setRiskItem(createRiskItem());
		return polDetails;
	}

	private RiskItem createRiskItem() {
		RiskItem riskItem = new RiskItem();
		riskItem.setTextualDescription(createVehicleTextualDescription());
		riskItem.setCoverage(createCoverage());
		return riskItem;
	}

	private Coverage createCoverage() {
		Coverage coverage = new Coverage();
		coverage.setTextualDescription(createCoverageTextualDescription());		
		return coverage;
	}

	private List<TextualDescription> createCoverageTextualDescription() {
		List<TextualDescription> results = new ArrayList<TextualDescription>();
		results.add(createCoverageList());
		return results;		
	}

	private TextualDescription createCoverageList() {
		TextualDescription value = new TextualDescription();
		List<DisplayData> results = new ArrayList<DisplayData>();

		value.setLabel("Coverage Description");
		value.setDisplayData(populateCoverageDisplayData(results));
		return value;		
	}

	private List<DisplayData> populateCoverageDisplayData(
			List<DisplayData> results) {
		results.add(createVehicleInfo("Bodily Injury - ", "100,000-300,000"));
		results.add(createVehicleInfo("Property Damage - ", "100,00-300,000"));
		return results;
	}

	private List<TextualDescription> createVehicleTextualDescription() {
		List<TextualDescription> results = new ArrayList<TextualDescription>();

		results.add(createVehicle());
		return results;
	}

	private TextualDescription createVehicle() {
		TextualDescription value = new TextualDescription();
		List<DisplayData> results = new ArrayList<DisplayData>();

		value.setLabel("Vehicle Description");
		value.setDisplayData(populateVehicleDisplayData(results));
		return value;
	}

	private List<DisplayData> populateVehicleDisplayData(
			List<DisplayData> results) {
		results.add(createVehicleInfo("Vehicle Make", "Toyota Camry"));
		results.add(createVehicleInfo("Vehicle Year", "1994"));
		results.add(createVehicleInfo("Vehicle Model", "4 DR"));
		results.add(createVehicleInfo("Vehicle Body", "Sedan"));

		return results;
	}

	private DisplayData createVehicleInfo(String label, String value) {
		DisplayData displayData = new DisplayData();
		displayData.setLabel(label);
		displayData.setValue(value);
		return displayData;
	}
}
