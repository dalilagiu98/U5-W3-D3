package dalilagiu9.U5W3D3.adapter;

import dalilagiu9.U5W3D3.entitiesAdapter.DataSource;
import dalilagiu9.U5W3D3.entitiesAdapter.Info;

import java.util.Calendar;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getCompleteName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTime(info.getDateOfBirth());
        Calendar now = Calendar.getInstance();

        int age = now.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        if(dateOfBirth.get(Calendar.MONTH) > now.get(Calendar.MONTH) || (dateOfBirth.get(Calendar.MONTH) ==  now.get(Calendar.MONTH) && dateOfBirth.get(Calendar.DATE) > now.get(Calendar.DATE))) {
            age--;
        }
        return age;
    }
}



