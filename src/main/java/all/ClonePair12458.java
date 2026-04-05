package all;

public class ClonePair12458 {

    String method1(String s,int len){
      StringBuffer sb=new StringBuffer(len);
      sb.append(s);
      for (int i=0; i < len - s.length(); i++)   sb.append(' ');
      return sb.toString();
    }

    String method2(String s,int n){
      StringBuffer sb=new StringBuffer(n);
      sb.append(s);
      for (int i=s.length(); i < n; i++)   sb.append(' ');
      return sb.toString();
    }
}
