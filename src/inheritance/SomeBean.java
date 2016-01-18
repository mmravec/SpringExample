package inheritance;

public class SomeBean {
    private String message;
    
    private int age;
    
    private double factor;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "message: " + message +
                " age: " + age +
                " factor: " + factor;
    }    
}
