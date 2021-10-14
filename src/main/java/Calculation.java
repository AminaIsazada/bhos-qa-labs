import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Calculation {
    int result;
    //Method for addition - 1
    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    //Method for subtraction - 2
    public int subtract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    //Method for multiplication - 3
    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    //Method for division - 4
    public float divide(int num1, int num2){
        result = num1/num2;
        return result;
    }
    //Method for even or not - 5
    public boolean even(int num) {
        return num % 2 == 0;
    }
    //Method for odd or not - 6
    public boolean odd(int a) {
        return a % 2 != 0;
    }
    //Method for mode - 7
    public float mode(int num1, int num2) {
        result = num1 % num2;
        return result;
    }
    //Method for increasing - 8
    public void increase(int num) {
        result = num++;
    }

    //Method for decreasing - 9
    public void decrease(int num) {
        result = num--;
    }
    //Method for logarithm - 10
    public double logarithm(double num) {
        return Math.log(num);
    }
    //vulnerable code
    public byte[] makeHash (String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        return messageDigest.digest(data.getBytes());
    }    
}
