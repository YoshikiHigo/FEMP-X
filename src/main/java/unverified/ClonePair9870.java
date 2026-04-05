package unverified;

public class ClonePair9870 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String source,String match,String newData){
      if (source == null)   return null;
      if (match == null)   return source;
      if (newData == null)   newData="";
      while (source.indexOf(match) >= 0) {
        int begin=source.indexOf(match);
        int end=match.length() + begin;
        if (begin >= 0 && end >= 0) {
          source=source.substring(0,begin) + newData + source.substring(end);
        }
      }
      return source;
    }
}
