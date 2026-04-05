package all;

public class ClonePair13557 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String s,String sub,String with){
      StringBuffer sb=new StringBuffer(s.length() * 2);
      int c=0;
      int i=0;
      while ((i=s.indexOf(sub,c)) != -1) {
        sb.append(s.substring(c,i));
        sb.append(with);
        c=i + sub.length();
      }
      if (c < s.length())   sb.append(s.substring(c,s.length()));
      return sb.toString();
    }
}
