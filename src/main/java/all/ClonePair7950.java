package all;

public class ClonePair7950 {

    String method1(String valueToPad,String filler,int size){
      while (valueToPad.length() < size) {
        valueToPad=filler + valueToPad;
      }
      return valueToPad;
    }

    String method2(String str,String pad,int length){
      if (str.length() >= length) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      for (int i=str.length(); i < length; i+=pad.length()) {
        buf.append(pad);
      }
      return buf.toString();
    }
}
