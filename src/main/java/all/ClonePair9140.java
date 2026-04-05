package all;

public class ClonePair9140 {

    boolean method1(String str,String suffix){
      if (str.length() < suffix.length())   return false;
      String end=str.substring(str.length() - suffix.length(),str.length());
      return end.equalsIgnoreCase(suffix);
    }

    boolean method2(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }
}
