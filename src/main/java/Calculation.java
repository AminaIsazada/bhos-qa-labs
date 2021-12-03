import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Calculation {
    int result;
    
    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    
    public int subtract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    
    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    
    public float divide(int num1, int num2){
        result = num1/num2;
        return result;
    }
    
    public boolean even(int num) {
        return num % 2 == 0;
    }
    
    public boolean odd(int a) {
        return a % 2 != 0;
    }
    
    public float mode(int num1, int num2) {
        result = num1 % num2;
        return result;
    }
   
    public double logarithm(double num) {
        return Math.log(num);
    }
    //vulnerable code
    public byte[] makeHash (String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        return messageDigest.digest(data.getBytes());
    }    
}
