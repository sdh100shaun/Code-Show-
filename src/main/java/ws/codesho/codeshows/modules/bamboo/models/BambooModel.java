package ws.codesho.codeshows.modules.bamboo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class BambooModel extends RestTemplate {

    @Value("${bamboo.infoWebServiceUrl}")
    private String infoWebServiceUrl;
    private Info info;

    @Value("${bamboo.latestWebServiceUrl}")
    private String latestWebServiceUrl;
    private ResourcesRoot resources;


    public void getResourcesFromWebService() {
        resources = super.getForObject(this.latestWebServiceUrl, ResourcesRoot.class);
    }

    public ResourcesRoot getResources() {
        return resources;
    }

    public void getInfoFromWebService() {
        info = super.getForObject(this.infoWebServiceUrl, Info.class);
    }

    public Info getInfo() {
        return info;
    }

}
