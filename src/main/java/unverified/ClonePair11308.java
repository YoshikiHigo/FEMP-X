package unverified;

public class ClonePair11308 {

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

    String method2(String value,int len){
      int icnt=len - value.length();
      if (icnt <= 0)   return value;
      StringBuilder strRet=new StringBuilder(value);
      for (int i=0; i < icnt; i++) {
        strRet.insert(0,'0');
      }
      return strRet.toString();
    }
}
