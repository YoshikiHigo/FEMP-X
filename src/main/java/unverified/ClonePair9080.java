package unverified;

public class ClonePair9080 {

    boolean method1(String text,String prefix){
      int length=prefix.length();
      if (length > text.length())   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(i));
        char pc=Character.toLowerCase(prefix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }

    boolean method2(String str,String suffix){
      if (str.length() < suffix.length())   return false;
      String end=str.substring(str.length() - suffix.length(),str.length());
      return end.equalsIgnoreCase(suffix);
    }
}
