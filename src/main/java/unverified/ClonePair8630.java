package unverified;

public class ClonePair8630 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String name,String ext){
      if (name.length() < ext.length())   return false;
      String actual=name.substring(name.length() - ext.length());
      return actual.equals(ext) || actual.equals(ext.toUpperCase());
    }
}
