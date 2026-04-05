package unverified;

public class ClonePair13204 {

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

    String method2(String source,String token,String replacement){
      int i1;
      int i2=0;
      int tl=token.length();
      StringBuffer r=new StringBuffer(source.length());
      do {
        i1=source.indexOf(token,i2);
        if (i1 >= i2) {
          if (i1 > i2)       r.append(source.substring(i2,i1));
          r.append(replacement);
          i2=i1 + tl;
        }
     else     r.append(source.substring(i2));
      }
     while (i1 >= 0);
      return r.toString();
    }
}
