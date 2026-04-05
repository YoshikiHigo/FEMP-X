package unverified;

public class ClonePair13535 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String orig,String find,String repl){
      StringBuffer buf=new StringBuffer();
      int pos=0;
      while (pos < orig.length()) {
        int foundPos=orig.indexOf(find,pos);
        if (foundPos == -1) {
          break;
        }
     else {
          buf.append(orig.substring(pos,foundPos));
          buf.append(repl);
          pos=foundPos + find.length();
        }
      }
      buf.append(orig.substring(pos));
      return buf.toString();
    }
}
