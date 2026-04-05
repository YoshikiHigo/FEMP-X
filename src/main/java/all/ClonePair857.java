package all;

public class ClonePair857 {

    double[] method1(double[] img,int rad){
      int h=img.length;
      double result[]=new double[h];
      for (int i=0; i < h; i++) {
        int by=i - rad, ey=i + rad;
        if (by < 0) {
          by=0;
        }
        if (ey >= h) {
          ey=h - 1;
        }
        double tmp=0;
        int k=0;
        for (int y=by; y <= ey; y++, k++) {
          tmp+=img[y];
        }
        result[i]=tmp / k;
      }
      return result;
    }

    double[] method2(double[] ar,int len){
      double[] ret=new double[ar.length];
      for (int i=0; i < ar.length; i++) {
        int half=(len - 1) / 2;
        int count=0;
        double sum=0;
        for (int j=-half; j <= half; j++) {
          if (i + j >= 0 && i + j < ar.length) {
            count++;
            sum+=ar[i + j];
          }
        }
        ret[i]=sum / count;
      }
      return ret;
    }
}
