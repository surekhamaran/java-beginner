import java.util.*;
class findisprime{
  public static void main(String args[]){
    Scanner sc= new Scanner(Systtem.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    if(primeornot(num))
      System.out.println("it is prime num");
    else
      System.out.println("it is prime num"); 
  }
  public static boolean primeornot(int num){
    if(num<=2){
      if(num == 2)
        return true;  
      return false; 
    }
    for(i=2;i<= Math.sqrt(num);i++){
      if(num%i==0)
        return false;
    }
    return true;
  }
}
