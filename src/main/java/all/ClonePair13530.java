package all;

public class ClonePair13530 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
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
