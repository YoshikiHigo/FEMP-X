package unverified;

public class ClonePair8936 {

    boolean method1(String text,String suffix){
      int length=suffix.length();
      int offset=text.length() - length;
      if (offset < 0)   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(offset + i));
        char pc=Character.toLowerCase(suffix.charAt(i));
        if (tc != pc)     return false;
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
