package unverified;

public class ClonePair6741 {

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

    boolean method2(String s,String end){
      if ((s == null) || (end == null))   return false;
      if (end.length() > s.length())   return false;
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end))   return true;
     else   return false;
    }
}
