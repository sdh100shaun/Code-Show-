package ws.codesho.codeshows.modules.bamboo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


@Repository
public class BambooModel {

    @Value("${bamboo.infoWebServiceUrl}")
    private String infoWebServiceUrl;
    private Info info;

    @Value("${bamboo.latestWebServiceUrl}")
    private String latestWebServiceUrl;
    private ResourcesRoot resources;


    @Autowired
    private RestOperations restTemplate;

    public void setRestTemplate(RestOperations restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void getResourcesFromWebService() {
        resources = restTemplate.getForObject(this.latestWebServiceUrl, ResourcesRoot.class);
    }

    public ResourcesRoot getResources() {
        return resources;
    }

    public void getInfoFromWebService() {
        info = restTemplate.getForObject(this.infoWebServiceUrl, Info.class);
    }

    public Info getInfo() {
        return info;
    }

}
