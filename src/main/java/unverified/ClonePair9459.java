package unverified;

public class ClonePair9459 {

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

    String method2(String text,String find,String replace){
      int replaceStart=text.indexOf(find);
      if (replaceStart == -1)   return text;
      int findLength=find.length();
      StringBuffer toReturn=new StringBuffer();
      while (replaceStart != -1) {
        toReturn.append(text.substring(0,replaceStart));
        toReturn.append(replace);
        text=text.substring(replaceStart + findLength);
        replaceStart=text.indexOf(find);
      }
      toReturn.append(text);
      return toReturn.toString();
    }
}
