package employee;
public class Employee {
    private int id;
    private String name;
    private String dateOfJoining;
    private int basicPay;

    public String getName(){
        return name;
    }

    public int  getId(){
        return id;
    }

    public String getDateOfJoining(){
        return dateOfJoining;
    }

    public int getBasicPay(){
        return basicPay;
    }
    
    //setters
    public void setName(String s){
        this.name = s;
    }

    public void setId(int a){
        this.id = a;
    }

    public void  setDateOfJoining(String s){
        this.dateOfJoining = s;
    }

    public  void setBasicPay(int pay){
        this.basicPay = pay;
    }
}

