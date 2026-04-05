package unverified;

public class ClonePair12389 {

    String method1(String string,String toBeReplaced,String replacement){
      if (string == null || toBeReplaced == null || replacement == null)   return string;
      String tail=string;
      StringBuffer result=new StringBuffer(string.length() + replacement.length());
      int length=toBeReplaced.length();
      int begin;
      while (!tail.equals("")) {
        begin=tail.indexOf(toBeReplaced);
        if (begin == -1) {
          result.append(tail);
          return result.toString();
        }
        result.append(tail.substring(0,begin)).append(replacement);
        tail=tail.substring(begin + length);
      }
      return result.toString();
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
