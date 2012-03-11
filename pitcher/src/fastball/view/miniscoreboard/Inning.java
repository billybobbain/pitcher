package fastball.view.miniscoreboard;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;

@Root(strict=false,name="inning")
@Default(DefaultType.FIELD)
public class Inning {

	@Attribute(name="away",required=false,empty="X")
	private String away;
	@Attribute(name="home",required=false,empty="X")
	private String home;
	public String getAway() {
		return away;
	}
	public void setAway(String away) {
		this.away = away;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
}
