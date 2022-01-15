class Excercise {
	public static void main(String[] args) {
		printPattern(7);
	}
	
	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 2; j--) {
				System.out.print(j + " ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
 }