import java.util.Scanner;
import java.util.*;

class AccentureQ1 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    
    public static int helper(int arr[], int n, int total) {
        int sum=0, i;
        for(i=0;i<n;i++) {
            sum+=arr[i];
            if(sum>=total) break;
        }
        if(sum<total) return 0;
        return i+1;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sopln("Enter the value of r and unit");
        int r= scan.nextInt();
        int unit= scan.nextInt();
        sopln("Enter value  of n");
        int n= scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        if(n!=0) sop("The min number of houses are : "+helper(arr, n, r*unit));
        else sop("The min number of houses are : "+ 0);
    }
}