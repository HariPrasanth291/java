import java.util.*;
public class Anagram {//listen silent both words are same letters.

    public static void main(String args[]){
        Scanner ob=new Scanner (System.in);
        String s1=ob.nextLine();
        String s2=ob.nextLine();
        String res=" ";


        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++)
            if(s1.charAt(i)==s2.charAt(j)){
               res=s1;
            }
        }
        if(s1.equals(res))
        System.out.println("true");
        else{
            System.out.println("false");
        }
    }
}
