package fastball.view;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "umpires")
public class Umpires {
    public Umpires() {
        super();
    }

    @ElementList(inline=true)
    private List<Umpire> umpire;

    public void setUmpires(List<Umpire> umpire) {
        this.umpire = umpire;
    }

    public List<Umpire> getUmpires() {
        return umpire;
    }
}
