package unverified;

public class ClonePair7961 {

    String method1(String original,String s,int minLen){
      if (original.length() >= minLen) {
        return original;
      }
      final StringBuffer result=new StringBuffer(original);
      while (result.length() < minLen) {
        result.insert(0,s);
      }
      return result.toString();
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
