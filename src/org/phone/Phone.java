package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("enter the PhoneInfo:");
		
		System.out.println("enter the PhoneIn5");
		
		
		
		
		
		
		
	}
	private void phoneName(String name) {
		System.out.println("enter the phoneName:" +name);
		
	}
	private void phoneNumber(int id) {
		System.out.println("enter the phoneNumber is:" +id);	
	}
    private void phonePassWord(String surname, int id) {
	    System.out.println("enter the PassWord is :" +surname);
	    System.out.println("enter the PhonePassword is :" +id);
}
    private void phoneCusDetails(int id,String addr) {
		System.out.println("enter the customer Pincode is: "   +id);
		System.out.println("enter the Customer Address is:"  +addr);

	}
    public static void main(String[] args) {
		Phone a=new Phone();
		a.phoneInfo();
		a.phoneName("APPLE NOTE 10");
		a.phoneNumber(778036441);
		a.phonePassWord("Aswand",234143);                                               
		a.phoneCusDetails(639201, "musiri");
		
	}
}
