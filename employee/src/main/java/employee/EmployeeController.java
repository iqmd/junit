package employee;
public class EmployeeController {
    public static void main(String args[]){
        EmployeeView view = new EmployeeView();

        int basicPay = Integer.parseInt(args[0]);
        //this should be in a util class
        Employee emp = new Employee();
        emp.setBasicPay(basicPay);
        EmployeeService es = new EmployeeService(emp);

        double gs = es.grossSalary();
        double tds = es.deductTax();

        view.printDetails(gs,tds);
    }


}
