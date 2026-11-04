public class Kolcsonzes {
    //Név
    public String nev;

    public Kolcsonzes(String line) {
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getNev() {
        return nev;
    }

    //JAzon - Jármű azonosító
    public String jazon;

    public void setJazon(String jazon) {
        this.jazon = jazon;
    }
    public String getJazon() {
        return jazon;
    }

    //EÓra - Elvitel óra
    public int eora;

    public void setEora(int eora) {
        this.eora = eora;
    }
    public int getEora() {
        return eora;
    }

    //EPerc - Elvitel perc
    public int eperc;

    public void setEperc(int eperc) {
        this.eperc = eperc;
    }
    public int getEperc() {
        return eperc;
    }

    //VÓra - Visszahozatal óra
    public int vora;

    public void setVora(int vora) {
        this.vora = vora;
    }
    public int getVora() {
        return vora;
    }

    //Vperc - Visszahozatal perc
    public int vperc;

    public void setVperc(int vperc) {
        this.vperc = vperc;
    }
    public int getVperc() {
        return vperc;
    }
}
