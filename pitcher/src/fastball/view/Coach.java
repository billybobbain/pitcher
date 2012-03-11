package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;


@Root(strict=false,name = "coach")
public class Coach {
    public Coach() {
        super();
    }

    //  <coach position="bullpen_catcher" first="Scott" last="Cursi" id="537369" num="77"/>
    @Attribute(name = "position")
    private String position;
    @Attribute(name = "first")
    private String first;
    @Attribute(name = "last")
    private String last;
    @Attribute(name = "id")
    private Integer id;
    @Attribute(name = "num")
    private Integer num;

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getFirst() {
        return first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getLast() {
        return last;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }
}
