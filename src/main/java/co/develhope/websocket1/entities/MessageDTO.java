package co.develhope.websocket1.entities;

public class MessageDTO {

    private String type;
    private String message;

    // Empty Constructor
    public MessageDTO() {
    }

    // Constructor
    public MessageDTO(String type, String message) {
        this.type = type;
        this.message = message;
    }

    // Getter and Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Method toString
    @Override
    public String toString() {
        return "MessageDTO{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
