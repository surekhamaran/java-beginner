import java.util.Scanner;
class greatestnum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many nums you want to compare 2 or 3 :");
        int a = sc.nextInt();
        if(a==2){
            System.out.println("enter num1:");
            int num1=sc.nextInt();
            System.out.println("enter num2:");
            int num2=sc.nextInt();
            compare2nums(num1,num2);
        }
        else{
            System.out.println("enter num1:");
            int num1=sc.nextInt();
            System.out.println("enter num2:");
            int num2=sc.nextInt();
            System.out.println("enter num3:");
            int num3=sc.nextInt();
            compare3nums(num1,num2,num3);
        }
    }
    public static void compare2nums(int num1,int num2){
        int c=num1>num2? num1:num2;
        System.out.println("greatest of 2 nums:" +c);

    }
    public static void compare3nums(int num1,int num2,int num3){
        int c=num1 >num2? num1:num2;
        int d=c>num3? c:num3;
        System.out.println("greatest of 3 nums:" +d);

    }

}