import java.util.*;
class AccentureQ14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter m, n : ");
        int m= scan.nextInt();
        int n= scan.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++) {
            if(i%3==0 && i%5==0) sum+=i;
        }
        System.out.println("The sum of numbers div by 3&5 : "+ sum);
    }
}