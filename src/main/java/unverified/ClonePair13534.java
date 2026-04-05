package unverified;

public class ClonePair13534 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1)   return s;
      StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(s.substring(c,i));
          buf.append(with);
          c=i + sub.length();
        }
     while ((i=s.indexOf(sub,c)) != -1);
        if (c < s.length()) {
          buf.append(s.substring(c,s.length()));
        }
        return buf.toString();
      }
    }
}
