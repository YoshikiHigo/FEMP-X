package unverified;

public class ClonePair3981 {

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

    boolean method2(String s1,String s2){
      if (s1 == null)   return s2 == null || s2.equals("");
      if (s2 == null)   return s1.equals("");
      return s1.equals(s2);
    }
}
