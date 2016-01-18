package injection;

public class InjectingRefBean {
    private Bar bar;

    private Foo foo;

    public InjectingRefBean(Bar bar, Foo foo) {
        this.bar = bar;
        this.foo = foo;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }
}
