import java.util.Scanner;
public class sumofnums {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many nums you want to add 2 or 3 :");
        int a = sc.nextInt();
        if(a==2){
            System.out.println("enter num1:");
            int num1=sc.nextInt();
            System.out.println("enter num2:");
            int num2=sc.nextInt();
            sumof2nums(num1,num2);
        }
        else{
            System.out.println("enter num1:");
            int num1=sc.nextInt();
            System.out.println("enter num2:");
            int num2=sc.nextInt();
            System.out.println("enter num3:");
            int num3=sc.nextInt();
            sumof3nums(num1,num2,num3);
        }
    }
    public static void sumof2nums(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum of 2 nums:" +sum);

    }
    public static void sumof3nums(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("sum of 3 nums:" +sum);

    }
}
