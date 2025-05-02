package functionalProgramming;

public class Q2 {
    @FunctionalInterface
	interface printingSomeText{
	   void print(String anyValue);
   }
   public void printLamdaText(String lamdaText, printingSomeText pst) {
	   pst.print(lamdaText);
   }
	public static void main(String[] args) {
		Q2 lmd1 = new Q2();
		String lamdaText = "Understanding lamdas";
		printingSomeText pst = (String letsPrint)->{System.out.println(letsPrint);};
		lmd1.printLamdaText(lamdaText, pst);
	}
}
/*OUTPUT:
 Understanding lamdas
*/



//WITHOUT LAMDA
/*public class Q2 {
    @FunctionalInterface
	interface printingSomeText{
	   void print(String anyValue);
   }
   public void printLamdaText(String lamdaText, printingSomeText pst) {
	   pst.print(lamdaText);
   }
	public static void main(String[] args) {
		Q2 lmd1 = new Q2();
		String lamdaText = "Understanding lamdas";
		printingSomeText pst = new printingSomeText(){
		@Override
		public void print(String anyValue){
		 System.out.println(anyValue); 
		}
		}
		lmd1.printLamdaText(lamdaText, pst);
	}
}
*/