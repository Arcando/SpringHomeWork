import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Описание гидры
 */
@Data
public class Hydra extends Head {
    private Head head;
    @Value("${hydra.name}")
    private String name;
    public List<Head> listOfHead = new ArrayList<>();

    @Autowired
    public Hydra(Head head) {
        this.head = head;
    }
}
