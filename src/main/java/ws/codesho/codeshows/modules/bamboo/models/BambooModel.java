package ws.codesho.codeshows.modules.bamboo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: ben
 * Date: 11/02/2012
 * Time: 15:31
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class BambooModel extends RestTemplate {

    @Value("${bamboo.infoWebServiceUrl}")
    private String infoWebServiceUrl;
    private Info info;

    @Value("${bamboo.latestWebServiceUrl}")
    private String latestWebServiceUrl;
    private ResourcesRoot resources;


    public void getResourcesFromWebService() {
        this.resources = super.getForObject(this.latestWebServiceUrl, ResourcesRoot.class);
    }

    public ResourcesRoot getResources() {
        return resources;
    }

    public void getInfoFromWebService() {
        this.info = super.getForObject(this.infoWebServiceUrl, Info.class);
    }

    public Info getInfo() {
        return info;
    }

}
