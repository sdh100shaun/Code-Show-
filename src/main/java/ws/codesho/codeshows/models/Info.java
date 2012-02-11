package ws.codesho.codeshows.models;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ben
 * Date: 11/02/2012
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */

@Component
@XmlRootElement(name="info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {

    public Float version;
    public String edition;
    public Date buildDate;
    public Integer buildNumber;

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }
}
