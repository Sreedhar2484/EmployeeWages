

public class EmpWageBuilderIf {
   public static void main(String[] args){
    int IS_PART_TIME = 1;
    int IS_FULL_TIME = 2;
    int Emp_RATE_PER_HOUR=20;
    //variables
    int empHrs = 0;
    int empWage = 0;
    //computation
    double empCheck = Math.floor(Math.random()*10)%2;
    if(empCheck==IS_PART_TIME)
       empHrs =4;
    else if (empCheck==IS_FULL_TIME)
       empHrs=8;
    else 
       empHrs=0;
    empWage = empHrs*Emp_RATE_PER_HOUR;
    System.out.println("Emp Wage : "+empWage);
   } 
}
