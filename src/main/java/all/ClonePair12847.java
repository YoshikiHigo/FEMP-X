package all;

public class ClonePair12847 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String str){
      if (str.indexOf('\\') > -1)   return false;
      if (str.indexOf('/') > -1)   return false;
      if (str.indexOf(':') > -1)   return false;
      if (str.indexOf('*') > -1)   return false;
      if (str.indexOf('?') > -1)   return false;
      if (str.indexOf('"') > -1)   return false;
      if (str.indexOf('<') > -1)   return false;
      if (str.indexOf('>') > -1)   return false;
      if (str.indexOf('|') > -1)   return false;
      return true;
    }
}
