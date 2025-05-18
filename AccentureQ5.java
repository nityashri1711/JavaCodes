import java.util.*;
class AccentureQ5 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    public static int help(int n, int m) {
        int sumDiv=0, sumND=0;
        for(int i=1;i<=m;i++) {
            if(i%n==0) sumDiv+=i;
            else sumND+=i;
        }
        return sumND-sumDiv;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sop("Enter values of n and m : ");
        int n= scan.nextInt();
        int m= scan.nextInt();
        sop("Result is : ");
        sop(help(n,m));
    }
}