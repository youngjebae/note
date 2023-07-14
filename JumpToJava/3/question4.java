public class question4 {
    public static void main(String[] args) {
        String pin = "881120-1068234";
        /*if (pin.charAt(7) == '1') {
            System.out.println("Male");
        }
        else {
            System.out.println("Female");
        }*/

        System.out.println((pin.charAt(7) == '1') ? "Male" : "Female");
    }
}