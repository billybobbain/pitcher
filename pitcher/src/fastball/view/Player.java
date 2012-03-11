package fastball.view;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(strict=false,name = "Player")
@Default(DefaultType.FIELD)
public class Player {
    public Player() {
        super();
    }

    //  <Player team="tex" id="115223" pos="DH" type="batter" first_name="Vladimir" last_name="Guerrero" jersey_number="27" height="6-3" weight="235" bats="R" throws="R" dob="02/09/1975">

    @Attribute(name = "team")
    private String team;
    @Attribute(name = "id")
    private Integer id;
    @Attribute(name = "pos")
    private String pos;
    @Attribute(name = "type")
    private String type;
    @Attribute(name = "first_name")
    private String firstName;
    @Attribute(name = "last_name")
    private String lastName;
    @Attribute(name = "jersey_number")
    private Integer jerseyNumber;
    @Attribute(name = "height")
    private String height;
    @Attribute(name = "bats")
    private String bats;

    @Attribute(name = "weight")
    private Integer weight;
    @Attribute(name = "throws")
    private String throwz;
    @Attribute(name = "dob")
    private String dob;

    @Element(name = "season")
    private Season season;
    @Element(name = "series")
    private Series series;


    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPos() {
        return pos;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setThrowz(String throwz) {
        this.throwz = throwz;
    }

    public String getThrowz() {
        return throwz;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Series getSeries() {
        return series;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getBats() {
        return bats;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    
}
