package unverified;

public class ClonePair11601 {

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

    String method2(String str,String from,String to){
      if (str == null || str.length() == 0) {
        return str;
      }
     else   if (str.length() == 1 && str.equals(from)) {
        return to;
      }
     else   if (str.length() == 1 && !str.equals(from)) {
        return str;
      }
      int j=-1;
      while ((j=str.indexOf(from)) >= 0) {
        str=str.substring(0,j) + (char)5 + str.substring(j + from.length());
      }
      int i=-1;
      while ((i=str.indexOf((char)5)) >= 0) {
        str=str.substring(0,i) + to + str.substring(i + 1);
      }
      return str;
    }
}
