package es.coding.hangryapicore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "greeting")
public class GreetingEntity {

    @Id
    private final Long id;
    private final String content;

    public GreetingEntity(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "Greeting[id=%d, content='%s']",
                id, content);
    }
}