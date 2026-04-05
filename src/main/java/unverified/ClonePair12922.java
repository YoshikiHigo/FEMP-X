package unverified;

public class ClonePair12922 {

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

    String method2(String string,String leading,String trailing){
      int i_start=string.indexOf(leading);
      if (i_start < 0) {
        return null;
      }
      i_start+=leading.length();
      int i_end=string.indexOf(trailing,i_start);
      if (i_end < 0) {
        return null;
      }
      return string.substring(i_start,i_end);
    }
}
