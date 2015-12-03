import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;

public class SeleniumIeTest extends SeleneseTestBase{

	@Before
	public void setUp() throws Exception {
		//如果运行不了，修改浏览器为*firefox或*iexplore
		selenium = new DefaultSelenium("localhost", 4444, "*iexplore", "http://www.baidu.com");
		selenium.start();
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}

	@Test
	public void test() {
		selenium.open("/index.html");
		selenium.type("id=kw", "普京");
		fail("Not yet implemented");
	}

}
