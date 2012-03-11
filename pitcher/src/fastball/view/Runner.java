package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "runner")
@Default(DefaultType.FIELD)
public class Runner {
	
	@Attribute
	private String id;
	@Attribute
	private String start;
	@Attribute
	private String end;
	@Attribute
	private String event;
	@Attribute(required=false)
	private String score;
	@Attribute(required=false)
	private String rbi;
	@Attribute(required=false)
	private String earned;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getRbi() {
		return rbi;
	}
	public void setRbi(String rbi) {
		this.rbi = rbi;
	}
	public String getEarned() {
		return earned;
	}
	public void setEarned(String earned) {
		this.earned = earned;
	}

}
