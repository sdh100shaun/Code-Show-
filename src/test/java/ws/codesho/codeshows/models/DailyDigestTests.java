package ws.codesho.codeshows.models;


import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import mailjimp.dom.list.MailingList;

@ContextConfiguration("classpath:/HomeControllerTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)

public class DailyDigestTests {
	
	@Autowired
	private DailyDigest dailyDigest; 

	@Before
	public void setUp() throws Exception {
		
		
	}
	
	@Test
	public void ServiceReturnsLists()
	{
		List<MailingList> actualLists = dailyDigest.getMailingLists(); 
		Assert.assertEquals("failed to get Mailings list drawn from Mailchimp", 1, actualLists.size()); 
	}

}
