package com.tcs.dews.bean;

public class SelectedProducts {
	
	private boolean autoIndicator;
	private boolean lifeIndicator;
	private boolean homeIndicator;
	
	private boolean autoHomeIndicator;
	
	public boolean isAutoIndicator() {
		return autoIndicator;
	}
	public void setAutoIndicator(boolean autoIndicator) {
		this.autoIndicator = autoIndicator;
	}
	public boolean isLifeIndicator() {
		return lifeIndicator;
	}
	public void setLifeIndicator(boolean lifeIndicator) {
		this.lifeIndicator = lifeIndicator;
	}
	
	public boolean isHomeIndicator() {
		return homeIndicator;
	}
	public void setHomeIndicator(boolean homeIndicator) {
		this.homeIndicator = homeIndicator;
	}
	public boolean isAutoHomeIndicator() {
		return autoHomeIndicator;
	}
	public void setAutoHomeIndicator(boolean autoHomeIndicator) {
		this.autoHomeIndicator = autoHomeIndicator;
	}
}
