import java.util.*;
class AccentureQ10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter two numbers for addition : ");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        if(n1<n2) {
            int t= n1; n1=n2; n2=t;
        }
        String s1= Integer.toString(n1);
        String s2= Integer.toString(n2);
        int diff= s1.length()- s2.length();
        while(diff!=0) {
            s2= "0"+s2; diff--;
        }
        int carry=0, sum= 0, cnt=0;
        String res="";
        for(int i= s1.length()-1; i>=0; i--) {
            int a= Character.getNumericValue(s1.charAt(i));
            int b= Character.getNumericValue(s2.charAt(i));
            //System.out.println(a+ " "+b+" "+carry);
            sum= a+b+carry;
            carry=0;
            if(sum > 9) {
                res+= Integer.toString(sum%10);
                carry= sum/10;
                cnt++;
            } else res+= Integer.toString(sum);
        }
        if(carry != 0) res+= Integer.toString(carry);
        String fin="";
        for(int i=0;i<res.length();i++) {
            fin=res.charAt(i)+fin;
        }
        System.out.println("The sum is : "+fin);
        System.out.println("Carry count : "+cnt);
    }
}