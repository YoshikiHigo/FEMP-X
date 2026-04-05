package all;

public class ClonePair3176 {

    String method1(String text,String prefix,boolean caseSensitive){
      String testText=(caseSensitive) ? text : text.toLowerCase();
      String testPrefix=(caseSensitive) ? prefix : prefix.toLowerCase();
      String result=text;
      if (testText.length() > testPrefix.length() && testText.startsWith(testPrefix)) {
        result=text.substring(prefix.length());
      }
      return result;
    }

    String method2(String str,String prefix,boolean chopit){
      int len=prefix.length();
      str=str.replace('/','.');
      if (chopit) {
        if (str.startsWith(prefix) && (str.substring(len).indexOf('.') == -1)) {
          str=str.substring(len);
        }
      }
      return str;
    }
}
