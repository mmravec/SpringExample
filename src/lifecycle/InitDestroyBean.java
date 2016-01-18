package lifecycle;

public class InitDestroyBean {
    public void init() {
        System.out.println("InitDestroyBean init");
    }

    public void destroy() {
        System.out.println("InitDestroyBean destroy");
    }
}
