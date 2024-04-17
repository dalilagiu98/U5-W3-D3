package dalilagiu9.U5W3D3.chainResponsabilityEntities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseOfficer implements Officer{
    protected Officer superior;
    protected double salary;
    public BaseOfficer(double salary) {
        this.salary = salary;
    }

    @Override
    public void setSuperior(Officer superior) {
        this.superior=superior;
    }

    @Override
    public void handleRequest(double amount){
        if(amount >= salary ){
            System.out.println("The " + getClass().getSimpleName() + " receives at least a salary of: " + amount + "$");
        }
        if (superior != null) {
           superior.handleRequest(amount);
        } else {
            System.out.println("No officer receives at least the salary of: " + amount + "$");
        }
    };

}
