package ws.codesho.codeshows.modules.jira.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ws.codesho.codeshows.modules.bamboo.models.ResourcesRoot;
import ws.codesho.codeshows.modules.jira.models.JiraModel;
import ws.codesho.codeshows.modules.jira.models.Project;
import ws.codesho.codeshows.modules.jira.models.Projects;

@Controller
public class JiraController {

    private JiraModel jiraModel;


    public JiraController() {
    }

    @Autowired
    public JiraController(JiraModel jiraModel) {
        this.jiraModel = jiraModel;
    }

    @RequestMapping(value = "/jira", method = RequestMethod.GET)
    public ModelAndView jira(ModelAndView modelAndView) {

        modelAndView.setViewName("projects");

        jiraModel.getProjectsFromWebService();
        Projects projects = jiraModel.getProjects();
        modelAndView.addObject("projects", projects);

        return modelAndView;
    }

    //this is obviously a bad idea to hard-code, just a bit of testing
    @RequestMapping(value = "/jira/amenities", method = RequestMethod.GET)
    public ModelAndView amenities(ModelAndView modelAndView) {

        modelAndView.setViewName("project");

        jiraModel.getAmenitiesFromWebSerice();
        Project project = jiraModel.getProject();
        modelAndView.addObject("project", project);

        return modelAndView;
    }
}
