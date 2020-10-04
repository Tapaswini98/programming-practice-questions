package easy.recursion;
import  java.util.*;

public class PowerWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xpnb2 = power(x, n / 2);
        int xpn = xpnb2 * xpnb2;

        if(n % 2 == 1){
            xpn = xpn * x;
        }

        return xpn;
    }
}
