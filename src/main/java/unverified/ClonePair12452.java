package unverified;

public class ClonePair12452 {

    String method1(String s,int len){
      StringBuffer sb=new StringBuffer(len);
      sb.append(s);
      for (int i=0; i < len - s.length(); i++)   sb.append(' ');
      return sb.toString();
    }

    String method2(String s,int width){
      StringBuffer result=new StringBuffer(width);
      for (; width > s.length(); width--)   result.append('0');
      result.append(s);
      return result.toString();
    }
}
