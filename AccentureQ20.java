import java.util.*;
class AccentureQ20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter autobiographic number : ");
        int num= scan.nextInt();
        int k= num;
        HashMap<Integer, Integer> mp= new HashMap<>();
        while(k!=0) {
            int rem= k%10;
            if(mp.containsKey(rem)) mp.put(rem, mp.get(rem)+1);
            else mp.put(rem, 1);
            k/=10;
        }
        System.out.println("The distinct digits : "+mp.size());
        String str= Integer.toString(num);
        for(int i=0;i<str.length();i++) {
            char ch= str.charAt(i);
            int val= Character.getNumericValue(ch);
            //System.out.println(ch+" "+val+" "+mp.get(i));
            if(val!=0 && mp.get(i) != val) {
                System.out.println("False"); return;
            }
        }
        System.out.println("True");
    }
}