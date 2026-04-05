package unverified;

public class ClonePair3725 {

    boolean method1(String name,String end){
      if (name.equalsIgnoreCase(end)) {
        return true;
      }
      int colon=name.lastIndexOf(":");
      if (colon >= 0) {
        String local=name.substring(colon + 1);
        return local.equalsIgnoreCase(end);
      }
      return false;
    }

    boolean method2(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }
}
