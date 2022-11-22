public class ClassMethod{
     int IS_PART_TIME = 1;
     int IS_FULL_TIME = 2;
     int EMP_RATE_PER_HOUR = 20;
     int NUM_OF_WORKING_DAYS = 20;
     int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args){
        //variables
        int empHrs =0, totalEmpHrs=0, totalWorkingDays=0;
        ClassMethod obj1 = new ClassMethod();
        
        //computation
        while (totalEmpHrs<=obj1.MAX_HRS_IN_MONTH && totalWorkingDays<obj1.NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            if(empCheck==obj1.IS_PART_TIME){
                empHrs=4;
            }
            else if (empCheck==obj1.IS_FULL_TIME)
                 empHrs=8;
            else
                 empHrs=0;
            totalEmpHrs+=empHrs;
            System.out.println("Day#" + totalWorkingDays + " Emp Hr :" +empHrs);
        }
        int totalEmpWage=totalEmpHrs*obj1.EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage :" + totalEmpWage);
    }

}