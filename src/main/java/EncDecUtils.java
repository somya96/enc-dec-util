import java.util.Base64;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EncDecUtils {

    public void gradleTest() {
        System.out.println("Successful");
    }

    public String encodeToBase64(byte[] input) {
        return Base64.getEncoder().encodeToString(input);
    }

    public void encrypt() throws JsonProcessingException {
        TestDO domain = new TestDO();
        domain.setId(123);
        String testObj = new ObjectMapper().writeValueAsString(domain);
        System.out.println(testObj);
    }
}
