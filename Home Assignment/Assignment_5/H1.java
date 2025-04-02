package Assignment_5;

public class H1 {
    public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3=  new String("Hello");
		String str4=  new String("Hello");
		System.out.println("Memory address of str1: "+System.identityHashCode(str1));
		System.out.println("Memory address of str2: "+System.identityHashCode(str2));
		System.out.println("Memory address of str3: "+System.identityHashCode(str3));
		System.out.println("Memory address of str4: "+System.identityHashCode(str4));
		System.out.println("Comparison between str1 and str2: "+(str1 == str2));
		System.out.println("Comparison between str1 and str3: "+(str1 == str3));
		System.out.println("Comparison between str3 and str4: "+(str3 == str4));
		System.out.println("Comparison between str1 and str3 (content): "+(str1.equals(str3)));
		System.out.println("Comparison between str3 and str4 (content): "+(str3.equals(str4)));
	}
}

//OUTPUT:
//	Memory address of str1: 1509514333
//	Memory address of str2: 1509514333
//	Memory address of str3: 1590550415
//	Memory address of str4: 1058025095
//	Comparison between str1 and str2: true
//	Comparison between str1 and str3: false
//	Comparison between str3 and str4: false
//	Comparison between str1 and str3 (content): true
//	Comparison between str3 and str4 (content): true
