package rohithproject;

public class ThirdScript {

	public static void main(String[] args) {
		int rows = 2;
		int columns = 2;

		// Nested loop to generate the multiplication table
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print(i * j + "\t"); // Print the product
			}
			System.out.println(); // Move to the next line for the next row
		}
	}
}