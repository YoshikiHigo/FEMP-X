package all;

public class ClonePair11592 {

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

    String method2(String input,String forReplace,String replaceWith){
      if (input == null)   return null;
      StringBuffer result=new StringBuffer();
      boolean hasMore=true;
      while (hasMore) {
        int start=input.indexOf(forReplace);
        int end=start + forReplace.length();
        if (start != -1) {
          result.append(input.substring(0,start) + replaceWith);
          input=input.substring(end);
        }
     else {
          hasMore=false;
          result.append(input);
        }
      }
      if (result.toString().equals(""))   return input;
     else   return result.toString();
    }
}
