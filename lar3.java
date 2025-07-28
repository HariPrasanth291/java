import java.util.*;
class lar3{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int size=ob.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int len=arr.length;
        int thr=arr[len-3];
        System.out.print(len);
    }
}