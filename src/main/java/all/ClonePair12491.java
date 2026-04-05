package all;

public class ClonePair12491 {

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

    String method2(String orig,String vieja,String nueva){
      int oldind=0, newind=0;
      String retval="";
      if (orig == null)   return null;
      for (; ; ) {
        oldind=newind;
        newind=orig.indexOf(vieja,oldind);
        if (newind >= 0) {
          retval+=orig.substring(oldind,newind);
          retval+=nueva;
          newind+=vieja.length();
        }
     else {
          retval+=orig.substring(oldind);
          return retval;
        }
      }
    }
}
