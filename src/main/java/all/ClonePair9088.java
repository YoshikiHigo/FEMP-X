package all;

public class ClonePair9088 {

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

    boolean method2(String name,String ext){
      if (name.length() < ext.length())   return false;
      String actual=name.substring(name.length() - ext.length());
      return actual.equals(ext) || actual.equals(ext.toUpperCase());
    }
}
