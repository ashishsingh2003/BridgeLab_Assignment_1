import java.util.*;
public class Power_Calculation{
   public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
		 double base=sc.nextDouble();
		 double exponent=sc.nextDouble();
		 
		 double power=Math.pow(base,exponent);
		 System.out.println(power);
   }
}