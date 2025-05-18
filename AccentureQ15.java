import java.util.*;
class AccentureQ15{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array : ");
        String line= scan.nextLine();
        String[] parts= line.trim().split("\\s+");
        int arr[] = new int[parts.length];
        for(int i=0;i<parts.length; i++) {
            arr[i]= Integer.parseInt(parts[i]);
        }
        int maxi_e=0, maxi_o=0;
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                maxi_e= Math.max(maxi_e, arr[i]);
            } else {
                maxi_o= Math.max(maxi_o, arr[i]);
            }
        }
        int maxi_even=0, maxi_odd=0;
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                if(arr[i]!=maxi_e) maxi_even= Math.max(maxi_even, arr[i]);
            } else {
                if(arr[i]!=maxi_o) maxi_odd= Math.max(maxi_odd, arr[i]);
            }
        }
        System.out.println("2nd maximum in even position is : "+maxi_even);
        System.out.println("2nd maximum in odd position is : "+maxi_odd);
        System.out.println("Result is : "+(maxi_even+maxi_odd));
    }
}