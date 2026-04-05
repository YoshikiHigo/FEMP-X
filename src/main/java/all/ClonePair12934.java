package all;

public class ClonePair12934 {

    String method1(String line,String openChunk,String closeChunk){
      int index=0;
      int closeIndex=-1;
      int oc_length=openChunk.length();
      int cc_length=closeChunk.length();
      String temp_attr=null;
      if ((index=line.indexOf(openChunk,index)) != -1) {
        closeIndex=line.indexOf(closeChunk,(index + oc_length));
        if (closeIndex != -1) {
          temp_attr=line.substring(index + oc_length,closeIndex);
          return temp_attr;
        }
      }
      return null;
    }

    String method2(String text,String start,String end){
      int i=0;
      int j=0;
      if ((i=text.indexOf(start)) > -1 && (j=text.indexOf(end,i + start.length())) > -1) {
        return text.substring(i + start.length(),j);
      }
      return null;
    }
}
