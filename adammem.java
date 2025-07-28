import java.util.*;
class adammem{//12 rev:21  sqr 12:144  sqr 21:4415
    public static int rev(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
        
    }
    public static void main(String args[]){
         Scanner ob=new Scanner(System.in);
         int n=ob.nextInt();
         int sqr=n*n;
        int sqr2=rev(n)*rev(n);

        if(sqr==rev(sqr2)){
            System.out.print("adam");
        }
        else{
            System.out.print("No");
        }
    }
}


