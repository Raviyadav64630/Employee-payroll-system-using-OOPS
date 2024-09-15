package EmplyeePayrollSystem;
public class FullTimeEmployee extends Employee {//we have used inheritance here
    private double monthlySallary;
    public FullTimeEmployee(String name, int id ,double monthlySallary){
        super(name,id);//we have used super keyword here to call parent class constructor
        this.monthlySallary=monthlySallary;
    }
    @Override
    public double calculatesallary(){//because we have extended employee that is abstract so we have to provide body of all abstract methods used in employee
        //we have used polymorphism concept also here for all classes it works differently
        return monthlySallary;
    }
}
