package all;

public class ClonePair12846 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String identifier){
      char character;
      boolean valid=true;
      for (int i=0; i < identifier.length(); i++) {
        character=identifier.charAt(i);
        if (character >= 'A' && character <= 'Z' || (character >= '0' && character <= '9')) {
        }
     else {
          valid=false;
        }
      }
      return valid;
    }
}
