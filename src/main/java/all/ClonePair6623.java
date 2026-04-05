package all;

public class ClonePair6623 {

    double method1(double v,int a){
      double p=1;
      for (int i=0; i < Math.abs(a); i++) {
        p*=10;
      }
      return a < 0 ? ((long)(v / p)) * p : ((long)(v * p)) / p;
    }

    double method2(double x,int precision){
      double ret;
      if (precision == 0) {
        ret=(long)x;
      }
     else {
        ret=(long)(x * Math.pow(10,precision));
        ret=ret / (Math.pow(10,precision));
      }
      return ret;
    }
}
