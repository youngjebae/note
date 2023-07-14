import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        System.out.println("Enter the elements of the sequence:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        q7 solution = new q7();
        boolean isValid = solution.isSequenceValid(sequence);
        System.out.println("Is sequence valid? " + isValid);

        scanner.close();
    }

    boolean isSequenceValid(int[] sequence) {
        int count = 0;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                count++;

                if (count > 1) {
                    return false;
                }

                if (i == 1 || sequence[i] > sequence[i - 2]) {
                    sequence[i - 1] = sequence[i];
                } else {
                    sequence[i] = sequence[i - 1];
                }
            }
        }
        return true;
    }
}
