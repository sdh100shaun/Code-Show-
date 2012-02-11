package ws.codesho.codeshows.models;

import java.util.List;

import mailjimp.dom.list.MailingList;
import mailjimp.service.MailJimpException;
import mailjimp.service.impl.MailJimpService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shaunhare
 *
 */
public class DailyDigest implements IDailyDigest{

	@Autowired
	 private MailJimpService mailChimpService; 
	
	public List<MailingList> getMailingLists()
	{
		try {
			
			return mailChimpService.getLists();
			
		} catch (MailJimpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  null; 
		
	}
}
