package unverified;

public class ClonePair7959 {

    String method1(String valueToPad,String filler,int size){
      while (valueToPad.length() < size)   valueToPad=filler + valueToPad;
      return valueToPad;
    }

    String method2(String word,String pad,int length){
      if (word.length() >= length) {
        return word;
      }
     else {
        while (word.length() < length) {
          word=pad + word;
        }
        return word;
      }
    }
}
