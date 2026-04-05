package all;

public class ClonePair11705 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
      }
    }

    String method2(String orig,String find,String replace){
      if (find == null || find.equals("")) {
        return orig;
      }
      if (replace == null) {
        replace="";
      }
      if (orig == null) {
        return null;
      }
      int origLength=orig.length();
      int findLength=find.length();
      StringBuffer replaced=new StringBuffer((int)(origLength * 2));
      int lastIndex=0;
      int indexOf=orig.indexOf(find,lastIndex);
      while (indexOf > -1) {
        replaced.append(orig.substring(lastIndex,indexOf));
        replaced.append(replace);
        lastIndex=indexOf + findLength;
        indexOf=orig.indexOf(find,lastIndex);
      }
      if (lastIndex < origLength) {
        replaced.append(orig.substring(lastIndex,origLength));
      }
      return replaced.toString();
    }
}
