package all;

public class ClonePair11245 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
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
