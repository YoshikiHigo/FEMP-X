package unverified;

public class ClonePair9488 {

    String method1(String orig,String lookFor,String replaceWith){
      int idx=orig.indexOf(lookFor);
      if (idx < 0) {
        return (orig);
      }
      int prev=0;
      StringBuffer rtn=new StringBuffer();
      while (idx >= 0) {
        rtn.append(orig.substring(prev,idx));
        rtn.append(replaceWith);
        prev=idx + lookFor.length();
        idx=orig.indexOf(lookFor,prev);
      }
      rtn.append(orig.substring(prev,orig.length()));
      return (rtn.toString());
    }

    String method2(String lookIn,String lookFor,String replaceWith){
      int count=0;
      int i, j;
      StringBuffer sb;
      for (i=0; (i=lookIn.indexOf(lookFor,i)) != -1; i+=lookFor.length())   ++count;
      if (count == 0) {
        return lookIn;
      }
      sb=new StringBuffer(lookIn.length() + count * (replaceWith.length() - lookFor.length()));
      for (i=0; (j=lookIn.indexOf(lookFor,i)) != -1; i=j + lookFor.length())   sb.append(lookIn.substring(i,j)).append(replaceWith);
      sb.append(lookIn.substring(i));
      return sb.toString();
    }
}
