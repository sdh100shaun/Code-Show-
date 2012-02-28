package ws.codesho.codeshows.modules.bamboo.models;

import javax.xml.bind.annotation.*;
import javax.xml.transform.Result;
import java.util.List;

@XmlRootElement(name="resources/resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resources {

    @XmlAttribute
    private Integer size;
    @XmlAttribute()
    private Integer maxSize;
    @XmlAttribute
    private Integer startIndex;
    /*
    @XmlValue
    private List<Resource> resourceList;
    */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
    /*
    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    } */
}
