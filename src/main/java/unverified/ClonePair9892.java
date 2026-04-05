package unverified;

public class ClonePair9892 {

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

    String method2(String src,String from,String to){
      if (src == null)   return null;
      if (from == null)   return src;
      if (to == null)   to="";
      StringBuffer buf=new StringBuffer();
      for (int pos; (pos=src.indexOf(from)) >= 0; ) {
        buf.append(src.substring(0,pos));
        buf.append(to);
        src=src.substring(pos + from.length());
      }
      buf.append(src);
      return buf.toString();
    }
}
