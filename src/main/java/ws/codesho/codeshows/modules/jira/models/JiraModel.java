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
    private Project project;

    public void getProjectsFromWebService() {
        project = super.getForObject(projectWebServiceUrl, Project.class);
    }

    public Project getProjects() {
        return project;
    }

}
