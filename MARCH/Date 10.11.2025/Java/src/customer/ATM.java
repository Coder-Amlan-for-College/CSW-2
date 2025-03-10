package customer;

import java.util.*;
public class ATM{
int acc = 999;
int acc_no;
int passwod = 888;
int pw;
public void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the account number: ");
	acc_no = sc.nextInt();
	System.out.println("Enter the password: ");
	pw = sc.nextInt();
}
public void verify() throws Exception{
	if(acc==acc_no && passwod==pw) {
		System.out.println("Collect your money");
	}
	else {
		InvalidCustomerException ice = new InvalidCustomerException();
		System.out.println(ice.message());
		throw ice;
	}
		
}

}
