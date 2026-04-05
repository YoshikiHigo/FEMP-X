package unverified;

public class ClonePair10847 {

    int method1(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      while ((i < length) && Character.isWhitespace(rawdata.charAt(i)))   i++;
      return i;
    }
}
