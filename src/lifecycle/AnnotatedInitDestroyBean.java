package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotatedInitDestroyBean {
    @PostConstruct
    public void init() {
        System.out.println("AnnotatedInitDestroyBean init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AnnotatedInitDestroyBean destroy");
    }
}
