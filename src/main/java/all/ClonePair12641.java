package all;

public class ClonePair12641 {

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

    String method2(String s,int w){
      int n=s.length();
      if (w < n)   return s.substring(n - w);
      StringBuffer b=new StringBuffer(w);
      for (int i=n; i < w; ++i) {
        b.append(' ');
      }
      b.append(s);
      return b.toString();
    }
}
