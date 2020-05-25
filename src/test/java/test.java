import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void equals()
    {
        EqualsVerifier.forClass(person.class).verify();
    }
}
