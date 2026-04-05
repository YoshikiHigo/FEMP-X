package unverified;

public class ClonePair12912 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String name){
      if (name.indexOf('/') >= 0)   return false;
      if (name.indexOf('\\') >= 0)   return false;
      if (name.indexOf(':') >= 0)   return false;
      if (name.indexOf('*') >= 0)   return false;
      if (name.indexOf('?') >= 0)   return false;
      if (name.indexOf('"') >= 0)   return false;
      if (name.indexOf('<') >= 0)   return false;
      if (name.indexOf('>') >= 0)   return false;
      if (name.indexOf('|') >= 0)   return false;
      return true;
    }
}
