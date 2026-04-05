package unverified;

public class ClonePair12861 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String checkStr){
      boolean checkedStatus=false;
      boolean isError=false;
      String spStr=" _-";
      int checkStrLength=checkStr.length() - 1;
      for (int i=0; i <= checkStrLength; i++) {
        char ch=checkStr.charAt(i);
        if (ch < '\176') {
          ch=Character.toUpperCase(ch);
          if (((ch < 'A') || (ch > 'Z')) && ((ch < '0') || (ch > '9')) && (spStr.indexOf(ch) < 0)) {
            isError=true;
          }
        }
      }
      checkedStatus=!isError;
      return checkedStatus;
    }
}
