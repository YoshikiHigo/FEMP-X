package unverified;

public class ClonePair12408 {

    String method1(String string,String toBeReplaced,String replacement){
      if (string == null || toBeReplaced == null || replacement == null)   return string;
      String tail=string;
      StringBuffer result=new StringBuffer(string.length() + replacement.length());
      int length=toBeReplaced.length();
      int begin;
      while (!tail.equals("")) {
        begin=tail.indexOf(toBeReplaced);
        if (begin == -1) {
          result.append(tail);
          return result.toString();
        }
        result.append(tail.substring(0,begin)).append(replacement);
        tail=tail.substring(begin + length);
      }
      return result.toString();
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
