import java.util.*;
class AccentureQ19 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array : ");
        String line= scan.nextLine();
        String[] parts= line.trim().split("\\s+");
        int[] arr= new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            arr[i]= Integer.parseInt(parts[i]);
        }
        int maxi=0, idx=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>maxi) {
                maxi= arr[i]; idx=i;
            }
        }
        System.out.println("The maximum element is & its index is : "+maxi+" "+idx);
    }
}