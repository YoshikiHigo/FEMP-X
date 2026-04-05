package unverified;

public class ClonePair7488 {

    String method1(String sStr,int num,char pad){
      int i, iLen;
      iLen=sStr.length();
      if (iLen < num) {
        for (i=1; i <= num - iLen; i++)     sStr=pad + sStr;
      }
      return sStr;
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
