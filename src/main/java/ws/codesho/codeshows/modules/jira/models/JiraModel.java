package ws.codesho.codeshows.modules.jira.models;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import ws.codesho.codeshows.modules.bamboo.models.Info;

import java.io.IOException;


@Repository
public class JiraModel {

    @Value("${jira.restApiUrl}")
    private String jiraRestApiUrl;
    @Value("${jira.restApiCurrentVersion}")
    private String jiraRestApiCurrentVersion;
    @Value("${jira.authenticationQueryString}")
    private String jiraAuthenticationQueryString;
    @Value("${jira.projectWebServiceUrl}")
    private String projectWebServiceUrl;
    @Autowired
    private RestOperations restTemplate;
    private Projects projects;
    private Project project;

    public void getProjectsFromWebService() {
        projects = restTemplate.getForObject(projectWebServiceUrl, Projects.class);
    }

    public Projects getProjects() {
        return projects;
    }

    public void getProjectFromWebSerice(StringBuffer url, String projectKey) {
        String requestUrl = jiraRestApiUrl+jiraRestApiCurrentVersion+"/project/"+projectKey+"?"+jiraAuthenticationQueryString;
        project = restTemplate.getForObject(requestUrl, Project.class);
    }

    public Project getProject() {
        return project;
    }

}
