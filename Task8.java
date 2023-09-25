package GroupTasks2;


public class Task8 {
    public static String increment(String str) {

        char[] chars = str.toCharArray();
        int i = chars.length - 1;
        int carry = 1;
        while (i >= 0 && carry > 0) {
            int digit = chars[i] - '0';
            int sum = digit + carry;

            carry = sum / 10;
            chars[i] = (char) ((sum % 10) + '0');
            i--;
        }
        if (carry > 0) {
            return "1" + new String(chars);
        } else {
            return new String(chars);
        }
    }

    public static void main(String[] args) {
        System.out.println(increment("123"));
        System.out.println(increment("53456"));
        System.out.println(increment("29"));
    }
}