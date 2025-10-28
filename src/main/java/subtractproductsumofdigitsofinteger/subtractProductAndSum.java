package subtractproductsumofdigitsofinteger;

/*
 * LeetCode Problem Name : subtract-the-product-and-sum-of-digits-of-an-integer
 * URL : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 */

public class subtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        int product_digit = 1;
        int sum_of_digits = 0;
        while (n > 0){
            int rem = n % 10;
            n/=10;
            product_digit = product_digit * rem;
            sum_of_digits = sum_of_digits + rem;
        }
        int result = product_digit - sum_of_digits;
        System.out.println(result);
    }
}
