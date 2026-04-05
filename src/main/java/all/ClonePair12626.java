package all;

public class ClonePair12626 {

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
      StringBuilder result=new StringBuilder();
      for (int i=n; i < w; i++) {
        result.append(' ');
      }
      result.append(s);
      return result.toString();
    }
}
