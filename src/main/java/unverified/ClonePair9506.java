package unverified;

public class ClonePair9506 {

    int method1(String rawdata,int i){
      int length=rawdata.length();
      if (i < length) {
        char c=rawdata.charAt(i);
        while ((i < length) && Character.isWhitespace(c)) {
          ++i;
          c=rawdata.charAt(i);
        }
      }
      return i;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      while ((i < length) && Character.isWhitespace(rawdata.charAt(i)))   i++;
      return i;
    }
}
