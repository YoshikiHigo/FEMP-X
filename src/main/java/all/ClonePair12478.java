package all;

public class ClonePair12478 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
    }

    String method2(String orig,String src,String dest){
      if (orig == null)   return null;
      StringBuffer res=new StringBuffer();
      int start, end=0, last=0;
      while ((start=orig.indexOf(src,end)) != -1) {
        res.append(orig.substring(last,start));
        res.append(dest);
        end=start + src.length();
        last=start + src.length();
      }
      res.append(orig.substring(end));
      return res.toString();
    }
}
