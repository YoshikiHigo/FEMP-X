package all;

public class ClonePair11264 {

    String method1(String s,int width){
      int len=s.length();
      if (len > width) {
        return s.substring(0,width);
      }
     else {
        int diff=width - len;
        while (diff > 0) {
          s=" " + s;
          diff--;
        }
        return s;
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
