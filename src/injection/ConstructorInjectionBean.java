package injection;

public class ConstructorInjectionBean {

    // No. of years to the calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ConstructorInjectionBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }
    
    @Override
    public String toString() {
        return "years: " + years + " ultimateAnswer: " + ultimateAnswer;
    }
}
