/* (C)2024 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* (C)2024 */
public class Challenges {

    /* *****
    Challenge 1

    "Readable Time"

    The function "readableTime" accepts a positive number as argument,
    you should be able to modify the function to return the time from seconds
    into a human readable format.

    Example:

    Invoking "readableTime(3690)" should return "01:01:30" (HH:MM:SS)
    ***** */

    public String readableTime(Integer seconds) {
        String h = Integer.toString(seconds / 3600);
        String m = Integer.toString((seconds % 3600) / 60);
        String s = Integer.toString(seconds % 60);

        String[] a = {h, m, s};
        for(int i = 0; i < 3; ++i){
            if (a[i].length() == 1){
                a[i] = "0" + a[i];
            }
        }

        return String.join(":", a[0], a[1], a[2]);
    }
    ;

    /* *****
    Challenge 2

    "Circular Array"

    Given the following array "COUNTRY_NAMES", modify the function "circularArray"
    to return an array that meets the following criteria:

    - The index number passed to the function should be the first element in the resulting array
    - The resulting array must have the same length as the initial array
    - The value of the argument "index" will always be a positive number

    Example:

    Invoking "circularArray(2)" should return "["Island", "Japan", "Israel", "Germany", "Norway"]"
    ***** */

    public String[] circularArray(int index) {
        String[] COUNTRY_NAMES = {"Germany", "Norway", "Island", "Japan", "Israel"};
        ArrayList<String> res = new ArrayList<>();

        int firstE = index;
        if(index >= 5) firstE = index % 5;

        for (int i = firstE; i < COUNTRY_NAMES.length; ++i){
            res.add(COUNTRY_NAMES[i]);
        }
        for (int i = 0; i < firstE; ++i){
            res.add(COUNTRY_NAMES[i]);
        }
        return res.toArray(new String[0]);
    }
    ;

    /* *****
    Challenge 3

    "Own Powers"

    The function "ownPower" accepts two arguments. "number" and "lastDigits".

    The "number" indicates how long is the series of numbers you are going to work with, your
    job is to multiply each of those numbers by their own powers and after that sum all the results.

    "lastDigits" is the length of the number that your function should return, as a string!.
    See example below.

    Example:

    Invoking "ownPower(10, 3)" should return "317"
    because 1^1 + 2^2 + 3^3 + 4^4 + 5^5 + 6^6 + 7^7 + 8^8 + 9^9 + 10^10 = 10405071317
    The last 3 digits for the sum of powers from 1 to 10 is "317"
    ***** */

    public String ownPower(int number, int lastDigits) {
        BigInteger cont = BigInteger.valueOf(0);
        BigInteger aux;
        for(int i = 1; i <= number; ++i){
            aux = BigInteger.valueOf(i);
            aux = aux.pow(aux.intValue());
            cont = cont.add(aux);
        }

        int l = (int) (Math.log10(cont.doubleValue()) + 1); //Obtaining length of the number
        return cont.toString().substring(l - lastDigits);
    }
    ;

    /* *****
    Challenge 4

    "Sum of factorial digits"

    A factorial (x!) means x! * (x - 1)... * 3 * 2 * 1.
    For example: 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800

    Modify the function "digitSum" to return a number that
    equals to the sum of the digits in the result of 10!

    Example:

    Invoking "digitSum(10)" should return "27".
    Since 10! === 3628800 and you sum 3 + 6 + 2 + 8 + 8 + 0 + 0
    ***** */

    public Integer digitSum(int n) {
        BigInteger[] facts = new BigInteger[n+1];
        facts[0] = BigInteger.valueOf(1);

        //Calculating facts
        for(int i = 1; i < n+1; ++i){
            facts[i] = facts[i - 1].multiply(BigInteger.valueOf(i));
        }

        var res = facts[n];
        int l = (int) (Math.log10(res.doubleValue()) + 1);
        int sum = 0;

        //Summing digits
        for(int i = 0; i < l; ++i){
            sum += res.mod(BigInteger.valueOf(10)).intValue();
            res = res.divide(BigInteger.valueOf(10));
        }

        return sum;
    }

    /**
     * Decryption.
     * Create a decryption function that takes as parameter an array of ASCII values. The addition between values is the ascii value decrypted.
     * decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"
     * H = 72, the sum of H 72 and 33 gives 105 which ascii value is i;
     * The function must return the string encoded using the encryption function below.
     *
     * @param ascivalues  hand, player2 hand
     */
    public String decrypt(List<Integer> ascivalues) {
        StringBuilder message = new StringBuilder();
        message.append((char) ascivalues.getFirst().intValue());
        char c = message.charAt(0);

        for(int i = 0; i < ascivalues.size() - 1; ++i){
            message.append((char)(c + ascivalues.get(i + 1)));
            c = message.charAt(message.length() - 1);
        }
        return message.toString();
    }

    /**
     * Encryption Function.
     * Create am encryption function that takes a string and converts into an array of ASCII character values.
     * encrypt("Hello") ➞ [72, 29, 7, 0, 3]
     * // H = 72, the difference between the H and e is 29
     * The function must return an array of integer ascii values.
     *
     * @param text  hand, player2 hand
     */
    public List<Integer> encrypt(String text) {
        List<Integer> res = new ArrayList<>();

        res.add((int) text.charAt(0));
        for(int i = 0; i < text.length() - 1; ++i){
            res.add(text.charAt(i+1) - text.charAt(i));
        }

        return res;
    }
}
