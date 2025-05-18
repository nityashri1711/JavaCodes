import java.util.*;
class AccentureQ3 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    public static int help(String st) {
        if(st.length()<=4) return 0;
        if(Character.isDigit(st.charAt(0))) return 0;
        int caps=0, d=0, nope=0;
        for(int i=0;i<st.length();i++) {
            if(Character.isDigit(st.charAt(i))) d++;
            if(st.charAt(i)>='A' && st.charAt(i)<='Z') caps++;
            if(st.charAt(i)==' ' || st.charAt(i)=='/') nope++;
        }
        if(d>0 && caps>0 && nope==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sopln("Enter your password for validation : ");
        String st= scan.nextLine();
        if(help(st)==1)  sopln("Perfect Password");
        else sopln("Weak Password..Please reset");
    }
}