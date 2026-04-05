package unverified;

public class ClonePair11598 {

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

    String method2(String str,String oldStr,String newStr){
      if (str == null || str.length() == 0) {
        return str;
      }
      StringBuffer buffer=new StringBuffer();
      int pos=0;
      int oldPos=0;
      while ((pos=str.indexOf(oldStr,oldPos)) != -1) {
        buffer.append(str.substring(oldPos,pos));
        buffer.append(newStr);
        oldPos=pos + oldStr.length();
      }
      buffer.append(str.substring(oldPos,str.length()));
      return buffer.toString();
    }
}
