package unverified;

public class ClonePair12094 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuffer sb=new StringBuffer(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
      return sb.toString();
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
