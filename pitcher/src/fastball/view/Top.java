package fastball.view;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "top")
@Default(DefaultType.FIELD)
public class Top implements HalfInning  {
    public Top() {
        super();
    }

    @ElementList(inline=true,entry="atbat")
    private List<AtBat> atBat;
    
    @Attribute(required=false)
    private String teamName;
    @ElementList(required=false,inline=true,entry="action")
    private List<Action> action;
  
    public void setAtBat(List<AtBat> atBat) {
        this.atBat = atBat;
    }


    public List<AtBat> getAtBat() {
        return atBat;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public String getTeamName() {
        return teamName;
    }


	public List<Action> getAction() {
		return action;
	}


	public void setAction(List<Action> action) {
		this.action = action;
	}
}
