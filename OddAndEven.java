import java.util.ArrayList;

public class OddAndEven {
	public static void main(String[] args) {
		int number = 100;
		int i=0;
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (i=0; i<=number;i++) {
			if(i % 2 == 0) {
				evenNumbers.add(i);
			} else if(i % 2 == 1) {
				oddNumbers.add(i);
			}
		}
		System.out.println("Even Numbers = "+evenNumbers);
		System.out.println("Odd Numbers = "+oddNumbers);
	}
}
