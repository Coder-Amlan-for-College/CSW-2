package Strings;

import javax.swing.plaf.synth.SynthProgressBarUI;

public class Q3 {
  public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Anusandhan");
	sb.append(", Address");
	System.out.println("Append: "+sb);
	sb.insert(5, " Person");
	System.out.println("Insert:"+sb);
	sb.delete(5, 10);
	System.out.println("Delete: "+sb);
	
 }
}
