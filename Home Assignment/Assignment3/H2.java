package Assignment3;

class CustomNullPointerException extends NullPointerException{
	public CustomNullPointerException(String message) {
		super(message);
	}
}
public class H2 {
   public static void main(String[]args) {
	   try {
		   String str = null;
		   if(str==null) {
			   throw new CustomNullPointerException("CustomNullPointerException Occurred "+"String is null");
		   }
	   }
	   catch(CustomNullPointerException e) {
		   System.err.println(e.getMessage());
	   }
   }
}
