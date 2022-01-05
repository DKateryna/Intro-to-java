class Excercise {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        // Display table header
        System.out.printf("%-8s%-10s%-4s%-12s%-10s", "Miles", "Kilometers", " | ", "Kilometers", "Miles");

        System.out.println();

        for (int i = 1, k = 20; i <= 10 && k <= 65; i++, k += 5) {
            System.out.printf("%-8d%-10.3f%-4s%-12d%-10.3f\n", i, (i * KILOMETERS_PER_MILE), " | ", k, (k / KILOMETERS_PER_MILE));
        }
    }
}