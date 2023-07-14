public class question2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 1000) {
            if (num % 3 == 0) {
                sum += num;
            }
            num++;
        }

        System.out.println(sum);
    }
}