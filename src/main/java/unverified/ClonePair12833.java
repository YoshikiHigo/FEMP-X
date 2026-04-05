package unverified;

public class ClonePair12833 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String name){
      if (name.indexOf('/') != -1 || name.indexOf('/') != -1 || name.indexOf(':') != -1 || name.indexOf('*') != -1 || name.indexOf('?') != -1 || name.indexOf('"') != -1 || name.indexOf('<') != -1 || name.indexOf('>') != -1 || name.indexOf('|') != -1) {
        return false;
      }
     else {
        return true;
      }
    }
}
