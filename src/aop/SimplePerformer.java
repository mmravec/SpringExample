package aop;

public class SimplePerformer implements Performer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void perform() {
        System.out.println("Performer " + name + " is playing.");
        //throw new RuntimeException("Today is not the best day of " + name + ".");
    }
}
