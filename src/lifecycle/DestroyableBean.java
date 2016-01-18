package lifecycle;

import org.springframework.beans.factory.DisposableBean;

public class DestroyableBean implements DisposableBean {
    public void destroy() throws Exception {
        System.out.println("DestroyableBean destroy");
    }
}
