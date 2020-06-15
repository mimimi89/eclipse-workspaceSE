
public class WhileNested {

	public static void main(String[] args) {
		/*
		 * ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★★★ ☆☆☆☆☆
		 */

		System.out.print("★★★★★\n");
		System.out.println();

		System.out.println("★★★★★");
		System.out.println();

		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.print("★");
				j++;
			}
			System.out.println();

			i++;
		}

	}// main

}// class
