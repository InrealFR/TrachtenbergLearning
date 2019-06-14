/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.endurance;

/**
 *
 * @author hugop
 */
public class Countdown {
private int Minutes,Secondes=0 ;

    public Countdown(int Minutes) {
        this.Minutes = Minutes;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    public int getSecondes() {
        return Secondes;
    }

    public void setSecondes(int Secondes) {
        this.Secondes = Secondes;
    }

}
