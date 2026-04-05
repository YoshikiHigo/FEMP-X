package all;

public class ClonePair5607 {

    boolean method1(String value,boolean defaultValue){
      if (value == null || value.trim().length() == 0)   return defaultValue;
      return value.equals("true") || value.equals("yes") || value.equals("on");
    }

    boolean method2(String str,boolean fallback){
      if ("false".equals(str) || "off".equals(str))   return false;
      if ("true".equals(str) || "on".equals(str))   return true;
      return fallback;
    }
}
