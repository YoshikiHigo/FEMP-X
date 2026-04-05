package all;

public class ClonePair11329 {

    String method1(String s,int places){
      int j=places - s.length();
      if (j > 0) {
        StringBuffer sb=null;
        sb=new StringBuffer(j);
        for (int k=0; k < j; k++) {
          sb.append(' ');
        }
        return sb.toString() + s;
      }
     else {
        return s;
      }
    }

    String method2(String s,int w){
      if (s.length() < w) {
        int d=w - s.length();
        StringBuilder b=new StringBuilder();
        for (int i=0; i < d; ++i)     b.append(' ');
        return s + b.toString();
      }
     else {
        return s;
      }
    }
}
