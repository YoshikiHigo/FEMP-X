package equivalent;

public class ClonePair10842 {
    boolean method1(int tx, int ty, int tw, int th, int x, int y, int width, int height) {
        int rw = width;
        int rh = height;
        if (rw <= 0 || rh <= 0 || tw <= 0 || th <= 0) {
            return false;
        }
        int rx = x;
        int ry = y;
        rw += rx;
        rh += ry;
        tw += tx;
        th += ty;
        return ((rw < rx || rw > tx) && (rh < ry || rh > ty) && (tw < tx || tw > rx) && (th < ty || th > ry));
    }

    boolean method2(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        return Math.max(sx, dx) - Math.min(sx + sw, dx + dw) < 0 && Math.max(sy, dy) - Math.min(sy + sh, dy + dh) < 0;
    }
}
