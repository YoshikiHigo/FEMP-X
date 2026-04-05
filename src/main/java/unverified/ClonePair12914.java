package unverified;

public class ClonePair12914 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String s){
      for (int i=0; i < s.length(); i++) {
        if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
          return false;
        }
      }
      return true;
    }
}
