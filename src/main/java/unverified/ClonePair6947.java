package unverified;

public class ClonePair6947 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }

    boolean method2(String source,String identifer){
      if (source == null || "".equals(source)) {
        return false;
      }
      if (identifer == null || "".equals(identifer)) {
        return false;
      }
      return source.startsWith(identifer);
    }
}
