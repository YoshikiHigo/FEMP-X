package all;

public class ClonePair7952 {

    String method1(String valueToPad,String filler,int size){
      while (valueToPad.length() < size) {
        valueToPad=filler + valueToPad;
      }
      return valueToPad;
    }

    String method2(String original,String s,int minLen){
      if (original.length() >= minLen) {
        return original;
      }
      final StringBuffer result=new StringBuffer(original);
      while (result.length() < minLen) {
        result.insert(0,s);
      }
      return result.toString();
    }
}
