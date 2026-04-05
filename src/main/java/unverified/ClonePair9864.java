package unverified;

public class ClonePair9864 {

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

    String method2(String source,String pattern,String replace){
      if (source == null || source.length() == 0 || pattern == null || pattern.length() == 0) {
        return source;
      }
      int k=source.indexOf(pattern);
      if (k == -1) {
        return source;
      }
      StringBuffer out=new StringBuffer();
      int i=0, l=pattern.length();
      while (k != -1) {
        out.append(source.substring(i,k));
        if (replace != null) {
          out.append(replace);
        }
        i=k + l;
        k=source.indexOf(pattern,i);
      }
      out.append(source.substring(i));
      return out.toString();
    }
}
