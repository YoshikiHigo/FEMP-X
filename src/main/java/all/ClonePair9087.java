package all;

public class ClonePair9087 {

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

    boolean method2(String target,String lastStr){
      int tarlength=target.length();
      int lastStrlength=lastStr.length();
      if (target.indexOf(lastStr) != -1) {
        int ind=target.lastIndexOf(lastStr);
        if (ind + 1 + lastStrlength >= tarlength) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        return false;
      }
    }
}
