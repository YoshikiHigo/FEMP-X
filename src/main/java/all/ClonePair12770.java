package all;

public class ClonePair12770 {

    String method1(String in,String match,String replacement){
      if (in == null || match == null || replacement == null) {
        return in;
      }
      StringBuffer out=new StringBuffer();
      int matchLength=match.length();
      int inLength=in.length();
      for (int i=0; i < inLength; i++) {
        int upperSearhLimit=i + matchLength;
        if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
          out.append(replacement);
          i=upperSearhLimit - 1;
        }
     else {
          out.append(in.charAt(i));
        }
      }
      return out.toString();
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
