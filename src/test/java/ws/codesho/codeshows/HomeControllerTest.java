package ws.codesho.codeshows;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;




@ContextConfiguration("classpath:/HomeControllerTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)



public class HomeControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDemo()
	{
		Assert.assertTrue(true);
		
	}
}
