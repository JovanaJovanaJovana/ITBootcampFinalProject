package MyStorePageObject;

public class Customers {
	
	public String first_name, last_name, email, password, address, city, state, zip_code, country, 
	phone_number, address_alias;

	public Customers (String first_name, String last_name, String email, String password, String address, 
			String city, String state, String zip_code, String country, String phone_number, String address_alias) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.country = country;
		this.phone_number = phone_number;
		this.address_alias = address_alias;
	}
	
	
}
