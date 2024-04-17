package dalilagiu9.U5W3D3;

import dalilagiu9.U5W3D3.chainResponsabilityEntities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application3 {
    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
        Officer lieutenant = new Lieutenant();
        Officer captain = new Captain();
        Officer major = new Major();
        Officer colonel = new Colonel();
        Officer general = new General();

        lieutenant.setSuperior(captain);
        captain.setSuperior(major);
        major.setSuperior(colonel);
        colonel.setSuperior(general);

        double amount = 7400;

        lieutenant.handleRequest(amount);
    }
}
