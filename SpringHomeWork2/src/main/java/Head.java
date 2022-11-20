import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Описание головы
 */
@Data
public class Head {
    @Value("${head.numberOfEyes}")
    private int numberOfEyes;
    @Value("${head.numberOfEars}")
    private int numberOfEars;
}