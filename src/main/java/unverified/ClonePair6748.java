package unverified;

public class ClonePair6748 {

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

    boolean method2(String str,String prefix){
      if (str == null || prefix == null)   return false;
      if (str.startsWith(prefix))   return true;
      if (str.length() < prefix.length())   return false;
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
