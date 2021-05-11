package JavaDrills.GameEx;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};
        //MarioGame game = new MarioGame();
        //ChessGame game = new ChessGame();
        for(GamingConsole game:games){
            game.up();
            game.down();
        }


    }
}
