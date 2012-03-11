package fastball.view;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Root;


@Root(strict=false,name = "pitch")
@Default(DefaultType.FIELD)
public class Pitch {
    public Pitch() {
        super();
    }

    //  <pitch des="Called Strike" id="3" type="S" x="91.85" y="140.74" sv_id="101007_143739" start_speed="92.1" end_speed="84.2" sz_top="3.405" sz_bot="1.475" pfx_x="-5.5" pfx_z="12.28" px="0.389" pz="2.816"
    // x0="-1.034" y0="50.0" z0="5.82" vx0="5.67" vy0="-134.86" vz0="-6.154" ax="-10.055" ay="31.352" az="-9.656" break_y="23.7" break_angle="38.3" break_length="3.1" pitch_type="FF" type_confidence=".910" zone="3" nasty="52" spin_dir="204.061" spin_rate="2652.951"  cc=""/>

    @Attribute(name = "des",required=false)
    private String des;
    @Attribute(name = "id",required=false)
    private String id;
    @Attribute(name = "type",required=false)
    private String type;
    @Attribute(name = "tfs",required=false)
    private String tfs;
    @Attribute(name = "tfs_zulu",required=false)
    private String tfsZulu;    
    @Attribute(name = "x",required=false)
    private Double x;
    @Attribute(name = "y",required=false)
    private Double y;
    @Attribute(name = "sv_id",required=false)
    private String svId;
    @Attribute(name = "start_speed",required=false)
    private Double startSpeed;
    @Attribute(name = "end_speed",required=false)
    private Double endSpeed;
    @Attribute(name = "sz_top",required=false)
    private Double szTop;
    @Attribute(name = "sz_bot",required=false)
    private Double szBottom;
    @Attribute(name = "pfx_x",required=false)
    private Double pfx_x;
    @Attribute(name = "pfx_z",required=false)
    private Double pfx_z;
    @Attribute(name = "px",required=false)
    private Double px;
    @Attribute(name = "pz",required=false)
    private Double pz;
    @Attribute(name = "x0",required=false)
    private Double x0;
    @Attribute(name = "y0",required=false)
    private Double y0;
    @Attribute(name = "z0",required=false)
    private Double z0;
    @Attribute(name = "vx0",required=false)
    private Double vx;
    @Attribute(name = "vy0",required=false)
    private Double vy0;
    @Attribute(name = "vz0",required=false)
    private Double vz0;
    @Attribute(name = "ax",required=false)
    private Double ax;
    @Attribute(name = "ay",required=false)
    private Double ay;
    @Attribute(name = "az",required=false)
    private Double az;
    @Attribute(name = "break_y",required=false)
    private Double breakY;
    @Attribute(name = "break_angle",required=false)
    private Double breakAngle;
    @Attribute(name = "break_length",required=false)
    private Double breakLength;
    @Attribute(name = "pitch_type",required=false)
    private String pitchType;
    @Attribute(name = "type_confidence",required=false)
    private Double typeConfidence;
    @Attribute(name = "zone",required=false)
    private Integer zone;
    @Attribute(name = "nasty",required=false)
    private Integer nasty;
    @Attribute(name = "spin_dir",required=false)
    private Double spinDir;
    @Attribute(name = "spin_rate",required=false)
    private Double spinRate;
    @Attribute(name = "cc",required=false)
    private String cc;
    @Attribute(name = "mt",required=false)
    private String mt;
    @Attribute(name="on_1b",required=false)
    private String on1b;
    @Attribute(name="on_2b",required=false)
    private String on2b;
    @Attribute(name="on_3b",required=false)
    private String on3b;

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getX() {
        return x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getY() {
        return y;
    }

    public void setSvId(String svId) {
        this.svId = svId;
    }

    public String getSvId() {
        return svId;
    }

    public void setStartSpeed(Double startSpeed) {
        this.startSpeed = startSpeed;
    }

    public Double getStartSpeed() {
        return startSpeed;
    }

    public void setEndSpeed(Double endSpeed) {
        this.endSpeed = endSpeed;
    }

    public Double getEndSpeed() {
        return endSpeed;
    }

    public void setSzTop(Double szTop) {
        this.szTop = szTop;
    }

    public Double getSzTop() {
        return szTop;
    }

    public void setSzBottom(Double szBottom) {
        this.szBottom = szBottom;
    }

    public Double getSzBottom() {
        return szBottom;
    }

    public void setPfx_x(Double pfx_x) {
        this.pfx_x = pfx_x;
    }

    public Double getPfx_x() {
        return pfx_x;
    }

    public void setPfx_z(Double pfx_z) {
        this.pfx_z = pfx_z;
    }

    public Double getPfx_z() {
        return pfx_z;
    }

    public void setPx(Double px) {
        this.px = px;
    }

    public Double getPx() {
        return px;
    }

    public void setPz(Double pz) {
        this.pz = pz;
    }

    public Double getPz() {
        return pz;
    }

    public void setX0(Double x0) {
        this.x0 = x0;
    }

    public Double getX0() {
        return x0;
    }

    public void setY0(Double y0) {
        this.y0 = y0;
    }

    public Double getY0() {
        return y0;
    }

    public void setZ0(Double z0) {
        this.z0 = z0;
    }

    public Double getZ0() {
        return z0;
    }

    public void setVx(Double vx) {
        this.vx = vx;
    }

    public Double getVx() {
        return vx;
    }

    public void setVy0(Double vy0) {
        this.vy0 = vy0;
    }

    public Double getVy0() {
        return vy0;
    }

    public void setVz0(Double vz0) {
        this.vz0 = vz0;
    }

    public Double getVz0() {
        return vz0;
    }

    public void setAx(Double ax) {
        this.ax = ax;
    }

    public Double getAx() {
        return ax;
    }

    public void setAy(Double ay) {
        this.ay = ay;
    }

    public Double getAy() {
        return ay;
    }

    public void setAz(Double az) {
        this.az = az;
    }

    public Double getAz() {
        return az;
    }

    public void setBreakY(Double breakY) {
        this.breakY = breakY;
    }

    public Double getBreakY() {
        return breakY;
    }

    public void setBreakAngle(Double breakAngle) {
        this.breakAngle = breakAngle;
    }

    public Double getBreakAngle() {
        return breakAngle;
    }

    public void setBreakLength(Double breakLength) {
        this.breakLength = breakLength;
    }

    public Double getBreakLength() {
        return breakLength;
    }

    public void setPitchType(String pitchType) {
        this.pitchType = pitchType;
    }

    public String getPitchType() {
        return pitchType;
    }

    public void setTypeConfidence(Double typeConfidence) {
        this.typeConfidence = typeConfidence;
    }

    public Double getTypeConfidence() {
        return typeConfidence;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public Integer getZone() {
        return zone;
    }

    public void setNasty(Integer nasty) {
        this.nasty = nasty;
    }

    public Integer getNasty() {
        return nasty;
    }

    public void setSpinDir(Double spinDir) {
        this.spinDir = spinDir;
    }

    public Double getSpinDir() {
        return spinDir;
    }

    public void setSpinRate(Double spinRate) {
        this.spinRate = spinRate;
    }

    public Double getSpinRate() {
        return spinRate;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCc() {
        return cc;
    }

	public String getTfs() {
		return tfs;
	}

	public void setTfs(String tfs) {
		this.tfs = tfs;
	}

	public String getTfsZulu() {
		return tfsZulu;
	}

	public void setTfsZulu(String tfsZulu) {
		this.tfsZulu = tfsZulu;
	}

	public String getMt() {
		return mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public String getOn1b() {
		return on1b;
	}

	public void setOn1b(String on1b) {
		this.on1b = on1b;
	}

	public String getOn2b() {
		return on2b;
	}

	public void setOn2b(String on2b) {
		this.on2b = on2b;
	}

	public String getOn3b() {
		return on3b;
	}

	public void setOn3b(String on3b) {
		this.on3b = on3b;
	}
}
