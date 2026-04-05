package unverified;

public class ClonePair8628 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
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
