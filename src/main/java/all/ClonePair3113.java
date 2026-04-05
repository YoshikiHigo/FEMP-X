package all;

public class ClonePair3113 {

    int method1(Object o1,Object o2){
      int res;
      if ((Double)o1 > (Double)o2) {
        res=1;
      }
     else   if ((Double)o1 < (Double)o2) {
        res=-1;
      }
     else {
        res=0;
      }
      return res;
    }

    int method2(Object x,Object y){
      double ix=((Double)x).doubleValue();
      double iy=((Double)y).doubleValue();
      if (ix < iy) {
        return -1;
      }
     else   if (ix > iy) {
        return 1;
      }
     else {
        return 0;
      }
    }
}
