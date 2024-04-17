package dalilagiu9.U5W3D3.entities;



public class UserData {
    //ATTRIBUTES LIST:
    private String completeName;
    private int age;

    //CONSTRUCTOR:
    public void getData(DataSource ds) {
        completeName = ds.getCompleteName();
        age = ds.getAge();
    }
}
