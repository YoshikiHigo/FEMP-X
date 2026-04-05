package unverified;

public class ClonePair7474 {

    String method1(String s,int len,char c){
      int slen=s.length();
      if (slen >= len)   return s;
     else {
        char[] pad=new char[len - slen];
        for (int i=len - slen - 1; i >= 0; i--)     pad[i]=c;
        return s + new String(pad);
      }
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
