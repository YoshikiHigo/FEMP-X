package all;

public class ClonePair11848 {

    String method1(String resource,String oldstr,String newstr){
      StringBuffer sbuf=new StringBuffer();
      try {
        if ((oldstr == null)) {
          return "";
        }
        if ((resource == null)) {
          return "";
        }
        if ((newstr == null)) {
          return "";
        }
        if (resource.indexOf(oldstr) == -1) {
          return resource;
        }
        int start=0;
        int end=0;
        String rest="";
        end=resource.indexOf(oldstr);
        String left="";
        while (end != -1) {
          left=resource.substring(start,end);
          sbuf.append(left);
          sbuf.append(newstr);
          rest=resource.substring(end + oldstr.length());
          resource=rest;
          end=resource.indexOf(oldstr);
        }
        sbuf.append(rest);
      }
     catch (  Exception e) {
        e.printStackTrace();
        return "";
      }
      return sbuf.toString();
    }

    String method2(String s,String sub,String with){
      if (s != null && sub != null && with != null) {
        int c=0;
        int i=s.indexOf(sub,c);
        if (i == -1)     return s;
        StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
          do {
            buf.append(s.substring(c,i));
            buf.append(with);
            c=i + sub.length();
          }
     while ((i=s.indexOf(sub,c)) != -1);
          if (c < s.length())       buf.append(s.substring(c,s.length()));
          return buf.toString();
        }
      }
     else {
        return "";
      }
    }
}
