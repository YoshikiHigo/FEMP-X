package all;

public class ClonePair12829 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String input){
      if (input.matches("\\d.*") || (input.matches("\\W") && !input.equals("_")) || input.equals("")) {
        return true;
      }
     else {
        return false;
      }
    }
}
