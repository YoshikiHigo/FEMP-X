package all;

public class ClonePair12482 {

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

    String method2(String source,String oldString,String newString){
      if (source == null)   return null;
      StringBuffer output=new StringBuffer();
      int lengOfsource=source.length();
      int lengOfold=oldString.length();
      int posStart=0;
      int pos;
      while ((pos=source.indexOf(oldString,posStart)) >= 0) {
        output.append(source.substring(posStart,pos));
        output.append(newString);
        posStart=pos + lengOfold;
      }
      if (posStart < lengOfsource) {
        output.append(source.substring(posStart));
      }
      return output.toString();
    }
}
