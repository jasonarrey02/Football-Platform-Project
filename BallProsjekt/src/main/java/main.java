import java.util.Arrays;
import java.util.List;

public class main {
    static void main() {

        List<Player> spillerListe = Arrays.asList(
                new Player("Erling", "Haaland", 25, 1.94, 88.0, Fot.HOYRE, "ST", "LW"),
                new Player("Martin", "Ødegaard", 27, 1.78, 68.0, Fot.VENSTRE, "CAM", "CM"),
                new Player("Kevin", "De Bruyne", 35, 1.81, 70.0, Fot.HOYRE, "CM", "CAM"),
                new Player("Virgil", "van Dijk", 34, 1.95, 92.0, Fot.HOYRE, "CB", ""),
                new Player("Kylian", "Mbappé", 27, 1.78, 73.0, Fot.HOYRE, "ST", "LW"),
                new Player("Alisson", "Becker", 33, 1.91, 91.0, Fot.HOYRE, "GK", ""),
                new Player("Jude", "Bellingham", 23, 1.86, 75.0, Fot.HOYRE, "CM", "AM"),
                new Player("Vinicius", "Junior", 25, 1.76, 73.0, Fot.HOYRE, "LW", "ST"));


        Player jason = new Player("Jason", "Arrey", 24, 1.95, 84.0, Fot.HOYRE, "CM", "CDM");

        System.out.println(jason.getFornavn());

    }
}
