package all;

public class ClonePair3686 {

    boolean method1(String a_str,String a_char){
      if (a_str == null) {
        return false;
      }
      return a_str.indexOf(a_char) >= 0;
    }

    boolean method2(String strToBeSearchedIn,String strToBeSearchedFor){
      boolean result=false;
      if (strToBeSearchedIn == null)   return result;
      int pos=strToBeSearchedIn.indexOf(strToBeSearchedFor);
      if (pos >= 0)   result=true;
      return result;
    }
}
