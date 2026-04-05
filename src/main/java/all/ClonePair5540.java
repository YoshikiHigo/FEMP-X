package all;

public class ClonePair5540 {

    boolean method1(String s,boolean def){
      if (s == null) {
        return def;
      }
     else {
        return "yes".equals(s) || "true".equals(s) || "on".equals(s);
      }
    }

    boolean method2(String value,boolean defaultValue){
      if (value == null || value.trim().length() == 0)   return defaultValue;
      return value.equals("true") || value.equals("yes") || value.equals("on");
    }
}
