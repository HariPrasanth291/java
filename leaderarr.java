import java.util.*;
class leaderarr{//7 12 5 3 8 2
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int size=ob.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            // int fmax=arr[i];
            // int smax=0;
            boolean isleader=true;
        
        for(int j=i+1;j<arr.length;j++){
            // if(arr[j]>smax){
            //     smax=arr[j];
            if(arr[i]<=arr[j]){
                isleader=false;
                break;
            }
            }
        
        if(isleader){
               // int max=fmax;
            System.out.print(arr[i]+" ");
        }
     }
    }
}

