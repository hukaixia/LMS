package jmu.hw.po;

public class Region {
    private String regionId;

    private String cityId;

    private String regionName;
    
    private City city;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
    
}