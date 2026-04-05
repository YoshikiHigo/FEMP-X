package all;

public class ClonePair9261 {

    boolean method1(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }

    boolean method2(String name,String ext){
      if (name.length() < ext.length())   return false;
      String actual=name.substring(name.length() - ext.length());
      return actual.equals(ext) || actual.equals(ext.toUpperCase());
    }
}
