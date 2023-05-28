package pegs;

import domein.RoundPeg;
import domein.SquarePeg;

public class Pegs {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insert("inserting a square peg");
        //do nu een insert met een round peg
        // ...

        roundPeg.insertIntoHole("inserting a round peg");
        //do nu een insertIntoHole met een squarepeg 
        //
    }
}
