package all;

public class ClonePair13152 {

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

    String method2(String input,String search,String replacement){
      int pos=input.indexOf(search);
      if (pos != -1) {
        int lastPos=pos;
        while (true) {
          pos=input.indexOf(search,lastPos + 1);
          if (pos == -1) {
            break;
          }
     else {
            lastPos=pos;
          }
        }
        input=input.substring(0,lastPos) + replacement + input.substring(lastPos + search.length());
      }
      return input;
    }
}
