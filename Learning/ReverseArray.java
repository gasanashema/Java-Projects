import javax.management.openmbean.ArrayType;

public class ReverseArray {
    public static int[] reverseArray(int rev[]){
        int result[]={}; 
        for (int i = rev.length-1; i > 0; i--) {
            result[i]=rev[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int revesed[]=reverseArray(arr);
        System.out.println(revesed);
    }
    
}
