package messages;

import org.springframework.context.MessageSource;

public class MessagePrintingBean {
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    @Override
    public String toString() {
        return messageSource.getMessage("msg", null, null);
    }
}
