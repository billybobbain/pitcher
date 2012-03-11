package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict=false,name = "season")

public class Season {
    public Season() {
        super();
    }
    
  @Attribute(name="des") private String des;
  @Attribute(name="avg") private Double avg;
  @Attribute(name="ab") private Integer ab;
  @Attribute(name="hr") private Integer hr;
  @Attribute(name="rbi") private Integer rbi;
  @Attribute(name="ops") private Double ops;

  public void setDes(String des) {
      this.des = des;
  }

  public String getDes() {
      return des;
  }

  public void setAvg(Double avg) {
      this.avg = avg;
  }

  public Double getAvg() {
      return avg;
  }

  public void setAb(Integer ab) {
      this.ab = ab;
  }

  public Integer getAb() {
      return ab;
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

  public void setOps(Double ops) {
      this.ops = ops;
  }

  public Double getOps() {
      return ops;
  }
}
