package all;

public class ClonePair3679 {

    boolean method1(String source,String target){
      if (source == null || target == null) {
        return false;
      }
      if (source.length() != target.length()) {
        return false;
      }
      char[] sc=source.toCharArray();
      char[] tc=target.toCharArray();
      for (int i=0; i < sc.length; i++) {
        if (sc[i] != tc[i]) {
          return false;
        }
      }
      return true;
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
