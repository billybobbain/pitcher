package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name="action")
@Default(DefaultType.FIELD)
public class Action {
	
	@Attribute(required=false)
	private String b;
	@Attribute(required=false)
	private String s;
	@Attribute(required=false)
	private String des;
	@Attribute(required=false)
	private String event;
	@Attribute(required=false)
	private String tfs;
	@Attribute(required=false)
	private String tfs_zulu;
	@Attribute(required=false)
	private String player;
	@Attribute(required=false)
	private String pitch;
	@Attribute(required=false)
	private String o;
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getTfs() {
		return tfs;
	}
	public void setTfs(String tfs) {
		this.tfs = tfs;
	}
	public String getTfs_zulu() {
		return tfs_zulu;
	}
	public void setTfs_zulu(String tfs_zulu) {
		this.tfs_zulu = tfs_zulu;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public String getO() {
		return o;
	}
	public void setO(String o) {
		this.o = o;
	}
	

}
