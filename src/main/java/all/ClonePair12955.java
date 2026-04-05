package all;

public class ClonePair12955 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
    }

    String method2(String destination,String what,String with){
      if (destination.indexOf(what) >= 0) {
        StringBuffer buf=new StringBuffer();
        int last=0;
        int current=destination.indexOf(what);
        int whatLength=what.length();
        while (current >= 0) {
          if (current > 0) {
            buf.append(destination.substring(last,current));
          }
          buf.append(with);
          last=current + whatLength;
          current=destination.indexOf(what,last);
        }
        if (destination.length() > last) {
          buf.append(destination.substring(last));
        }
        return buf.toString();
      }
      return destination;
    }
}
