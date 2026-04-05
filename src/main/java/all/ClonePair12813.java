package all;

public class ClonePair12813 {

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

    String method2(String inTarget,String inOldPattern,String inNewPattern){
      if (inTarget == null)   return null;
      if (inOldPattern == null || inOldPattern.length() == 0 || inNewPattern == null)   return inTarget;
      StringBuffer buff=new StringBuffer();
      int previous=0, offset=0, length=inOldPattern.length();
      while ((offset=inTarget.indexOf(inOldPattern,previous)) != -1) {
        buff.append(inTarget.substring(previous,offset));
        buff.append(inNewPattern);
        previous=offset + length;
      }
      buff.append(inTarget.substring(previous));
      return buff.toString();
    }
}
