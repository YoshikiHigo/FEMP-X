package unverified;

public class ClonePair11094 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
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
