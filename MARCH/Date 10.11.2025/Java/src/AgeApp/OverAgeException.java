package AgeApp;
class UnderAgeException extends Exception{
	public String msg() {
		return "Under Age! Not Eligible";
	}
} 

public class OverAgeException extends Exception{
	public String msg() {
		return "Over Age! Not Eligible";
	}
} 

