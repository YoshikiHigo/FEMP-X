package unverified;

public class ClonePair13269 {

    String method1(String str,String f_s,String t_s){
      int pos=0;
      String res="";
      while (pos < str.length()) {
        int p1=str.indexOf(f_s,pos);
        if (p1 == -1) {
          res+=str.substring(pos);
          break;
        }
        res+=str.substring(pos,p1) + t_s;
        pos=p1 + f_s.length();
      }
      return (res);
    }

    String method2(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }
}
