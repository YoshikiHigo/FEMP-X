package unverified;

public class ClonePair12593 {

    String method1(String input,boolean quote){
      StringBuffer out=new StringBuffer();
      if (input == null)   return null;
      int oldsize=input.length();
      char[] old=new char[oldsize];
      input.getChars(0,oldsize,old,0);
      int selstart=0;
      String entity=null;
      for (int i=0; i < oldsize; i++) {
    switch (old[i]) {
    case '&':      entity="&amp;";
        break;
    case '<':  entity="&lt;";
    break;
    case '>':entity="&gt;";
    break;
    case '\'':if (quote) {
    entity="&apos;";
    break;
    }
    case '"':if (quote) {
    entity="&quot;";
    break;
    }
    }
    if (entity != null) {
    out.append(old,selstart,i - selstart);
    out.append(entity);
    selstart=i + 1;
    entity=null;
    }
    }
    if (selstart == 0) return input;
    out.append(old,selstart,oldsize - selstart);
    return out.toString();
    }

    String method2(String raw,boolean apos){
      if (raw == null) {
        return null;
      }
      StringBuilder buf=new StringBuilder();
      for (int i=0; i < raw.length(); ++i) {
        char c=raw.charAt(i);
        if (c == '&') {
          buf.append("&amp;");
        }
     else     if (c == '<') {
          buf.append("&lt;");
        }
     else     if (c == '>') {
          buf.append("&gt;");
        }
     else     if (c == '"') {
          buf.append("&quot;");
        }
     else     if (apos && c == '\'') {
          buf.append("&apos;");
        }
     else {
          buf.append(c);
        }
      }
      return buf.toString();
    }
}
