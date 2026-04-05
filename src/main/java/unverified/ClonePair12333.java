package unverified;

public class ClonePair12333 {

    String method1(String str,String innerString,String with){
      int c=0;
      int i=str.indexOf(innerString,c);
      if (i == -1) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(str.substring(c,i));
          buf.append(with);
          c=i + innerString.length();
        }
     while ((i=str.indexOf(innerString,c)) != -1);
        if (c < str.length()) {
          buf.append(str.substring(c,str.length()));
        }
        return buf.toString();
      }
    }

    String method2(String s,String before,String after){
      StringBuilder buff=new StringBuilder(s.length());
      int index=0;
      while (true) {
        int next=s.indexOf(before,index);
        if (next < 0) {
          buff.append(s.substring(index));
          break;
        }
        buff.append(s.substring(index,next)).append(after);
        index=next + before.length();
      }
      return buff.toString();
    }
}
