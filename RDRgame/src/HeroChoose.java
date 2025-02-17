import java.util.Scanner;

public class HeroChoose{

    public String pickedCh;
    public void showInfoToChoose(){
        Scanner in = new Scanner(System.in);
        System.out.println("Arthur Morgan (glowny rewolwerowiec): ");
        System.out.println("Charles Smith (przyjaciel indian, czlowiek lasu): ");
        System.out.println("John Marston (rodzinny madry rewolwerowiec): ");
        System.out.println("Micah Bell (zlol*raczej go nie wybieraj*): ");
        System.out.println("Sadie Adler (twarda rewolwerowczyni): ");
        System.out.println("Uncle (pijak - lumbago!!!): ");
        System.out.println("Wpisz pierwsza litere imienia postaci ktora chcesz wybrac: ");
        pickedCh = in.nextLine();
        pickedCh = pickedCh.toUpperCase();
    }


}
