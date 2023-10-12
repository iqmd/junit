package employee;
public class EmployeeService {
    private Employee emp;

    EmployeeService(Employee emp){
        this.emp = emp;
    }

    public double getDA(){
        double pay = (double)emp.getBasicPay();
        return pay*0.40;
    }
    public double getHRA(){
        double pay = (double)emp.getBasicPay();
        return pay*0.30;
    }

    public double grossSalary(){
        double da = getDA();
        double hra = getHRA();
        return (emp.getBasicPay()+da+hra)*12;
    }

    public double deductTax(){
        double  salary = grossSalary();
        if(salary > 2000000){
            return salary - salary*0.30;
        }else if(salary > 1000000){
            return salary - salary*0.20;
        }else if(salary > 500000){
            return salary - salary*0.10;
        }else{
            return salary;
        }
    }
}
