package unverified;

public class ClonePair13552 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String s,String s1,String s2){
      int i=s.length();
      int j=s1.length();
      int k=0;
      String s3=s;
      String s4="";
      do {
        if (i < j)     break;
        int l=s3.indexOf(s1,k);
        if (l == -1) {
          s4=s4 + s3.substring(k,i);
          break;
        }
        s4=s4 + s3.substring(k,l);
        s4=s4 + s2;
        s3=s3.substring(l + j,i);
        i=s3.length();
      }
     while (true);
      if (i < j)   s4=s4 + s3;
      return s4;
    }
}
