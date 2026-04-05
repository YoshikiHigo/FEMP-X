package all;

public class ClonePair12850 {

    String method1(String input,String from,String to){
      assert from.length() == to.length();
      StringBuilder sb=null;
      int len=input.length();
      for (int i=0; i < len; i++) {
        int ind=from.indexOf(input.charAt(i));
        if (ind >= 0) {
          if (sb == null) {
            sb=new StringBuilder(input);
          }
          sb.setCharAt(i,to.charAt(ind));
        }
      }
      if (sb == null) {
        return input;
      }
     else {
        return sb.toString();
      }
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
