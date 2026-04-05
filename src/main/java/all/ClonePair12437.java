package all;

public class ClonePair12437 {

    String method1(String s,int len){
      StringBuffer sb=new StringBuffer(len);
      sb.append(s);
      for (int i=0; i < len - s.length(); i++)   sb.append(' ');
      return sb.toString();
    }

    String method2(String s,int length){
      StringBuffer b=new StringBuffer(length);
      b.append(s);
      for (int i=0; i < length - s.length(); i++)   b.append(" ");
      return b.toString();
    }
}
