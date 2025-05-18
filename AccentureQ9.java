import java.util.*;
class AccentureQ9 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String st= scan.nextLine();
        int cnt=0;
        String res="";
        for(int i=0;i<st.length();i++) {
            if(st.charAt(i)!='-') {
                res+=st.charAt(i);
            } else cnt++;
        }
        String adder="";
        while(cnt!=0) {
            adder+='-';
            cnt--;
        }
        res=adder+res;
        System.out.println("Modified String is : "+res);
    }
}