package unverified;

public class ClonePair3810 {

    int method1(char ch[],int start,int length,char[] out){
      int o=0;
      if (start + length >= 8 && ch[start] == '<' && ch[start + 1] == '!' && ch[start + 2] == '[' && ch[start + 3] == 'C' && ch[start + 4] == 'D' && ch[start + 5] == 'A' && ch[start + 6] == 'T' && ch[start + 7] == 'A') {
        for (int i=start; i < start + length; i++) {
          out[o++]=ch[i];
        }
      }
     else {
        for (int i=start; i < start + length; i++) {
          if (ch[i] == '<') {
            ("&lt;").getChars(0,4,out,o);
            o+=4;
          }
     else       if (ch[i] == '>') {
            ("&gt;").getChars(0,4,out,o);
            o+=4;
          }
     else       if (ch[i] == '&') {
            ("&amp;").getChars(0,5,out,o);
            o+=5;
          }
     else       if (ch[i] == '\"') {
            ("&#34;").getChars(0,5,out,o);
            o+=5;
          }
     else       if (ch[i] == '\'') {
            ("&#39;").getChars(0,5,out,o);
            o+=5;
          }
     else       if (ch[i] < 127) {
            out[o++]=ch[i];
          }
     else {
            out[o++]='&';
            out[o++]='#';
            String code=Integer.toString(ch[i]);
            int len=code.length();
            code.getChars(0,len,out,o);
            o+=len;
            out[o++]=';';
          }
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
     else     if (ch[i] < 127) {
          out[o++]=ch[i];
        }
     else {
          out[o++]='&';
          out[o++]='#';
          String code=Integer.toString(ch[i]);
          int len=code.length();
          code.getChars(0,len,out,o);
          o+=len;
          out[o++]=';';
        }
      }
      return o;
    }
}
