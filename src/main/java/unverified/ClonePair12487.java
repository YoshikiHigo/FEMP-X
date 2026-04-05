package unverified;

public class ClonePair12487 {

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

    String method2(String value,String oldKeySubstring,String newKeySubstring){
      if (value == null) {
        return null;
      }
      int oldKeySubstringSize=oldKeySubstring.length();
      while (true) {
        int index=value.indexOf(oldKeySubstring);
        if (index == -1) {
          break;
        }
        value=value.substring(0,index) + newKeySubstring + value.substring(index + oldKeySubstringSize);
      }
      return value;
    }
}
