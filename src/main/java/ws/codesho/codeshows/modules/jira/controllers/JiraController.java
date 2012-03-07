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

    @Autowired
    public JiraController(JiraModel jiraModel) {
        this.jiraModel = jiraModel;
    }

    @RequestMapping(value = "/jira", method = RequestMethod.GET)
    public ModelAndView jira(ModelAndView modelAndView) {

        modelAndView.setViewName("project");

        jiraModel.getProjectsFromWebService();
        Project project = jiraModel.getProjects();
        modelAndView.addObject("projects", project);
        //bambooModel.getResourcesFromWebService();
        //ResourcesRoot resources = bambooModel.getResources();
        //modelAndView.addObject("resources", resources);

        return modelAndView;
    }
}
