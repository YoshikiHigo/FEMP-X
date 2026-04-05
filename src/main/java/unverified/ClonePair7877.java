package unverified;

public class ClonePair7877 {

    boolean method1(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }

    boolean method2(String text,String suffix){
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
}
