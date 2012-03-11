package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "player")
@Default(DefaultType.FIELD)
public class TeamPlayer {
    public TeamPlayer() {
        super();
    }

    //  <player id="503285" first="Darren" last="O'Day" num="56" boxname="O'Day" rl="R" position="P" status="A" avg=".000" hr="0" rbi="0" wins="0" losses="0" era="0.00"/>

    @Attribute(name = "id")
    private Integer id;

    @Attribute(name = "first")
    private String first;

    @Attribute(name = "last")
    private String last;
    @Attribute(name = "num")
    private Integer num;
    @Attribute(name = "boxname")
    private String boxName;
    @Attribute(name = "rl")
    private String rl;
    @Attribute(name = "position")
    private String position;
    @Attribute(name = "status")    
    private String status;
    @Attribute(name="bat_order",required=false)
    private Integer batOrder;
    public Integer getBatOrder() {
		return batOrder;
	}

	public void setBatOrder(Integer batOrder) {
		this.batOrder = batOrder;
	}

	public String getGamePosition() {
		return gamePosition;
	}

	public void setGamePosition(String gamePosition) {
		this.gamePosition = gamePosition;
	}

	@Attribute(name="game_position",required=false)
    private String gamePosition;
    @Attribute(name = "avg",required=false)
    private Double avg;
    @Attribute(name = "hr",required=false)
    private Integer hr;
    @Attribute(name = "rbi",required=false)
    private Integer rbi;
    @Attribute(name = "wins",required=false)
    private Integer wins;
    @Attribute(name = "losses",required=false)
    private Integer losses;
    @Attribute(name = "era",required=false)
    private Double era;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setRl(String rl) {
        this.rl = rl;
    }

    public String getRl() {
        return rl;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Double getAvg() {
        return avg;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getHr() {
        return hr;
    }

    public void setRbi(Integer rbi) {
        this.rbi = rbi;
    }

    public Integer getRbi() {
        return rbi;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getWins() {
        return wins;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setEra(Double era) {
        this.era = era;
    }

    public Double getEra() {
        return era;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }
    
}
