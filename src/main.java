public class main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem=new PayRollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Rohan", 01, 30000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Rohit", 23,40,1200);

        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details ");
        payRollSystem.displayEmployee();

        System.out.println("Removing Employee");
        payRollSystem.removeEmployee(23);

        System.out.println("Remaining Employee Details");
        payRollSystem.displayEmployee();
    }
}
