package equivalent;

public class ClonePair8701 {
    float method1(double x1, double y1, double x2, double y2) {
        float t = 0.f;
        double dx = x2 - x1;
        double dy = y2 - y1;
        if ((dx == 0) && (dy == 0)) t = 0.f;
        else t = (float) (dy / (Math.abs(dx) + Math.abs(dy)));
        if (dx < 0) t = 2 - t;
        else if (dy < 0) t = 4 + t;
        return t * 90.f;
    }

    float method2(double x1, double y1, double x2, double y2) {
        float t = 0.f;
        double dx = x2 - x1;
        double dy = y2 - y1;
        if (dx == 0 && dy == 0) t = 0.f;
        else t = (float) (dy / (Math.abs(dx) + Math.abs(dy)));
        if (dx < 0) t = 2 - t;
        else if (dy < 0) t = 4 + t;
        return t * 90.f;
    }
}
