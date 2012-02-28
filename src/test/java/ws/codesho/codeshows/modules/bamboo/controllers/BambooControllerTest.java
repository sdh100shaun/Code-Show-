package ws.codesho.codeshows.modules.bamboo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.MockitoCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import ws.codesho.codeshows.modules.bamboo.models.BambooModel;
import ws.codesho.codeshows.modules.bamboo.models.Info;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BambooControllerTest {

    private BambooController bambooController;
    private Model mockedModel = mock(Model.class);

    @Before
    public void setUp() {

        BambooModel mockedBambooModel = mock(BambooModel.class);
        when(mockedBambooModel.getInfo()).thenReturn(new Info());

        this.bambooController = new BambooController(mockedBambooModel);
    }

    @Test
    public void testViewNameSetToBamboo() {

        ModelAndView modelAndView = bambooController.info(new ModelAndView());
        String viewName = modelAndView.getViewName();

        Assert.assertSame("info", viewName);
    }

    @Test
    public void testInfoObjectSetOnBambooModel() {

        ModelAndView modelAndView = bambooController.info(new ModelAndView());
        Info info = (Info) modelAndView.getModel().get("info");

        Assert.assertSame(info.getClass(), Info.class);
    }
}
