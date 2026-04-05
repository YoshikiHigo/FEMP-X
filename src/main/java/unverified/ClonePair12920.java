package unverified;

public class ClonePair12920 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String s){
      boolean b=true;
      int i=0;
      while (i < s.length() && b) {
        if (s.charAt(i) < '0' || s.charAt(i) > '9') {
          b=false;
        }
        i++;
      }
      return b;
    }
}
