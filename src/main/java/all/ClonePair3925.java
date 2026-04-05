package all;

public class ClonePair3925 {

    String method1(String text,String[] pattern,String[] replace){
      int startIndex;
      int foundIndex;
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pattern.length; i++) {
        startIndex=0;
        result.setLength(0);
        while ((foundIndex=text.indexOf(pattern[i],startIndex)) >= 0) {
          result.append(text.substring(startIndex,foundIndex));
          result.append(replace[i]);
          startIndex=foundIndex + pattern[i].length();
        }
        result.append(text.substring(startIndex));
        text=result.toString();
      }
      return text;
    }

    String method2(String body,String[] keys,String[] values){
      for (int i=0; i < keys.length; i++) {
        int ndx=body.indexOf(keys[i]);
        if (ndx >= 0) {
          body=body.replace(keys[i],values[i]);
          i--;
        }
      }
      return body;
    }
}
