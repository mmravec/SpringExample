package injection;

public class InjectingSimpleValuesBean {
    private String name;

    private int age;

    private float height;

    private boolean isProgrammer;

    private Long ageInSeconds;

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public void setIsProgrammer(boolean isProgrammer) {
        this.isProgrammer = isProgrammer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name :" + name + "\n" + "Age:" + age + "\n" + "Age in Seconds: " + ageInSeconds + "\n" + "Height: " + height + "\n" + "Is Programmer?: " + isProgrammer;
    }
}
