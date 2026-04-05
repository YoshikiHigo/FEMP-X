package unverified;

public class ClonePair12925 {

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

    String method2(String html,String startTag,String endTag){
      int s=html.indexOf(startTag);
      if (s == -1)   return null;
      s+=startTag.length();
      int e=html.indexOf(endTag,s);
      if (e == -1)   return null;
      return html.substring(s,e).trim();
    }
}
