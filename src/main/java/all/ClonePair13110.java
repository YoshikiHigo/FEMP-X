package all;

public class ClonePair13110 {

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

    String method2(String s,String find,String replace){
      int found=s.indexOf(find);
      if (found == -1) {
        return s;
      }
      StringBuffer sb=new StringBuffer(s.length());
      int start=0;
      for (; ; ) {
        for (; start < found; start++) {
          sb.append(s.charAt(start));
        }
        if (found == s.length()) {
          break;
        }
        sb.append(replace);
        start+=find.length();
        found=s.indexOf(find,start);
        if (found == -1) {
          found=s.length();
        }
      }
      return sb.toString();
    }
}
