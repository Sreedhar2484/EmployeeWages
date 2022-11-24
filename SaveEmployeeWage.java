import java.lang.Package;
public class SaveEmployeeWage{
    
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    
    private final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    public  int empHrs =0, totalEmpHrs=0, totalWorkingDays=0;

    public SaveEmployeeWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
    }
     void display(){
            //variables
            
            //computation
            System.out.println("........<< Employee Wage for "+this.company+ ">>........");
            while (this.totalEmpHrs<this.MAX_HRS_IN_MONTH && totalWorkingDays<this.NUM_OF_WORKING_DAYS){
                this.totalWorkingDays++;
                int empCheck = (int)Math.floor(Math.random()*10)%3;
                switch (empCheck){
                    case IS_PART_TIME:
                         empHrs=4;
                    break;
                    case IS_FULL_TIME:
                        empHrs=8;
                    break;
                    default:
                        empHrs=0;
                }
                this.totalEmpHrs+=empHrs;
                System.out.println("Day#" + this.totalWorkingDays + " Emp Hr :" +empHrs);
            
            }
            int totalEmpWage=totalEmpHrs*this.EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage  For "+this.company+" :" + totalEmpWage);
        

        }
        

    public static void main(String args[]){
        SaveEmployeeWage Reliance = new SaveEmployeeWage("Reliance",20 , 20, 100);
        SaveEmployeeWage Suziki = new SaveEmployeeWage("Suziki",25 , 22, 120);
        SaveEmployeeWage TATA_Industries = new SaveEmployeeWage("TATA Industries",35 , 25, 110);
        SaveEmployeeWage SBI_bank = new SaveEmployeeWage("SBI Bank",30 , 18, 95);

        Reliance.display();
        System.out.println(Reliance);
        Suziki.display();
        System.out.println(Suziki);
        TATA_Industries.display();
        System.out.println(TATA_Industries);
        SBI_bank.display();
        System.out.println(SBI_bank);
        
    }
}
        

