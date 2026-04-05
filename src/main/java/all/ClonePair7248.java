package all;

public class ClonePair7248 {

    boolean method1(String word,char[] text,int offset,int count){
      for (int i=0; i < word.length(); i++) {
        if (offset + i >= count) {
          return false;
        }
        if (!(text[offset + i] == word.charAt(i))) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String word,char[] text,int offset,int count){
      for (int i=0; i < word.length(); i++) {
        if (offset + i >= count)     return false;
        if (!(text[offset + i] == word.charAt(i)))     return false;
      }
      return true;
    }
}
