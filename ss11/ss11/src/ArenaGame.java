package Session11.miniproject.src;

public class ArenaGame {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Yasuo", 500, 50, 20);
        characters[1] = new Mage("Veigar", 300, 40, 200);

        characters[2] = new GameCharacter("Goblin", 100, 0) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm " + target.getName());
                target.takeDamage(10);
            }
        };

        System.out.println("Tổng số nhân vật: " + GameCharacter.count);
        System.out.println();

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != null) {

                GameCharacter attacker = characters[i];
                GameCharacter target = characters[(i + 1) % characters.length];

                attacker.attack(target);
                System.out.println();
            }
        }

        if (characters[0] instanceof ISkill) {
            ((ISkill) characters[0]).useUltimate(characters[2]);
        }

        if (characters[1] instanceof ISkill) {
            ((ISkill) characters[1]).useUltimate(characters[0]);
        }

        System.out.println("\n=== TRẠNG THÁI CUỐI ===");

        for (GameCharacter character : characters) {
            if (character != null) {
                character.displayInfo();
            }
        }
    }
}
