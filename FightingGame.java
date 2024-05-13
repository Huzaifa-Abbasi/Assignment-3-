import java.util.Scanner;

class player{
    private String name;
    private int health;
    private int attackPower;

    public void setValues(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        
        
    }

    public void getValues() {
        System.out.println("Player Name: " + name);
        System.out.println("Player Health: " + health);
        System.out.println("Player Attack Power: " + attackPower);
    }
}  


public class FightingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player 1's name: ");
        String name1 = sc.next();
        System.out.print("Enter player 1's HP: ");
        int health1 = sc.nextInt();
        System.out.print("Enter player 1's attack power: ");
        int attackPower1 = sc.nextInt();

        System.out.print("Enter player 2's name: ");
        String name2 = sc.next();
        System.out.print("Enter player 2's HP: ");
        int health2 = sc.nextInt();
        System.out.print("Enter player 2's attack power: ");
        int attackPower2 = sc.nextInt();

        // Creating player objects
        player player1 = new player();
        player player2 = new player();

        // Setting values for player1
        player1.setValues(name1, health1, attackPower1);
        // Setting values for player2
        player2.setValues(name2, health2, attackPower2);

        // Displaying player information
        System.out.println("Player 1:");
        player1.getValues();
        System.out.println("Player 2:");
        player2.getValues();
    }
}