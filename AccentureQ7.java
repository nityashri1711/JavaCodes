import java.util.*;
class AccentureQ7 {
    public static void main(String[]args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your space separated integer array : ");
        String line= scan.nextLine();
        String[] parts= line.trim().split("\\s+");
        int[] arr= new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            arr[i]= Integer.parseInt(parts[i]);
        }
        System.out.println("Enter sum : ");
        int sum= scan.nextInt();
        Arrays.sort(arr);
        if(arr.length < 2) {
            System.out.println("Cant form : 0");return;
        } 
        if(arr[0]+arr[1] <= sum) {
            System.out.println(arr[0]*arr[1]); return;
        }
    }
}