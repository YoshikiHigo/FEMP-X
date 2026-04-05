package all;

public class ClonePair12842 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String split){
      if (split.length() <= 1 || split.equals("the") || split.equals("der") || split.equals("die") || split.equals("and") || split.equals("das") || split.equals("feat") || split.equals("ft") || split.equals("vs")) {
        return true;
      }
      return false;
    }
}
