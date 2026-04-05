package all;

public class ClonePair13516 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String text,String a,String b){
      int length=text.length();
      int lenA=a.length();
      int lenB=b.length();
      int gofrom=0;
      boolean goon=true;
      while (goon) {
        int next=text.indexOf(a,gofrom);
        if (next != -1) {
          if (next + lenA > length) {
            text=text.substring(0,next) + b;
          }
     else {
            text=text.substring(0,next) + b + text.substring(next + lenA);
          }
          gofrom=next + lenB;
        }
     else {
          goon=false;
        }
        length=text.length();
        if (gofrom > length)     goon=false;
      }
      return text;
    }
}
