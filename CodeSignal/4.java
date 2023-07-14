public class 4 {
    public static void main(String[] args) {
        int[] inputArray = {-23, 4, -3, 8, -12};
        System.out.println(solution(inputArray));
    }

    static int solution(int[] inputArray) {
            int maxProduct = Integer.MIN_VALUE;
            for (int i=0;i<inputArray.length-1;i++) {
                int product = inputArray[i] * inputArray[i+1];
                if (product > maxProduct) {
                    maxProduct = product;
                } 
            }
            return maxProduct;
    }
}