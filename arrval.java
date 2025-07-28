import java.util.*;
class arrval{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==i){
                count++;
            }
        }
        System.out.println(count);
    }
}