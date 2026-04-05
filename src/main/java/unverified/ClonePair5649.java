package unverified;

public class ClonePair5649 {

    boolean method1(String str,boolean bDefValue){
      if (str == null) {
        return bDefValue;
      }
     else {
        str=str.trim().toLowerCase();
        if (str.equals("true") || str.equals("yes") || str.equals("checked")|| str.equals("on")|| str.startsWith("1")) {
          return true;
        }
     else     if (str.equals("false") || str.equals("no") || str.equals("off")|| str.equals("0")) {
          return false;
        }
     else {
          return bDefValue;
        }
      }
    }

    boolean method2(String s,boolean defaultValue){
      if (s != null) {
        String s2=s.trim();
        if (s2.equalsIgnoreCase("true") || s2.equalsIgnoreCase("yes"))     return true;
        if (s2.equalsIgnoreCase("false") || s2.equalsIgnoreCase("no"))     return false;
      }
      return defaultValue;
    }
}
