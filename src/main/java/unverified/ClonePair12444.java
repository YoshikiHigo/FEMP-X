package unverified;

public class ClonePair12444 {

    String method1(String s,int len){
      StringBuffer sb=new StringBuffer(len);
      sb.append(s);
      for (int i=0; i < len - s.length(); i++)   sb.append(' ');
      return sb.toString();
    }

    String method2(String s,int length){
      StringBuffer result=new StringBuffer(length);
      result.append(s);
      for (int i=s.length(); i < length; i++) {
        result.append(" ");
      }
      return result.toString();
    }
}
