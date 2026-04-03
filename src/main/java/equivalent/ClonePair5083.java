package equivalent;

public class ClonePair5083 {
    boolean method1(int thisArray, int thisFace, int thatArray, int thatFace) {
        return (thisArray == thatArray) && (thisFace == thatFace);
    }

    boolean method2(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }
}
