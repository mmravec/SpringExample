package lifecycle;

import org.springframework.beans.factory.annotation.Required;

public class AnnotatedRequiredNameBean {
    private String name;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
