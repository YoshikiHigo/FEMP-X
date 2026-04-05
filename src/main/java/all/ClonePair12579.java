package all;

public class ClonePair12579 {

    String method1(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == thisStr.charAt(0))     if (str.substring(i).startsWith(thisStr)) {
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
          return str;
        }
      }
      return str;
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
