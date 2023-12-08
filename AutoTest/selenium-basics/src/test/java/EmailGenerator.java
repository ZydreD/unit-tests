import org.apache.commons.lang3.RandomStringUtils;

public class EmailGenerator {
    public String randomestring() {
        String generatedstring = RandomStringUtils.randomAlphabetic(8);
        return (generatedstring);
    }

}
