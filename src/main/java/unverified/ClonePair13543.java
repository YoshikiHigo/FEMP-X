package unverified;

public class ClonePair13543 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String str,String old_sub,String new_sub){
      if (str.indexOf(old_sub) != -1 && !old_sub.equals(new_sub)) {
        StringBuffer buf=new StringBuffer();
        int len=old_sub.length();
        int index, fromIndex=0;
        while ((index=str.indexOf(old_sub,fromIndex)) != -1) {
          buf.append(str.substring(fromIndex,index));
          buf.append(new_sub);
          fromIndex=index + len;
        }
        buf.append(str.substring(fromIndex));
        return buf.toString();
      }
      return str;
    }
}
