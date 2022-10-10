class Calculator
{

public static void main(String[] args){
    
   Calculator calc = new Calculator();
    calc.read_eb();
   
}
    void read_eb()
{
    int unit = 150;
    int amount = unit * 2;
    System.out.println("EB bill reading = "+ amount);
}
}
