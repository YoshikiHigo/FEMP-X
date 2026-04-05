package all;

public class ClonePair7831 {

    double method1(short[] mask,int w,int h){
      int count=0;
      int area=0;
      for (int x=0; x < w; x++) {
        for (int y=0; y < h; y++) {
          int index=x + y * w;
          if (mask[index] != 0) {
            area++;
            if (x < w - 1 && mask[index + 1] == 0) {
              count++;
            }
     else         if (x > 1 && mask[index - 1] == 0) {
              count++;
            }
     else         if (y < h - 1 && mask[index + w] == 0) {
              count++;
            }
     else         if (y > 0 && mask[index - w] == 0) {
              count++;
            }
          }
        }
      }
      if (area <= 0) {
        System.err.println("zero area: " + count + " "+ area);
        return 0;
      }
      double ret=(count * count) / (4 * Math.PI * area);
      return ret;
    }

    double method2(short[] mask,int w,int h){
      int count=0;
      int area=0;
      for (int x=0; x < w; x++) {
        for (int y=0; y < h; y++) {
          int index=x + y * w;
          if (mask[index] != 0) {
            area++;
            if (x < w - 1 && mask[index + 1] == 0) {
              count++;
            }
     else         if (x > 1 && mask[index - 1] == 0) {
              count++;
            }
     else         if (y < h - 1 && mask[index + w] == 0) {
              count++;
            }
     else         if (y > 0 && mask[index - w] == 0) {
              count++;
            }
          }
        }
      }
      if (area <= 0) {
        System.err.println("zero area: " + count + " "+ area);
        return 0;
      }
      return (count * count) / (4 * Math.PI * area);
    }
}
