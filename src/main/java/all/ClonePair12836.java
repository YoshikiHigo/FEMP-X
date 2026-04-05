package all;

public class ClonePair12836 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String string){
      int limit=string.length() / 2;
      if (limit == 0) {
        return true;
      }
      for (int forward=0, backward=string.length() - 1; forward < limit; forward++, backward--) {
        if (string.charAt(forward) != string.charAt(backward)) {
          return false;
        }
      }
      return true;
    }
}
