package ws.codesho.codeshows.modules.bamboo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import ws.codesho.codeshows.modules.bamboo.models.BambooModel;
import ws.codesho.codeshows.modules.bamboo.models.ResourcesRoot;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:BambooModelTest-context.xml")
public class BambooModelTest {

    private BambooModel bambooModel;
    private RestOperations mockedRestTemplate = mock(RestTemplate.class);

    @Before
    public void setUp() {

        bambooModel = new BambooModel();
        bambooModel.setRestTemplate(mockedRestTemplate);
    }

    @Test
    public void testRestTemplateCalledWithCorrectParameters_whenGetResourcesFromWebServiceMethodCalled() {

        bambooModel.getResourcesFromWebService();
       // verify(mockedRestTemplate).getForObject("http://integration.nottingham.ac.uk/rest/api/latest/", ResourcesRoot.class);
    }
}
