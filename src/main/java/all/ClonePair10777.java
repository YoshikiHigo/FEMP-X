package all;

public class ClonePair10777 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
    }

    String method2(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }
}
