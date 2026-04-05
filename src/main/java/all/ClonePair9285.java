package all;

public class ClonePair9285 {

    String method1(String source,String str1,String str2){
      int index, start=0;
      StringBuffer value=new StringBuffer();
      while ((index=source.indexOf(str1,start)) != -1) {
        value.append(source.substring(start,index) + str2);
        start=index + str1.length();
      }
      if (start < source.length()) {
        value.append(source.substring(start,source.length()));
      }
      return value.toString();
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
