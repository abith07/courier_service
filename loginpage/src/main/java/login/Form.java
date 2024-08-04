package login;

public class Form {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String address;
    private String address1;
    private String contact;
    private String state;
    private String date;
    private int pin;
    private String pinf;
    private String dtv;
    private String paymentMethod;

    public Form(String firstName, String lastName, String username, String email, String address, String address1, String contact, String state, String date, int pin, String pinf, String dtv, String paymentMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.address = address;
        this.address1 = address1;
        this.contact = contact;
        this.state = state;
        this.date = date;
        this.pin = pin;
        this.pinf = pinf;
        this.dtv = dtv;
        this.paymentMethod = paymentMethod;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPinf() {
		return pinf;
	}

	public void setPinf(String pinf) {
		this.pinf = pinf;
	}

	public String getDtv() {
		return dtv;
	}

	public void setDtv(String dtv) {
		this.dtv = dtv;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

    
}
