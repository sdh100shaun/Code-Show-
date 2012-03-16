package ws.codesho.codeshows.modules.bamboo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ws.codesho.codeshows.modules.bamboo.models.BambooModel;
import ws.codesho.codeshows.modules.bamboo.models.Info;
import ws.codesho.codeshows.modules.bamboo.models.ResourcesRoot;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BambooController {

    private BambooModel bambooModel;


    public BambooController() {}

    @Autowired
    public BambooController(BambooModel bambooModel) {
        this.bambooModel = bambooModel;
    }


    @RequestMapping(value = "/bamboo", method = RequestMethod.GET)
    public ModelAndView bamboo(ModelAndView modelAndView) {

        modelAndView.setViewName("resources");

        bambooModel.getResourcesFromWebService();
        ResourcesRoot resources = bambooModel.getResources();
        modelAndView.addObject("resources", resources);

        return modelAndView;
    }

    @RequestMapping(value = "/bamboo/info", method = RequestMethod.GET)
    public ModelAndView info(ModelAndView modelAndView) {

        modelAndView.setViewName("info");

        bambooModel.getInfoFromWebService();
        Info info = bambooModel.getInfo();
        modelAndView.addObject("info", info);

        return modelAndView;
    }
}
