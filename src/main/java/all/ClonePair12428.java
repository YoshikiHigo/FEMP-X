package all;

public class ClonePair12428 {

    String method1(String s,int len){
      StringBuffer sb=new StringBuffer(len);
      sb.append(s);
      for (int i=0; i < len - s.length(); i++)   sb.append(' ');
      return sb.toString();
    }

    String method2(String topad,int size){
      StringBuilder result=new StringBuilder(size);
      for (int i=topad.length(); i < size; i++) {
        result.append(' ');
      }
      result.append(topad);
      return result.toString();
    }
}
