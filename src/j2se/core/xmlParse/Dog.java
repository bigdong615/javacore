package j2se.core.xmlParse;

public class Dog {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String name;

	private String address;

	private String city;

	private String country;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", address=" + address + ", city=" + city
				+ ", country=" + country + "]";
	}

}
