import java.util.*;
class AccentureQ2 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    public static int help(String st) {
        int res= Character.getNumericValue(st.charAt(0));
        for(int i=1;i<st.length();i++) {
            if(i%2 != 0) {
                if(st.charAt(i)=='A') {
                    int next= Character.getNumericValue(st.charAt(i+1));
                    if(res==1 && next==1) res=1;
                    else res=0;
                } else if(st.charAt(i)=='B') {
                    int next= Character.getNumericValue(st.charAt(i+1));
                    if(res==0 && next==0) res=0;
                    else res=1;
                } else {
                    int next= Character.getNumericValue(st.charAt(i+1));
                    if(res==next) res=0;
                    else res=1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sopln("Enter a string : ");
        String st= scan.nextLine();
        sop("The result is : ");
        sopln(help(st));
    }
}