package unverified;

public class ClonePair6736 {

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

    boolean method2(String target1,String target2){
      if (target1 == null || target2 == null) {
        return false;
      }
      final int length1=target1.length();
      final int length2=target2.length();
      if (length1 < length2) {
        return false;
      }
      final String s1=target1.substring(length1 - length2);
      return s1.equalsIgnoreCase(target2);
    }
}
