import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.*;

//@Suite
@IncludeEngines("cucumber")
@SuiteDisplayName("Cucumber Platform Suite")
@Cucumber
public class TestRunner{

}
