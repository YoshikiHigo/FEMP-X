package unverified;

public class ClonePair3987 {

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

    boolean method2(String a,String b){
      if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
      if (a == null)   return false;
      return a.equals(b);
    }
}
