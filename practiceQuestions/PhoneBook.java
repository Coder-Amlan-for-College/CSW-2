package practiceQuestions;

import java.util.*;
class Details<T,U>{
	T phnNo;
	public T getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(T phnNo) {
		this.phnNo = phnNo;
	}
	public U getName() {
		return name;
	}
	public void setName(U name) {
		this.name = name;
	}
	U name;
	Details(T phnNo, U name){
		this.phnNo = phnNo;
		this.name = name;
	}
	public boolean equals(Object ob) {
		if(ob instanceof Details) {
			Details details = (Details) ob;
			if(details.getName()==this.getName()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Contact[ Name: "+name+", Phn No: "+phnNo+"]";
	}
}

public class PhoneBook {
      public static void main(String[]args) {
    	  Scanner sc = new Scanner(System.in);
    	  TreeMap<Details> phnBk = new TreeMap<>();
    	  phnBk.put(new Details("9090207454","Amlan"));
    	  phnBk.put(new Details("9090207455","Aman"));
    	  phnBk.put(new Details("9090207456","Alex"));
    	  phnBk.put(new Details("9090207457","Alto"));
    	  phnBk.put(new Details("9090207458","Amlan"));
    	  System.out.print("Enter the name: ");
    	  Object name = sc.next();
      }
}
