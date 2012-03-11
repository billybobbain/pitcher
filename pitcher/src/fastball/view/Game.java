package fastball.view;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "game")
@Default(DefaultType.FIELD)
public class Game {
    public Game() {
        super();
    }

    @Attribute(name = "venue")
    private String venue;
    @Attribute(name = "date")
    private String date;
    @ElementList(inline=true)
    private List<Team> team;
    @Element(name = "umpires")
    private Umpires umpires;   
    

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }

    public List<Team> getTeam() {
        return team;
    }

    public void setUmpires(Umpires umpires) {
        this.umpires = umpires;
    }

    public Umpires getUmpires() {
        return umpires;
    }
}
