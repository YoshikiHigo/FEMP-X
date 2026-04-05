package unverified;

public class ClonePair10849 {

    int method1(String src,int from){
      for (final int len=src.length(); from < len && Character.isWhitespace(src.charAt(from)); ++from)   ;
      return from;
    }

    int method2(String template,int i){
      while (i < template.length() && Character.isWhitespace(template.charAt(i))) {
        i++;
      }
      return i;
    }
}
