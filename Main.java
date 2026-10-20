import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // BAGIAN A
        // Membuat 3 character
        // ==============================

        Character character1 = new Character(
                "Arthas",
                CharacterType.WARRIOR
        );

        Character character2 = new Character(
                "Merlin",
                CharacterType.MAGE
        );

        Character character3 = new Character(
                "Legolas",
                CharacterType.ARCHER
        );

        System.out.println("=================================");
        System.out.println("       DAFTAR CHARACTER");
        System.out.println("=================================");

        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);

        // ==============================
        // DEMO LEVEL UP
        // ==============================

        System.out.println();
        System.out.println("=================================");
        System.out.println("          DEMO LEVEL UP");
        System.out.println("=================================");

        System.out.println("Sebelum level up:");
        System.out.println(character1);

        character1.levelUp();

        System.out.println();
        System.out.println("Sesudah level up:");
        System.out.println(character1);

        // ==============================
        // BAGIAN B
        // Mini-Challenge
        // ==============================

        System.out.println();
        System.out.println("=================================");
        System.out.println("       MINI-CHALLENGE BAGIAN B");
        System.out.println("=================================");

        // Membuat character baru
        Character character4 = new Character(
                "Shadow",
                CharacterType.ASSASSIN
        );

        // Mengatur mana
        character4.setMana(75);

        // Menampilkan character baru
        System.out.println("Character baru:");
        System.out.println(character4);

        // Menampilkan mana
        System.out.println();
        System.out.println("Mana Shadow: " + character4.getMana());

        // Mengecek apakah character masih hidup
        System.out.println(
                "Apakah Shadow masih hidup? " + character4.isAlive()
        );
    }
}