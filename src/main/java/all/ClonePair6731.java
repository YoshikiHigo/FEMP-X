package all;

public class ClonePair6731 {

    boolean method1(String elementClass,String selectorClass){
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

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null) {
        return false;
      }
     else {
        return ((s1.length() == s2.length()) && s1.regionMatches(true,0,s2,0,s1.length()));
      }
    }
}
