package unverified;

public class ClonePair7484 {

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
