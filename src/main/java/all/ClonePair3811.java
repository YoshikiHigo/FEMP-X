package all;

public class ClonePair3811 {

    int method1(char ch[],int start,int length,char[] out){
      int o=0;
      for (int i=start; i < start + length; i++) {
        if (ch[i] == '<') {
          ("&lt;").getChars(0,4,out,o);
          o+=4;
        }
     else     if (ch[i] == '>') {
          ("&gt;").getChars(0,4,out,o);
          o+=4;
        }
     else     if (ch[i] == '&') {
          ("&amp;").getChars(0,5,out,o);
          o+=5;
        }
     else     if (ch[i] == '\"') {
          ("&#34;").getChars(0,5,out,o);
          o+=5;
        }
     else     if (ch[i] == '\'') {
          ("&#39;").getChars(0,5,out,o);
          o+=5;
        }
     else {
          out[o++]=ch[i];
        }
      }
      return o;
    }

    int method2(char ch[],int start,int length,char[] out){
      int o=0;
      for (int i=start; i < start + length; i++) {
        if (ch[i] == '<') {
          ("&lt;").getChars(0,4,out,o);
          o+=4;
        }
     else     if (ch[i] == '>') {
          ("&gt;").getChars(0,4,out,o);
          o+=4;
        }
     else     if (ch[i] == '&') {
          ("&amp;").getChars(0,5,out,o);
          o+=5;
        }
     else     if (ch[i] == '\"') {
          ("&#34;").getChars(0,5,out,o);
          o+=5;
        }
     else     if (ch[i] == '\'') {
          ("&#39;").getChars(0,5,out,o);
          o+=5;
        }
     else     if (ch[i] <= 0x7f) {
          out[o++]=ch[i];
        }
     else {
          String dec="&#" + Integer.toString((int)ch[i]) + ';';
          dec.getChars(0,dec.length(),out,o);
          o+=dec.length();
        }
      }
      return o;
    }
}
