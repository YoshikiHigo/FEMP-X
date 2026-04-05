package unverified;

public class ClonePair7482 {

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

    String method2(String sStr,int num,char pad){
      int i, iLen;
      iLen=sStr.length();
      if (iLen < num) {
        for (i=1; i <= num - iLen; i++)     sStr=pad + sStr;
      }
      return sStr;
    }
}
