package co.develhope.websocket1.entities;

public class ClientDTO {

    private String from;
    private String text;

    // Empty Constructor
    public ClientDTO() {
    }

    // Constructor
    public ClientDTO(String from, String text) {
        this.from = from;
        this.text = text;
    }

    // Getter and Setter
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}