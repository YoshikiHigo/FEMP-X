package all;

public class ClonePair12604 {

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
      if (w < n)   return s.substring(0,w);
      StringBuilder result=new StringBuilder(s);
      for (int i=n; i < w; i++) {
        result.append(' ');
      }
      return result.toString();
    }
}
