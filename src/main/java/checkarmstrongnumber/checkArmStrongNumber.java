package checkarmstrongnumber;

import java.util.Scanner;

public class checkArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(armStrongNumberCheck(n));
    }

    static Boolean armStrongNumberCheck(int a){
        int b = a;
        int sum = 0;
        while (b > 0) {
            int rem = b % 10;
            b = b / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == a;
    }
}
