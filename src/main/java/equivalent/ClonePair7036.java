package equivalent;

public class ClonePair7036 {
    boolean method1(int ex, int ey, int w, int h, int px, int py) {
        return (ex <= px) && (px <= ex + w) && (ey <= py) && (py <= ey + h);
    }

    boolean method2(int areaX, int areaY, int width, int height, int targX, int targY) {
        boolean result = false;
        if (targX >= areaX && targY >= areaY) {
            if (targX <= areaX + width && targY <= areaY + height) {
                result = true;
            }
        }
        return result;
    }
}
