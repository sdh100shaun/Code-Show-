package ws.codesho.codeshows.modules.bamboo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import ws.codesho.codeshows.modules.bamboo.models.BambooModel;
import ws.codesho.codeshows.modules.bamboo.models.Info;
import ws.codesho.codeshows.modules.bamboo.models.ResourcesRoot;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BambooControllerTest {

    private BambooController bambooController;
    private BambooModel mockedBambooModel = mock(BambooModel.class);

    @Before
    public void setUp() {

        this.bambooController = new BambooController(mockedBambooModel);
    }

    @Test
    public void testViewNameSetToResources_whenBambooMethodCalled() {

        ModelAndView modelAndView = bambooController.bamboo(new ModelAndView());
        String viewName = modelAndView.getViewName();

        Assert.assertSame("resources", viewName);
    }

    @Test
    public void testResourcesObjectSetOnBambooModel_whenBambooMethodCalled() {

        when(mockedBambooModel.getResources()).thenReturn(new ResourcesRoot());

        ModelAndView modelAndView = bambooController.bamboo(new ModelAndView());
        ResourcesRoot resources = (ResourcesRoot) modelAndView.getModel().get("resources");

        Assert.assertSame(resources.getClass(), ResourcesRoot.class);
    }

    @Test
    public void testViewNameSetToInfo_whenInfoMethodCalled() {

        ModelAndView modelAndView = bambooController.info(new ModelAndView());
        String viewName = modelAndView.getViewName();

        Assert.assertSame("info", viewName);
    }

    @Test
    public void testInfoObjectSetOnBambooModel_whenInfoMethodCalled() {

        when(mockedBambooModel.getInfo()).thenReturn(new Info());

        ModelAndView modelAndView = bambooController.info(new ModelAndView());
        Info info = (Info) modelAndView.getModel().get("info");

        Assert.assertSame(info.getClass(), Info.class);
    }
}
