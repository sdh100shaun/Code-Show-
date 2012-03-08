package ws.codesho.codeshows.modules.jira.models;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import ws.codesho.codeshows.modules.bamboo.models.Info;

import java.io.IOException;


@Repository
public class JiraModel extends RestTemplate {

    @Value("${jira.projectWebServiceUrl}")
    private String projectWebServiceUrl;
    @Value("${jira.projectAmenitiesWebServiceUrl}")
    private String amenitiesWebServiceUrl;
    private Projects projects;
    private Project project;

    public void getProjectsFromWebService() {
        projects = super.getForObject(projectWebServiceUrl, Projects.class);
    }

    public Projects getProjects() {
        return projects;
    }

    public void getAmenitiesFromWebSerice() {
        project = super.getForObject(amenitiesWebServiceUrl, Project.class);
    }

    public Project getProject() {
        return project;
    }

}
