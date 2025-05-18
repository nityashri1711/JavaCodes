import java.util.*;
class AccentureQ18 {
    public static double cal_dis(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3 : ");
        int x1= scan.nextInt();
        int y1= scan.nextInt();
        int x2= scan.nextInt();
        int y2= scan.nextInt();
        int x3= scan.nextInt();
        int y3= scan.nextInt();
        double sum=0.0;
        sum+= cal_dis(x1, y1, x2, y2);
        sum+= cal_dis(x2, y2, x3, y3);
        sum+= cal_dis(x3, y3, x1, y1);
        System.out.println("The total distance is : "+sum);
    }
}