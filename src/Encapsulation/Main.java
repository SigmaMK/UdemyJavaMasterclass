package Encapsulation;

public class Main {
    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Malcolm", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

/*        Player player = new Player();
        player.name = "Mally";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health is "+ player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health is "+ player.healthRemaining());*/
    }
}
