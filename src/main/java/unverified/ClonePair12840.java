package unverified;

public class ClonePair12840 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String query){
      if (query.trim().equals("") || query.trim().equals("-") || query.trim().equals("\n")|| query.trim().equals("\t")|| query.length() <= 1) {
        return true;
      }
      return false;
    }
}
