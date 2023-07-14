public class question3 {
    public static void main(String[] args) {
        String sin = "881120-1068234";
        String firstHalf = sin.substring(0, 6);
        String secondHalf = sin.substring(7);
        System.out.println(firstHalf);  // 881120 출력
        System.out.println(secondHalf);  // 1068234 출력
    }
}