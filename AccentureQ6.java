import java.util.*;
class AccentureQ6 {
    public static void sopln(Object msg) {
        System.out.println(msg);
    }
    public static void sop(Object msg) {
        System.out.print(msg);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        sop("Enter the array : ");
        String line= scan.nextLine();
        String[] parts= line.trim().split("\\s+");
        int arr[]= new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            arr[i]= Integer.parseInt(parts[i]);
        }
        ArrayList<Integer> listEven= new ArrayList<>();
        ArrayList<Integer> listOdd= new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                listEven.add(arr[i]);
            } else {
                listOdd.add(arr[i]);
            }
        }
        Collections.sort(listOdd);
        listEven.sort(Comparator.reverseOrder());
        sop("The 2nd smallest from odd positions : ");
        sop(listOdd.get(1));
        sopln("");
        sop("The 2nd largest from even positions : ");
        sop(listEven.get(1));

    }
}