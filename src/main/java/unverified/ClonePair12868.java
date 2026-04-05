package unverified;

public class ClonePair12868 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String pString){
      if (pString.length() == 0 || pString.equals(".") || pString.equalsIgnoreCase("y") || pString.equalsIgnoreCase("yes") || pString.equalsIgnoreCase("true")) {
        return true;
      }
      return false;
    }
}
