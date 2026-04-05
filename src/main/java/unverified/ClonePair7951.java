package unverified;

public class ClonePair7951 {

    String method1(String valueToPad,String filler,int size){
      while (valueToPad.length() < size) {
        valueToPad=filler + valueToPad;
      }
      return valueToPad;
    }

    String method2(String valueToPad,String filler,int size){
      while (valueToPad.length() < size)   valueToPad=filler + valueToPad;
      return valueToPad;
    }
}
