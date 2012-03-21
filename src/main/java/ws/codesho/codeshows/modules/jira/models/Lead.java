package ws.codesho.codeshows.modules.jira.models;

/**
 * Created by IntelliJ IDEA.
 * User: ben
 * Date: 21/03/2012
 * Time: 10:45
 * To change this template use File | Settings | File Templates.
 */
public class Lead {

    private String self;
    private String name;
    private String displayName;
    private String active;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
