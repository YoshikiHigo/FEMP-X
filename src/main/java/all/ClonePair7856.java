package all;

public class ClonePair7856 {

    boolean method1(Object test1,Object test2,Object prec){
      boolean ret=false;
      long t1=((Number)test1).longValue();
      long t2=((Number)test2).longValue();
      long pr=((Number)prec).longValue();
      long d2=(t2 - t1) * 2;
      if (d2 < pr && d2 >= -pr) {
        ret=true;
      }
      return ret;
    }

    boolean method2(Object test1,Object test2,Object prec){
      boolean ret=false;
      double t1=((Number)test1).doubleValue();
      double t2=((Number)test2).doubleValue();
      double pr=((Number)prec).doubleValue();
      double d2=(t2 - t1) * 2;
      if (d2 < pr && d2 >= -pr) {
        ret=true;
      }
      return ret;
    }
}
