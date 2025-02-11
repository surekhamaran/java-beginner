import  java.util.Scanner;
class comparefloats{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first float num1:");
    float num1= sc.nextFloat();
    System.out.println("enter the first float num2:");
    float num2= sc.nextFloat();
    comparefloat(num1,num2);
  }
  public static void comparefloat(float num1,float num2){
    int roundednum1 = (int) (num1*1000);
    int roundednum2 = (int) (num2*1000);
    if (roundednum1==roundednum2)
      System.out.println("numbers are equal upto 3 decimals");       
    else{
      System.out.println("numbers are not equal upto 3 decimals");             
    }   
  }
}

  
