package unverified;

public class ClonePair13465 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String container,String tag,String replacement){
      final String BLANK="";
      StringBuffer buffer=new StringBuffer("");
      int start=0;
      int end=0;
      if (container == null || container.trim().length() == 0) {
        return container;
      }
      if (replacement == null) {
        replacement=BLANK;
      }
      end=container.indexOf(tag);
      while (end != -1) {
        buffer.append(container.substring(start,end));
        buffer.append(replacement);
        start=end + tag.length();
        end=container.indexOf(tag,start);
      }
      buffer.append(container.substring(start));
      return buffer.toString();
    }
}
