package unverified;

public class ClonePair12110 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
      return sb.toString();
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
