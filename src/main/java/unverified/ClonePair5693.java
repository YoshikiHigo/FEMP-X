package unverified;

public class ClonePair5693 {

    boolean method1(String name,boolean emptyDefault){
      if (name == null || name.length() == 0) {
        return emptyDefault;
      }
      if (name.startsWith("__") && name.length() > 2) {
        return Character.isLowerCase(name.charAt(2));
      }
      if (name.startsWith("_") && name.length() > 1) {
        return Character.isLowerCase(name.charAt(1));
      }
      return Character.isLowerCase(name.charAt(0));
    }

    boolean method2(String v,boolean defVal){
      if ((null == v) || (v.length() <= 0))   return defVal;
      return "yes".equalsIgnoreCase(v) || "true".equalsIgnoreCase(v);
    }
}
