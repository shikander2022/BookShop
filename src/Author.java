public class Author {
	String firstname;
	String lastname;
	String city;

	public Author(String firstname, String lastname, String city) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}

	public int nameLength() {
		return firstname.length() + lastname.length();
	}

	@Override
	public String toString() {
		return "Author [firstname=" + firstname + ", lastname=" + lastname
				+ ", city=" + city + "]";
	}

}
