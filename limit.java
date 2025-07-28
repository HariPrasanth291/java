import java.util.Scanner;

public class limit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int lim=0;
        for(int row=1;row<=num;row++){
            if(row%2==0){
                for(int col=0;col<=lim+num;col++){
                    System.out.println(col + " ");
                    lim+= 2+num;
                }
            }
            else{
                for(int col=lim;col>lim-1;col--){
                    System.out.println(col + " ");
                }
            }
        }

    }
    
}
