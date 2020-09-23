package smallStore;

public class Address {
	
	private int houseNumber;
	private String cityName;
	private String stateName;
	private String countryNameString;
	
	
	public int gethouseNumber() {
		return houseNumber;
	}
	public void sethouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryNameString() {
		return countryNameString;
	}
	public void setCountryNameString(String countryNameString) {
		this.countryNameString = countryNameString;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", "
				+ "cityName=" + cityName + ", "
				+ "stateName=" + stateName
				+ ", countryNameString=" + countryNameString + "]";
	}
	
	
	
	
	
	
	
	

}
