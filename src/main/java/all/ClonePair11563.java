package all;

public class ClonePair11563 {

    String method1(String source,String target,String replacement){
      if (source == null) {
        return source;
      }
      String retvalue=source;
      int index=0;
      int previousIndex=0;
      if (source.indexOf(target) > -1) {
        StringBuffer hold=new StringBuffer();
        while (true) {
          index=source.indexOf(target,previousIndex);
          if (index < 0) {
            hold.append(source.substring(previousIndex));
            break;
          }
          hold.append(source.substring(previousIndex,index));
          hold.append(replacement);
          previousIndex=index + target.length();
        }
        retvalue=hold.toString();
      }
      return retvalue;
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
