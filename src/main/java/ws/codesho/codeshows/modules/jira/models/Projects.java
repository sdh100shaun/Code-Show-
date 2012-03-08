package ws.codesho.codeshows.modules.jira.models;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Projects extends ArrayList<Project> {}
