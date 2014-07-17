package com.tcs.dews.lobintegration.to;

import java.util.List;

public class RiskItem {

	private List<TextualDescription> textualDescription ;
	
	private Coverage coverage ;

	public List<TextualDescription> getTextualDescription() {
		return textualDescription;
	}

	public void setTextualDescription(List<TextualDescription> textualDescription) {
		this.textualDescription = textualDescription;
	}

	public Coverage getCoverage() {
		return coverage;
	}

	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	
	
}
