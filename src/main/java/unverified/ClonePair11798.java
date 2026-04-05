package unverified;

public class ClonePair11798 {

    String method1(String src,int length){
      if (src.length() <= length) {
        return src;
      }
     else {
        String tmp=src.substring(0,length);
        tmp=tmp + "...";
        return tmp;
      }
    }

    String method2(String input,int maxChars){
      if (input.length() <= maxChars) {
        return input;
      }
     else {
        return input.substring(0,maxChars) + "...";
      }
    }
}
