/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.pons.chronometre;

/**
 *
 * @author hugop
 */
public class chrono {
   private static int seconde=0,minute,period = 100,dixieme=0;

    public static int getDelai() {
        return period;
    }

    public static int getSeconde() {
        return seconde;
    }

    public static void setSeconde(int seconde) {
        chrono.seconde = seconde;
    }

    public static int getMinute() {
        return minute;
    }
    public static void setMinute(int minute) {
        chrono.minute = minute;
    }

    public static int getPeriod() {
        return period;
    }

    public static void setPeriod(int aPeriod) {
        period = aPeriod;
    }

    public static int getDixieme() {
        return dixieme;
    }

    public static void setDixieme(int aCentieme) {
        dixieme = aCentieme;
    }

}
