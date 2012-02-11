package ws.codesho.codeshows.models;

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

    @Value("${bamboo.webserviceUrl}")
    private String webServiceUrl;
    private Info info;

    public String getWebServiceUrl() {
        return webServiceUrl;
    }

    public Info getInfo() {
        return info;
    }

    public void getInfoFromWebService() {
        this.info = super.getForObject(this.webServiceUrl, Info.class);

    }
}
