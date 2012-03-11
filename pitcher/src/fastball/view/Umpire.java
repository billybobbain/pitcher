package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "umpire")

public class Umpire {
    public Umpire() {
        super();
    }

    //  <umpire position="home" name="Jim Wolf" id="427554"/><umpire position="first" name="Jerry Meals" id="427339"/><umpire position="second" name="Bill Miller" id="427344"/><umpire position="third" name="Jeff Kellogg" id="427269"/>
    @Attribute(name = "position")
    private String position;
    @Attribute(name = "name")
    private String name;
    @Attribute(name = "id")
    private Integer id;


    public void setPosition(String postion) {
        this.position = postion;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
