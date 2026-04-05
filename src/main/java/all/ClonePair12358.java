package all;

public class ClonePair12358 {

    String method1(String string,String placeholder,String replacement){
      if (string == null) {
        return string;
      }
      int loc=string.indexOf(placeholder);
      if (loc < 0) {
        return string;
      }
     else {
        return new StringBuilder(string.substring(0,loc)).append(replacement).append(string.substring(loc + placeholder.length())).toString();
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
