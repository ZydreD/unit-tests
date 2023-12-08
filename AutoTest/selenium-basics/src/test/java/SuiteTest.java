import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CssTest.class, NewSeleniumTest.class, WaitTest.class, XpathTest.class})
public class SuiteTest {
}