package dalilagiu9.U5W3D3;

import dalilagiu9.U5W3D3.adapter.InfoAdapter;
import dalilagiu9.U5W3D3.entitiesAdapter.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);

		Info info = new Info();
		info.setName("John");
		info.setSurname("Doe");
		Calendar dob = Calendar.getInstance();
		dob.set(1985, Calendar.MAY, 15); // Impostazione a maggio 1985
		info.setDateOfBirth(dob.getTime());

		InfoAdapter infoAdapter = new InfoAdapter(info);
		String completeName = infoAdapter.getCompleteName();
		int age = infoAdapter.getAge();
		System.out.println("Complete name: " + completeName);
		System.out.println("Age: " + age);
	}

}
