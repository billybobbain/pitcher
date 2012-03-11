/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fastball.view.scoreboard;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "game")
@Default(DefaultType.FIELD)
public class Game {
    
    @Attribute(name="id")
    private String id;
    
    @Attribute(name="league")
    private String league;
    @Attribute(name="status")
    private String status;
    @Attribute(name="start_time")
    private String startTime;
    @Attribute(name="home_code")
    private String homeCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getHomeCode() {
		return homeCode;
	}

	public void setHomeCode(String homeCode) {
		this.homeCode = homeCode;
	}
    
    
    
}
