package all;

public class ClonePair3573 {

    Double method1(Object o){
      Double result=null;
      if (o instanceof Double) {
        result=(Double)o;
      }
     else   if (o instanceof String) {
        result=Double.valueOf((String)o);
      }
      return result;
    }

    Double method2(Object obj){
      if (obj != null) {
        if (obj instanceof Double) {
          return (Double)obj;
        }
        if (obj instanceof String) {
          return Double.valueOf((String)obj);
        }
      }
      return null;
    }
}
