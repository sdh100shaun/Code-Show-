package ws.codesho.codeshows.modules.bamboo.models;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resource {

    @XmlAttribute
    private String name;
    @XmlElement
    private Link link;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
