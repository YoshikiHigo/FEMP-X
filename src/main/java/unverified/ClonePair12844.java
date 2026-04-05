package unverified;

public class ClonePair12844 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String s){
      boolean isOK=true;
      for (int i=0; i < s.length(); i++) {
        char c=(char)s.charAt(i);
        if (c < 48 || c > 57) {
          isOK=false;
          break;
        }
      }
      return isOK;
    }
}
