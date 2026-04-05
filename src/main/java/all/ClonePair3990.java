package all;

public class ClonePair3990 {

    String method1(String string,char oldChar,char newChar){
      if (string == null) {
        return null;
      }
      if (oldChar == newChar) {
        return string;
      }
      final char[] sc=string.toCharArray();
      for (int i=0; i < sc.length; ++i) {
        if (sc[i] == oldChar) {
          sc[i]=newChar;
        }
      }
      return new String(sc);
    }

    String method2(String sqlString,char searchChar,char replaceChar){
      if ((sqlString == null) || (sqlString.length() == 0)) {
        return sqlString;
      }
      String returnString=new String(sqlString);
      int idx=returnString.indexOf(searchChar,0);
      while (idx != -1) {
        if (idx == 0) {
          returnString=replaceChar + returnString.substring(1);
        }
     else     if (sqlString.charAt(idx - 1) != '\\') {
          returnString=returnString.substring(0,idx) + replaceChar + returnString.substring(idx + 1);
        }
        if ((idx + 1) != returnString.length()) {
          idx=returnString.indexOf(searchChar,idx + 1);
        }
     else {
          idx=-1;
        }
      }
      return returnString;
    }
}
