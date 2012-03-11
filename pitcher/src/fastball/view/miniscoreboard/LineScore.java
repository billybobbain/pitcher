package fastball.view.miniscoreboard;

import java.util.List;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name="linescore")
@Default(DefaultType.FIELD)
public class LineScore {
	
	@ElementList(inline=true,entry="inning",required=false)
	private List<Inning> inning;

	public List<Inning> getInning() {
		return inning;
	}

	public void setInning(List<Inning> inning) {
		this.inning = inning;
	}

}
