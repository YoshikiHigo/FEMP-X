package unverified;

public class ClonePair13107 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
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
