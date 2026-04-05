package all;

public class ClonePair12855 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String textString){
      final char[] chars=textString.toCharArray();
      for (int x=0; x < chars.length; x++) {
        final char c=chars[x];
        if ((c >= 'a') && (c <= 'z'))     continue;
        if ((c >= 'A') && (c <= 'Z'))     continue;
        if ((c >= '0') && (c <= '9'))     continue;
        if (c == '_')     continue;
        return false;
      }
      return true;
    }
}
