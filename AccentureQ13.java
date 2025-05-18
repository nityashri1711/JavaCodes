import java.util.*;
class AccentureQ13 {
    public static int check(int n) {
        int c=0;
        while(n%2==0 && n!=0) {
            c++; n/=2;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter m, n : ");
        int m= scan.nextInt();
        int n= scan.nextInt();
        int maxi= 0, num=m;
        for(int i=m; i<=n; i++) {
            int cnt= check(i);
            if(cnt>maxi) {
                maxi= cnt; num= i;
            }
        }
        System.out.println("The number is : "+num);
    }
}