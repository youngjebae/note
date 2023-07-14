public class 3 {
    boolean solution(String inputString) {
        int length = inputString.length();
        for (int i=0; i<=length/2;i++) {
            if (inputString.charAt(i)!=inputString.charAt(length-i-1))
                return false;
        }
        return true;
        }
        
}
