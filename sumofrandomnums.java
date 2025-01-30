import java.util.Random;
public class sumofrandomnums {
    
    public static void main(String[] args){
        Random rand=new Random();
        int num1=rand.nextInt(50);
        int num2=rand.nextInt(50);
        System.out.println("first number:"+num1);
        System.out.println("second number:"+num2);
        sumofrandom(num1,num2);
    }
    public static void sumofrandom(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum of numbers:"+sum);
    
    }
}
         

