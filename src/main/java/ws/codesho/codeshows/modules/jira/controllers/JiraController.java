package ws.codesho.codeshows.modules.jira.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "/jira/project", method = RequestMethod.GET)
    public ModelAndView jira(HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("projects");

        jiraModel.getProjectsFromWebService();
        Projects projects = jiraModel.getProjects();
        modelAndView.addObject("projects", projects);
        modelAndView.addObject("url", request.getRequestURL());

        return modelAndView;
    }

    @RequestMapping(value = "/jira/project/{projectKey}", method = RequestMethod.GET)
    public ModelAndView amenities(@PathVariable("projectKey") String projectKey, HttpServletRequest request, ModelAndView modelAndView) {

        modelAndView.setViewName("project");

        jiraModel.getProjectFromWebSerice(request.getRequestURL(), projectKey);
        Project project = jiraModel.getProject();
        modelAndView.addObject("project", project);

        return modelAndView;
    }
}
