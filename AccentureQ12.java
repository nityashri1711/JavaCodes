import java.util.*;
class AccentureQ12 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int res=0;
        if(c==1) res= a+b;
        if(c==2) res= a-b;
        if(c==3) res= a*b;
        if(c==4) res= a/b;
        System.out.println("The result is : "+ res);
    }
}