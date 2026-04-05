package all;

public class ClonePair7957 {

    String method1(String str,String pad,int length){
      if (str.length() >= length) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      for (int i=str.length(); i < length; i+=pad.length()) {
        buf.append(pad);
      }
      return buf.toString();
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
