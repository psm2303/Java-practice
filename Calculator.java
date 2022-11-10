//this is a calculator program with basic operations
public class Calculator{
  public void Calculator(){

  }
//addition
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }
//substraction
  public int substract(int a, int b){
    int difference = a - b;
    return difference;
  }
  
  public int multiply(int a, int b){
    int product = a * b;
    return product;
  }

  public int divide(int a, int b){
    int dividend = a / b;
    return dividend;
  }

  public int modulo(int a, int b){
    int modulo = a % b;
    return modulo;
  }


  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.substract(45,11));

  }
}