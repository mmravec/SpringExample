package autowire;

public class Target {
    private Foo foo;
    
    private Foo foo2;
    
    private Bar bar;

    public Target() {
        
    }
    
    public Target(Foo foo) {
        this.foo = foo;
        System.out.println("Target(Foo) called");
    }
    
    public Target(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
        System.out.println("Target(Foo, Bar) called");
    }
    
    public void setFoo(Foo foo) {
        this.foo = foo;
        System.out.println("Property foo set");
    }
    
    public void setFoo2(Foo foo) {
        this.foo2 = foo;
        System.out.println("Property foo2 set");
    }

    public void setMyBarProperty(Bar bar) {
        this.bar = bar;
        System.out.println("Property myBarProperty set");
    }
    
    @Override
    public String toString() {
        return "foo: " + foo + " foo2: " + foo2 + " bar: " + bar;
    }
}