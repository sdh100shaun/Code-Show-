package ws.codesho.codeshows.modules.bamboo.models;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="resources/resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resources {

    @XmlAttribute
    private Integer size;
    @XmlAttribute(name="max-result")
    private Integer maxResult;
    @XmlAttribute(name="start-index")
    private Integer startIndex;
    @XmlElement(name="resource")
    public List<Resource> resourceList;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }
}
