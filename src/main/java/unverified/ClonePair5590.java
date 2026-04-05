package unverified;

public class ClonePair5590 {

    boolean method1(String b,boolean defval){
      if (b == null)   return defval;
      String upperB=b.toUpperCase();
      if ("1".equals(b))   return (true);
      if ("0".equals(b))   return (false);
      if ("TRUE".equals(upperB))   return (true);
      if ("FALSE".equals(upperB))   return (false);
      return defval;
    }

    boolean method2(String parameter,boolean defaultValue){
      if (parameter == null) {
        return defaultValue;
      }
     else   if (parameter.equalsIgnoreCase("true") || parameter.equalsIgnoreCase("t") || parameter.equalsIgnoreCase("1")) {
        return true;
      }
     else   if (parameter.equalsIgnoreCase("false") || parameter.equalsIgnoreCase("f") || parameter.equalsIgnoreCase("0")) {
        return false;
      }
     else {
        return defaultValue;
      }
    }
}
