package all;

public class ClonePair4237 {

    boolean method1(Object value,Object[] range){
      boolean ret=false;
      double v=((Number)value).doubleValue();
      double s=((Number)range[0]).doubleValue();
      double e=((Number)range[1]).doubleValue();
      if (v >= s && v <= e) {
        ret=true;
      }
      return ret;
    }

    boolean method2(Object value,Object[] range){
      boolean ret=false;
      long v=((Number)value).longValue();
      long s=((Number)range[0]).longValue();
      long e=((Number)range[1]).longValue();
      if (v >= s && v <= e) {
        ret=true;
      }
      return ret;
    }
}
