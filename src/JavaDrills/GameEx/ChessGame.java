package JavaDrills.GameEx;

public class ChessGame implements GamingConsole {

        @Override
        public void up() {
            System.out.println("Piece moves forward");
        }

        @Override
        public void down() {
            System.out.println("Piece moves backwards");
        }

        @Override
        public void left() {
            System.out.printf("Piece moves left");
        }

        @Override
        public void right() {
            System.out.println("Moves right");
        }
    }

