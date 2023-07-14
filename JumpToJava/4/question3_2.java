public class question3_2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // blank row
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // star row
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}