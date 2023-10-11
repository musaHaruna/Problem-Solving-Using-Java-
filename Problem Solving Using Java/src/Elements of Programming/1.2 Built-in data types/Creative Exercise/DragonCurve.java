// Dragon curves. Write a program to print the instructions for drawing the
// dragon curves of order 0 through 5. The instructions are strings of F, L, and R
// characters, where F means “draw line while moving 1 unit
// forward,” L means “turn left,” and R means “turn right.” A
// dragon curve of order n is formed when you fold a strip
// of paper in half n times, then unfold to right angles. The
// key to solving this problem is to note that a curve of order
// n is a curve of order n1 followed by an L followed by a
// curve of order n1 traversed in reverse order, and then
// to figure out a similar description for the reverse 



// Hint Try Folding a paper as described in the problem.

public class DragonCurve {
    public static void main(String[] args) {
        String dragon0 = "F";
        String nogard0 = "F";
        String dragon1 = dragon0 + "L" + nogard0;
        String nogard1 = dragon0 + "R" + nogard0;
        String dragon2 = dragon1 + "L" + nogard1;
        String nogard2 = dragon1 + "R" + nogard1;
        String dragon3 = dragon2 + "L" + nogard2;
        String nogard3 = dragon2 + "R" + nogard2;
        String dragon4 = dragon3 + "L" + nogard3;
        String nogard4 = dragon3 + "R" + nogard3;
        String dragon5 = dragon4 + "L" + nogard4;

        System.out.println(dragon1);
        System.out.println(nogard1);
        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);
    }

}
