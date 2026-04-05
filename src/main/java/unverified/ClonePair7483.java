package unverified;

public class ClonePair7483 {

    String method1(String s,int length,char c){
      int needed=length - s.length();
      if (needed <= 0) {
        return s;
      }
      StringBuffer sb=new StringBuffer(length);
      for (int i=0; i < needed; i++) {
        sb.append(c);
      }
      sb.append(s);
      return (sb.toString());
    }

    String method2(String s,int length,char c){
      int needed=length - s.length();
      if (needed <= 0) {
        return s;
      }
      char[] padding=new char[needed];
      java.util.Arrays.fill(padding,c);
      StringBuffer sb=new StringBuffer(length);
      sb.append(padding);
      sb.append(s);
      return sb.toString();
    }
}
