public class MarioKartPlayer {


    private String playerName;
    private String character;
    private int speed = 10;


    public MarioKartPlayer(String playerName, String character, int startingSpeed) {
        this.playerName = playerName;
        this.character = character;
    }


    public void boost() {
        speed += 5;
    }


    public void displayInfo() {
        System.out.println("Player: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
        System.out.println();
    }
}