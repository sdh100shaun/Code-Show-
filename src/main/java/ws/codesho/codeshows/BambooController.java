package ws.codesho.codeshows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ws.codesho.codeshows.models.BambooModel;
import ws.codesho.codeshows.models.Info;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BambooController {

    @Autowired
    BambooModel bambooModel;


    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/bamboo", method = RequestMethod.GET)
    public String bamboo(Model model) {

        String bambooUrl = bambooModel.getWebServiceUrl();
        model.addAttribute("webServiceUrl", bambooUrl);

        bambooModel.getInfoFromWebService();
        Info info = bambooModel.getInfo();
        model.addAttribute("info", info);

        return "bamboo";
    }

}
