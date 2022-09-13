//author Sagnik Banerjee 
class TaxCalculator { 
 double calculateTax(String empName,boolean isIndian,double empSal) throws Exception{
    double taxAmount;
    if(isIndian==false){
        throw new CountryNotValidException();
    }
    if(empName.isEmpty()){
        throw new EmployeeNameInvalidException();
    }
    if(empSal>100000 && isIndian==true){
        taxAmount=empSal*8/100;
    }
    else if((empSal<50000&&empSal>100000)&&isIndian==true){
        taxAmount =empSal *6/100;
    }
    else if((empSal<30000&&empSal>50000)&&isIndian==true){
        taxAmount =empSal *5/100;
    }
    else if((empSal<10000&&empSal>30000)&&isIndian==true){
        taxAmount =empSal *4/100;
    }
    else{
        throw new TaxNotEligibleException();
    }
 }   
}
class CountryNotValidException extends Exception{
}
class EmployeeNameInvalidException extends Exception{
}
class TaxNotEligibleException extends Exception{
}
public class CalculatorSimulator{
    TaxCalculator t1= new TaxCalculator();
    try{
        double tax1=t1.calculateTax("Sagnik",true,1000000);
        System.out.println("The tax is "+ tax1);
    }
    catch(CountryNotValidException e){
        System.out.println(e);
        System.out.println("The employee should be an Indian citizen for calculating tax");
    }
    catch(EmployeeNameInvalidException f){
        System.out.println(f);
        System.out.println("The employee name cannot be empty");
    }
    catch(TaxNotEligibleException g){
        System.out.println(g);
        System.out.println("The employee does not need to pay tax");
    }
    
}
