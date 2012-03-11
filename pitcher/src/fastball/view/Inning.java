package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(strict=false,name = "inning")
@Default(DefaultType.FIELD)
public class Inning {

    
    @Attribute(name="num") private Integer num;
    @Attribute(name="away_team") private String awayTeam;
    @Attribute(name="home_team") private String homeTeam;
    @Attribute(name="next") private String next;
    @Element(name="top",required=false) private Top top;
    @Element(name="bottom",required=false) private Bottom bottom;
    

    public void setNum(Integer num) {
        this.num = num;
    }

    
    public Integer getNum() {
        return num;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

   
    public String getAwayTeam() {
        return awayTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }


    public String getHomeTeam() {
        return homeTeam;
    }

    public void setNext(String next) {
        this.next = next;
    }


    public String getNext() {
        return next;
    }

    public void setTop(Top top) {
        this.top = top;
        top.setTeamName(this.awayTeam);
    }

    public Top getTop() {
        top.setTeamName(this.awayTeam);
        return top;
    }

    public void setBottom(Bottom bottom) {
        this.bottom = bottom;
        bottom.setTeamName(this.homeTeam);
    }

    public Bottom getBottom() {
      if(bottom != null) bottom.setTeamName(this.homeTeam);
        return bottom;
    }
}
