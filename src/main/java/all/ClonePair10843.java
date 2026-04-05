package all;

public class ClonePair10843 {

    boolean method1(int w1,int h1,int x1,int y1,int w2,int h2,int x2,int y2){
      if (x1 + w1 <= x2)   return false;
      if (y1 + h1 <= h2)   return false;
      if (x1 >= x2 + w2)   return false;
      if (y1 >= y2 + h2)   return false;
      return true;
    }

    boolean method2(int sx,int sy,int sw,int sh,int dx,int dy,int dw,int dh){
      if (Math.max(sx,dx) - Math.min(sx + sw,dx + dw) < 0 && Math.max(sy,dy) - Math.min(sy + sh,dy + dh) < 0) {
        return true;
      }
      return false;
    }
}
