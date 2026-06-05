public class a_Employee{
    abstract static class Employee{
        String name,department;
        int id;
        Employee(String name,int id,String department){
            this.name=name;
            this.id=id;
            this.department=department;
        }
        abstract double calculatePay();
        public String toString(){
            return String.format("%s (id=%d, dept=%s) -> Pay: %.2f",
                    name,id,department,calculatePay());
        }
    }
    static class FullTimeEmployee extends Employee{
        double fixedSalary;
        FullTimeEmployee(String name,int id,String department,double fixedSalary){
            super(name,id,department);
            this.fixedSalary=fixedSalary;
        }
        public double calculatePay(){
            return fixedSalary;
        }
    }
    static class PartTimeEmployee extends Employee{
        double hourlyRate;
        int hoursWorked;
        PartTimeEmployee(String name,int id,String department,double hourlyRate,int hoursWorked){
            super(name,id,department);
            this.hourlyRate=hourlyRate;
            this.hoursWorked=hoursWorked;
        }
        public double calculatePay(){
            return hourlyRate*hoursWorked;
        }
    }
    static class ContractEmployee extends Employee{
        String projectName;
        double contractAmount;
        ContractEmployee(String name,int id,String department,String projectName,double contractAmount){
            super(name,id,department);
            this.projectName=projectName;
            this.contractAmount=contractAmount;
        }
        public double calculatePay(){
            return contractAmount;
        }
    }
    public static void main(String[] args){
        Employee[] staff={
            new FullTimeEmployee("Alice",1,"Engineering",80000),
            new PartTimeEmployee("Bob",2,"Support",25,80),
            new ContractEmployee("Carol",3,"Design","Web Redesign",15000)
        };
        for(Employee e:staff){
            System.out.println(e);
        }
    }
}