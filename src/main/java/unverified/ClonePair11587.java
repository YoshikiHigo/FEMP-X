package unverified;

public class ClonePair11587 {

    String method1(String input,String oldString,String newString){
      if (input == null || input.length() == 0 || input.indexOf(oldString,0) < 0) {
        return input;
      }
     else {
        int i=0;
        int j=0;
        int oldLength=oldString.length();
        StringBuffer buffer=new StringBuffer();
        while ((i=input.indexOf(oldString,i)) >= 0) {
          buffer.append(input.substring(j,i)).append(newString);
          j=(i+=oldLength);
        }
        input=buffer.append(input.substring(j)).toString();
        buffer=null;
        return input;
      }
    }

    String method2(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
      return sb.toString();
    }
}
