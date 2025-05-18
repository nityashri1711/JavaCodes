import java.util.*;
class AccentureQ4 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    public static int help(int arr[], int num, int diff) {
        int size= arr.length;
        int cnt=0;
        for(int i=0;i<size;i++) {
            if(Math.abs(num-arr[i])<=diff) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sop("Enter array : ");
        String line= scan.nextLine();
        String[] parts= line.trim().split("\\s+");
        int[] arr= new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            arr[i]=Integer.parseInt(parts[i]);
        }
        sop("Enter number : ");
        int num= scan.nextInt();
        sop("Enter the difference limit : ");
        int diff= scan.nextInt();
        sop("The number of array elements : ");
        sopln(help(arr, num, diff));
    }
}