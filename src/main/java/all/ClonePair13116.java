package all;

public class ClonePair13116 {

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

    String method2(String v,int count){
      StringBuffer sb=new StringBuffer(v.length() * count);
      while (count > 0) {
        sb.append(v);
        count--;
      }
      return sb.toString();
    }
}
