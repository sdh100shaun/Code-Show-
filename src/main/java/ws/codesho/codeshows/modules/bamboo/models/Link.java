package ws.codesho.codeshows.modules.bamboo.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: ben
 * Date: 27/02/2012
 * Time: 15:54
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name="link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

    @XmlAttribute
    private String rel;
    @XmlAttribute
    private String href;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
