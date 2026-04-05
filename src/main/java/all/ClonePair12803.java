package all;

public class ClonePair12803 {

    String method1(String text,String src,String tar){
      StringBuffer sb=new StringBuffer();
      if (text == null || src == null || tar == null) {
        return text;
      }
     else {
        int size=text.length();
        int gap=src.length();
        for (int start=0; start >= 0 && start < size; ) {
          int i=text.indexOf(src,start);
          if (i == -1) {
            sb.append(text.substring(start));
            start=-1;
          }
     else {
            sb.append(text.substring(start,i)).append(tar);
            start=i + gap;
          }
        }
        return sb.toString();
      }
    }

    String method2(String text,String replace,String replaceTo){
      if (text == null || replace == null || replaceTo == null || replace.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int searchFrom=0;
      while (true) {
        int foundAt=text.indexOf(replace,searchFrom);
        if (foundAt == -1) {
          break;
        }
        buf.append(text.substring(searchFrom,foundAt)).append(replaceTo);
        searchFrom=foundAt + replace.length();
      }
      buf.append(text.substring(searchFrom));
      return buf.toString();
    }
}
