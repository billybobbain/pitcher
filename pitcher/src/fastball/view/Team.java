package fastball.view;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


@Root(strict=false,name = "team")
@Default(DefaultType.FIELD)
public class Team {
    public Team() {
        super();
    }

    @Attribute(name = "type")
    private String type;
    @Attribute(name = "id")
    private String id;
    @Attribute(name = "name")
    private String name;
    
    @ElementList(entry="player", inline=true)
    private List<TeamPlayer> player;

    @ElementList(entry="coach",inline=true)
    private List<Coach> coach;
    
    public List<Coach> getCoach() {
		return coach;
	}

	public void setCoach(List<Coach> coach) {
		this.coach = coach;
	}

	public List<TeamPlayer> getPlayer() {
		return player;
	}

	public void setPlayer(List<TeamPlayer> player) {
		this.player = player;
	}

	public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
