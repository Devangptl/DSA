public class interfaceCreate {
    public static void main(String[] aegs) {

        Queen q = new Queen();
        q.walk();

        King k = new King();
        k.walk();

    }
}

// create interface

interface chessPlayer {
    void walk();
}

class Queen implements chessPlayer {
    public void walk() {
        System.out.println("rigth , left ,up ,down ,diagonal");
    }
}

class King implements chessPlayer {
    public void walk() {
        System.out.println("rigth, lrft, up, down, diagonal   - by 1 step");
    }
}