package all;

public class ClonePair11871 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String text,int length){
      if (text.length() > length) {
        return text.substring(0,length);
      }
      return text;
    }
}
