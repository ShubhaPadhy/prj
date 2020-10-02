import java.util.*;

public class add{
    
    public static int sum(int x , int y){
        return x+y;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }
}
