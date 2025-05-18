import java.util.*;
class AccentureQ8 {
    public static void main(String[]args) {
        Scanner scan= new Scanner(System.in);
        char[] alph ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.println("Enter base and decimal number : ");
        int n= scan.nextInt();
        int num= scan.nextInt();
        String ans="";
        while(num!=0) {
            int rem= num%n;
            if(rem>=1 && rem<=9) ans+= Integer.toString(rem);
            else {
                ans+= alph[rem-10];
            }
            num/=n;
        }
        String res="";
        for(int i= ans.length()-1;i>=0;i--) res+=ans.charAt(i);
        System.out.println("The n-base notation value is : "+res);
    }
}