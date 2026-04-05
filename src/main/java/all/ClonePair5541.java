package all;

public class ClonePair5541 {

    boolean method1(String s,boolean def){
      if (s == null) {
        return def;
      }
     else {
        return "yes".equals(s) || "true".equals(s) || "on".equals(s);
      }
    }

    boolean method2(String str,boolean fallback){
      if ("false".equals(str) || "off".equals(str))   return false;
      if ("true".equals(str) || "on".equals(str))   return true;
      return fallback;
    }
}
