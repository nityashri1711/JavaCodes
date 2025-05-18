import java.util.*;
class AccentureQ11 {
    public static void main(String[]args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string and the characters : ");
        String st= scan.nextLine();
        char ch1= scan.next().charAt(0);
        char ch2= scan.next().charAt(0);
        String res="";
        for(int i=0;i<st.length();i++) {
            if(st.charAt(i)==ch1) res+=ch2;
            else if(st.charAt(i)==ch2) res+=ch1;
            else res+=st.charAt(i);
        }
        System.out.println("String after replacing characters : "+res);
    }
}