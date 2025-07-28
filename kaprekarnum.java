import java.util.*;
class kaprekarnum{//45  20+25=45
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        int sqr=num*num;
        int pow=String.valueOf(sqr).length()/2;
        int fh=sqr/(int)Math.pow(10,pow);
        int sh=sqr%(int)Math.pow(10,pow);
        System.out.println(fh+sh==num?"Kaprekar":"No");
    }
}