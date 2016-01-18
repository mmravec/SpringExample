package inheritance;

public class AnotherBean {
    private String message;
    
    private int age;
    
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "message: " + message +
                " age: " + age +
                " name: " + name;
    }
}
