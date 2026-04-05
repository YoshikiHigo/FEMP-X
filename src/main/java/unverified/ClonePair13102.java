package unverified;

public class ClonePair13102 {

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

    String method2(String src,String from,String to){
      StringBuffer sb=new StringBuffer(src);
      int i1, i2, tail;
      int len=from.length();
      int fromIndex=0;
      while ((i1=src.indexOf(from,fromIndex)) != -1) {
        i2=i1 + len;
        tail=src.length() - i2;
        sb=sb.replace(i1,i2,to);
        src=new String(sb);
        fromIndex=src.length() - tail;
      }
      return new String(sb);
    }
}
