import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        File kolcsonzes = new File("src/kolcsonzesek.txt");
        try (Scanner olvaso = new Scanner(kolcsonzes)) {
            while (olvaso.hasNextLine()){
                String adat = olvaso.nextLine();
                System.out.println(adat);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}