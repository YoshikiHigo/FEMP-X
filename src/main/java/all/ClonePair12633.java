package all;

public class ClonePair12633 {

    String method1(String text,int width){
      if (text.length() == width) {
        return text;
      }
     else   if (text.length() > width) {
        return text.substring(0,width);
      }
     else {
        StringBuffer padded=new StringBuffer(text);
        while (padded.length() < width) {
          padded.append(' ');
        }
        return padded.toString();
      }
    }

    String method2(String s,int n){
      int l=s.length();
      if (l == n)   return s;
     else   if (l > n)   return s.substring(0,n);
     else {
        char[] carr=new char[n];
        s.getChars(0,l,carr,0);
        while (l < n)     carr[l++]=' ';
        return new String(carr);
      }
    }
}
