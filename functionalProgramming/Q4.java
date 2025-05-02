package functionalProgramming;

public class Q4 {
	interface reportCard {
		public int marksForSubject(int mathematics, int physics, int biology, int history, int chemistry);
	}

	public static void main(String[] args) {
		reportCard am1 = (int mathematics, int physics, int biology, int history, int chemistry) -> {
			mathematics += 10;
			return (mathematics + physics + biology + history + chemistry);
		};
		System.out.println(am1.marksForSubject(74, 87, 66, 53, 90));
	}
}


/*OUTPUT:
 380
 */