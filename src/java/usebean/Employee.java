package usebean;



import java.io.Serializable;

public class Employee extends Person implements Serializable {

    private Integer salary = 100;

    public Employee(){
       
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
