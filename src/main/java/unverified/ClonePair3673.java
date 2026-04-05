package unverified;

public class ClonePair3673 {

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

    boolean method2(String elementClass,String selectorClass){
      if ((elementClass == null) || (selectorClass == null)) {
        return false;
      }
      elementClass=" " + elementClass + " ";
      int dotIndex=selectorClass.indexOf('.');
      while (dotIndex != -1) {
        String curWord=selectorClass.substring(0,dotIndex);
        if (elementClass.indexOf(" " + curWord + " ") == -1) {
          return false;
        }
        selectorClass=selectorClass.substring(dotIndex + 1);
        dotIndex=selectorClass.indexOf('.');
      }
      return (elementClass.indexOf(" " + selectorClass + " ") != -1);
    }
}
