package all;

public class ClonePair11397 {

    String method1(String text,String repl,String with,int max){
      if (text == null) {
        return null;
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

    String method2(String text,String repl,String with,int max){
      if (text == null)   return null;
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
