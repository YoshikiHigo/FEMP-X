package all;

public class ClonePair3179 {

    String method1(String str,String prefix,boolean ignoreCase){
      if (str == null)   return null;
      if (prefix == null)   return str;
      if (ignoreCase) {
        if (str.toLowerCase().startsWith(prefix.toLowerCase())) {
          return str.substring(prefix.length());
        }
      }
     else {
        if (str.startsWith(prefix)) {
          return str.substring(prefix.length());
        }
      }
      return str;
    }

    String method2(String s,String a_end,boolean a_ignoreCase){
      if (s == null) {
        return null;
      }
      String retour=s;
      if (a_end == null) {
        return s;
      }
      boolean l_flagEnd;
      if (a_ignoreCase) {
        l_flagEnd=retour.toLowerCase().endsWith(a_end.toLowerCase());
      }
     else {
        l_flagEnd=retour.endsWith(a_end);
      }
      if (l_flagEnd) {
        int l_index=s.length() - a_end.length();
        retour=retour.substring(0,l_index);
      }
      return retour;
    }
}
