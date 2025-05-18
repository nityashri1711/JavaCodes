import java.util.*;
class AccentureQ17 {
    public static boolean pal(int n) {
        int rev=0, k=n;
        while(k!=0) {
            int rem= k%10;
            rev=rev*10+rem;
            k/=10;
        }
        if(rev==n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter m, n : ");
        int m= scan.nextInt();
        int n= scan.nextInt();
        for(int i=m;i<=n;i++) {
            if(pal(i)) System.out.print(i+" ");
        }
    }
}