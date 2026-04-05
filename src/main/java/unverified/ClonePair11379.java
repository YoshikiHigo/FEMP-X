package unverified;

public class ClonePair11379 {

    String method1(String text,String searchString,String replacement,int max){
      if (text == null || text.length() == 0 || searchString == null || searchString.length() == 0 || replacement == null || max == 0) {
        return text;
      }
      int start=0;
      int end=text.indexOf(searchString,start);
      if (end == -1) {
        return text;
      }
      int replLength=searchString.length();
      int increase=replacement.length() - replLength;
      increase=increase < 0 ? 0 : increase;
      increase*=max < 0 ? 16 : (max > 64 ? 64 : max);
      StringBuffer buffer=new StringBuffer(text.length() + increase);
      while (end != -1) {
        buffer.append(text.substring(start,end)).append(replacement);
        start=end + replLength;
        if (--max == 0) {
          break;
        }
        end=text.indexOf(searchString,start);
      }
      buffer.append(text.substring(start));
      return buffer.toString();
    }

    String method2(String text,String repl,String with,int max){
      if (text == null || repl == null || with == null || repl.length() == 0 || max == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int start=0, end=0;
      while ((end=text.indexOf(repl,start)) != -1) {
        buf.append(text.substring(start,end)).append(with);
        start=end + repl.length();
        if (--max == 0) {
          break;
        }
      }
      buf.append(text.substring(start));
      return buf.toString();
    }
}
