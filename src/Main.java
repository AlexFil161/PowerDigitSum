import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double number = Math.pow(2, 1000);
        BigDecimal decimal = new BigDecimal(number);
        char[] chars = (decimal.toString()).toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result + Character.getNumericValue(chars[i]);
        }
        System.out.println(result);
    }
}
