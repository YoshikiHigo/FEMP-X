package all;

public class ClonePair7494 {

    String method1(String s,int length,char c){
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

    String method2(String s,int len,char c){
      int slen=s.length();
      if (slen >= len)   return s;
     else {
        char[] pad=new char[len - slen];
        for (int i=len - slen - 1; i >= 0; i--)     pad[i]=c;
        return new String(pad) + s;
      }
    }
}
