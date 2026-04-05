package all;

public class ClonePair7814 {

    boolean method1(String a,String b){
      a=a.toLowerCase();
      b=b.toLowerCase();
      if (a.equals(b))   return true;
      if (a.length() == 0 && b.length() > 0)   return false;
      if (b.length() == 0)   return true;
      return (!(a.charAt(0) == '.') && b.charAt(0) == '.' && a.endsWith(b));
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
