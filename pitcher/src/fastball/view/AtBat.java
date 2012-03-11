package fastball.view;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name="atbat")
@Default(DefaultType.FIELD)
public class AtBat {
    public AtBat() {
        super();
    }
    
    @Attribute(name="num",required=false) private String num;
    @Attribute(name="b",required=false) private Integer b;
    @Attribute(name="s",required=false) private Integer s;
    @Attribute(name="o",required=false) private Integer o;
    @Attribute(name="start_tfs",required=false) private Integer startTfs;
    @Attribute(name="start_tfs_zulu",required=false) private String startTfsZulu;
	@Attribute(name="batter",required=false) private Integer batter;
    @Attribute(name="stand",required=false) private String stand;
    @Attribute(name="b_height",required=false) private String batterHeight;
    @Attribute(name="pitcher",required=false) private Integer pitcher;
    @Attribute(name="p_throws",required=false) private String pitherThrows;
    @Attribute(name="des",required=false) private String des;
    @Attribute(name="event",required=false) private String event;
    @Attribute(name="event2",required=false) private String event2;
    @Attribute(name="score",required=false) private String score;
    @Attribute(name="home_team_runs",required=false) private String homeTeamRuns;
    @Attribute(name="away_team_runs",required=false) private String awayTeamRuns;
    
    
    @ElementList(inline=true,entry="pitch",required=false) 
    private List<Pitch> pitch;
    @ElementList(required=false,inline=true,entry="runner")
    private List<Runner> runner;
    
    @ElementList(required=false,inline=true,entry="po")
    private List<Po> po;


    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getB() {
        return b;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public Integer getS() {
        return s;
    }

    public void setO(Integer o) {
        this.o = o;
    }

    public Integer getO() {
        return o;
    }

    public void setStartTfs(Integer startTfs) {
        this.startTfs = startTfs;
    }

    public Integer getStartTfs() {
        return startTfs;
    }

    public void setBatter(Integer batter) {
        this.batter = batter;
    }

    public Integer getBatter() {
        return batter;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public String getStand() {
        return stand;
    }

    public void setBatterHeight(String batterHeight) {
        this.batterHeight = batterHeight;
    }

    public String getBatterHeight() {
        return batterHeight;
    }

    public void setPitcher(Integer pitcher) {
        this.pitcher = pitcher;
    }

    public Integer getPitcher() {
        return pitcher;
    }

    public void setPitherThrows(String pitherThrows) {
        this.pitherThrows = pitherThrows;
    }

    public String getPitherThrows() {
        return pitherThrows;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public void setPitch(List<Pitch> pitch) {
        this.pitch = pitch;
    }

    public List<Pitch> getPitch() {
        return pitch;
    }
    
    public String getStartTfsZulu() {
		return startTfsZulu;
	}

	public void setStartTfsZulu(String startTfsZulu) {
		this.startTfsZulu = startTfsZulu;
	}

	public List<Runner> getRunner() {
		return runner;
	}

	public void setRunner(List<Runner> runner) {
		this.runner = runner;
	}

	public List<Po> getPo() {
		return po;
	}

	public void setPo(List<Po> po) {
		this.po = po;
	}

	public String getEvent2() {
		return event2;
	}

	public void setEvent2(String event2) {
		this.event2 = event2;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getHomeTeamRuns() {
		return homeTeamRuns;
	}

	public void setHomeTeamRuns(String homeTeamRuns) {
		this.homeTeamRuns = homeTeamRuns;
	}

	public String getAwayTeamRuns() {
		return awayTeamRuns;
	}

	public void setAwayTeamRuns(String awayTeamRuns) {
		this.awayTeamRuns = awayTeamRuns;
	}


}
