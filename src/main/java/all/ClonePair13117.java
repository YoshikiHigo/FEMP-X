package all;

public class ClonePair13117 {

    String method1(String str,int iCount){
      if (iCount == 0 || str.length() == 0) {
        return "";
      }
      StringBuffer sb=new StringBuffer(str.length() * iCount);
      for (int i=iCount; i > 0; i--) {
        sb.append(str);
      }
      return sb.toString();
    }

    String method2(String pat,int count){
      StringBuffer buffer=new StringBuffer(pat.length() * count);
      while (count-- > 0)   buffer.append(pat);
      return buffer.toString();
    }
}
