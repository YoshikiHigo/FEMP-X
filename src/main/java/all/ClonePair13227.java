package all;

public class ClonePair13227 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
    }

    String method2(String source,String target,String replacement){
      StringBuffer result=new StringBuffer();
      int index=source.indexOf(target);
      int lastIndex=0;
      if (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(replacement);
        lastIndex=index + target.length();
      }
      if (lastIndex < source.length()) {
        result.append(source.substring(lastIndex));
      }
      return result.toString();
    }
}
