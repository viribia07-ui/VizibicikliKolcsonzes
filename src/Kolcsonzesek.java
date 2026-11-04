import java.io.BufferedReader;
import java.io.FileReader;

public class Kolcsonzesek {

    private Kolcsonzes[] kolcsonzesek;

    public void setKolcsonzesek(Kolcsonzes[] kolcsonzesek) {
        this.kolcsonzesek = kolcsonzesek;
    }
    public Kolcsonzes[] getKolcsonzesek() {
        return kolcsonzesek;
    }
    public void setKolcsonzes(Kolcsonzes[] kolcsonzesek){
        this.kolcsonzesek = kolcsonzesek;
    }
    public Kolcsonzesek(){
        kolcsonzesek = new Kolcsonzes[300];
    }
    public Kolcsonzesek(int length){
        kolcsonzesek = new Kolcsonzes[length];
    }
    public Kolcsonzes[] loadFromFile(String filename){
        //file load
        int n = 0;
        try {
            String line;
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            while ((line=fileReader.readLine()) != null){
                n++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setKolcsonzesek(new Kolcsonzes[n]);

        //file init
        int i = 0;
        try {
            String line;
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            while ((line=fileReader.readLine()) != null){
                Kolcsonzes kolcsonzes = new Kolcsonzes(line);
                kolcsonzesek[i] = kolcsonzes;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getKolcsonzesek();
    }
}
