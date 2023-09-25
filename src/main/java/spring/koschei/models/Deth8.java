package spring.koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private String message = "а игла - в сундуке :)";

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}