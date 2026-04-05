package unverified;

public class ClonePair11866 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String source,int index){
      int len=source.length();
      if (index > len) {
        return source;
      }
      return source.substring(len - index);
    }
}
