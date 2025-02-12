import java.util.Scanner;
class greatestandsmallest{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers : ");
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    int num3= sc.nextInt();
    int num4= sc.nextInt();

    int smallest=num1;
    int greatest=num2;

    if(num2>greatest)
      greatest=num2;
    else if(num2<smallest)
      smallest=num2;

    if(num3>greatest)
      greatest=num3;
    else if(num3<smallest)
      smallest=num3;

    if(num4>greatst)
      greatest=num4;
    else if(num4<smallest)
      smallest=num4;
        
    System.out.println("greatest number is: "+ greatest);
    System.out.println("smallest number is: "+ smallest);    
  }
}
