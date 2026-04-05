package all;

public class ClonePair5604 {

    boolean method1(String value,boolean defaultValue){
      if (value == null || value.trim().length() == 0)   return defaultValue;
      return value.equals("true") || value.equals("yes") || value.equals("on");
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
