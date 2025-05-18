import java.util.*;
class AccentureQ16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number : ");
        int n= scan.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++) {
            int val= i*n;
            System.out.print(val+" ");
            sum+=val;
        }
        System.out.println();
        System.out.println("The sum is : "+sum);
    }
}