package all;

public class ClonePair12149 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
    }

    String method2(String string,String stringToReplace,String newString){
      if (stringToReplace.equals(newString))   return string;
      int length=stringToReplace.length();
      int oldPos=0;
      while (true) {
        int pos=string.indexOf(stringToReplace,oldPos);
        if (pos < 0)     return string;
        string=string.substring(0,pos) + newString + string.substring(pos + length);
        oldPos=pos + 1;
        if (oldPos >= string.length())     return string;
      }
    }
}
