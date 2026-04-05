package unverified;

public class ClonePair5599 {

    boolean method1(String value,boolean defaultValue){
      if (value == null || value.trim().length() == 0)   return defaultValue;
      return value.equals("true") || value.equals("yes") || value.equals("on");
    }

    boolean method2(String name,boolean emptyDefault){
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
}
