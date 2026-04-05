package unverified;

public class ClonePair12033 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
    }

    String method2(String text,String repl,String with){
      if (text == null || repl == null || with == null || repl.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int start=0;
      int end=0;
      do {
        end=text.indexOf(repl,start);
        if (end == -1) {
          break;
        }
        buf.append(text.substring(start,end)).append(with);
        start=end + repl.length();
      }
     while (true);
      buf.append(text.substring(start));
      return buf.toString();
    }
}
