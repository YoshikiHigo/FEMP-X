package all;

public class ClonePair11777 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuilder sb=new StringBuilder(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
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
