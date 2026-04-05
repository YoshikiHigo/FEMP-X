package all;

public class ClonePair11725 {

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

    String method2(String text,String key,String value){
      if (text == null)   return null;
      String buffer=text;
      if (buffer != null && key != null && value != null) {
        int length=key.length();
        for (int start=buffer.indexOf(key); start != -1; start=buffer.indexOf(key,start + value.length())) {
          buffer=buffer.substring(0,start) + value + buffer.substring(start + length);
        }
      }
      return buffer;
    }
}
