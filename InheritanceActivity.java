class Employee{
    long employeeID;
    String employeeName;
    String employeeAdress;
    double basicSalary;
    long employeePhone;
    double specialAllowance=250.80;
    double Hra=1000.50;
    Employee(long Id,String Name,String Address,long Phone,double basicSalary){    
        employeeID=Id;
        employeeName=Name;
        employeeAdress=Address;
    }
    void CalculateSalary(){
        double salary=basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
        System.out.println(salary);
    }
}
class Manager extends Employee{

    Manager(long Id, String Name, String Address, long Phone,double basicSalary) {
        super(Id, Name, Address, Phone,basicSalary);
        
    }

}
class Trainee extends Employee{

    Trainee(long Id, String Name, String Address, long Phone,double basicSalary) {
        super(Id, Name, Address, Phone,basicSalary);
        
    }
    
}
public class InheritanceActivity{
    public static void main(String[] args) {
        Manager m1= new Manager(126534, "Peter", "Chennai,India", 237844,65000);
        m1.CalculateSalary();
        Trainee t1= new Trainee(29846, "Jack", "Mumbai,India", 442085, 45000);
        t1.CalculateSalary();
    }

}