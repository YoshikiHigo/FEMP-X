package all;

public class ClonePair11590 {

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

    String method2(String string,String from,String to){
      if ((string == null) || (string.length() == 0)) {
        return string;
      }
     else   if ((string.length() == 1) && string.equals(from)) {
        return to;
      }
     else   if ((string.length() == 1) && !string.equals(from)) {
        return string;
      }
      int index=-1;
      while ((index=string.indexOf(from)) >= 0) {
        string=string.substring(0,index) + (char)5 + string.substring(index + from.length());
      }
      int sunIndex=-1;
      while ((sunIndex=string.indexOf((char)5)) >= 0) {
        string=string.substring(0,sunIndex) + to + string.substring(sunIndex + 1);
      }
      return string;
    }
}
