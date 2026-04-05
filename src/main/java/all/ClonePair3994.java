package all;

public class ClonePair3994 {

    boolean method1(String uri1,String uri2){
      if (uri1 == uri2) {
        return true;
      }
      if (uri1 == null) {
        return (uri2.length() == 0);
      }
      if (uri2 == null) {
        return (uri1.length() == 0);
      }
      return uri1.equals(uri2);
    }

    boolean method2(String x,String y){
      if (x == y)   return true;
      if (x == null && y != null) {
        if (y.length() == 0)     return true;
        return false;
      }
      if (x != null && y == null) {
        if (x.length() == 0)     return true;
        return false;
      }
      return x.equals(y);
    }
}
