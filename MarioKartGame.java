public class MarioKartGame {

    public static void main(String[] args) {
        MarioKartPlayer player1 = new MarioKartPlayer("Player1", "Mario", 50);
        MarioKartPlayer player2 = new MarioKartPlayer("Player2", "Luigi", 45);



        player1.displayInfo();
        player2.displayInfo();


        player1.boost();
        player2.boost();


        System.out.println();
        player1.displayInfo();
        player2.displayInfo();
    }
}