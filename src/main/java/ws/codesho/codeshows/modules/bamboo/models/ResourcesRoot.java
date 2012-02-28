package ws.codesho.codeshows.modules.bamboo.models;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.*;

@Component
@XmlRootElement(name="resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourcesRoot {

    @XmlAttribute
    private String expand;
    @XmlElement
    private Link link;
    @XmlElement
    private Resources resources;


    public String getExpand() {
        return expand;
    }

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }
}
