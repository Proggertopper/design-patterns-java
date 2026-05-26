package structural.adapter;

public class TestClient {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(hole.fits(roundPeg)){
            System.out.println("RoundPeg with 5cm radius fits in hole with 5 cm radius");
        }

//        SquarePeg peg = new SquarePeg(5);
//        hole.fits(peg)  not working because castException and we need use our adapter pattern
        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg bigPeg = new SquarePeg(10);
        SquarePegAdapter pegAdapterSmall = new SquarePegAdapter(smallPeg);
        SquarePegAdapter pegAdapterBig = new SquarePegAdapter(bigPeg);
        if (hole.fits(pegAdapterSmall)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(pegAdapterBig)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
