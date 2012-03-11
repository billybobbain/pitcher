/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package fastball.view;

import java.util.List;

/**
 *
 * @author wayne
 */
public interface HalfInning {

    List<AtBat> getAtBat();

    String getTeamName();

    void setAtBat(List<AtBat> atBat);

    void setTeamName(String teamName);
    
}
