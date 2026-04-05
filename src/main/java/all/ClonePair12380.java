package all;

public class ClonePair12380 {

    String method1(String str,boolean transQuotes){
      if (str == null)   return null;
      if (str.equals(""))   return "";
      StringBuffer buf=new StringBuffer();
      int last_char=str.length() - 1;
      char cur_char;
      for (int i=0; i <= last_char; i++) {
        cur_char=str.charAt(i);
    switch (cur_char) {
    case '&':      buf.append("&amp;");
        break;
    case '<':  buf.append("&lt;");
    break;
    case '>':buf.append("&gt;");
    break;
    case '\'':if (transQuotes) {
    buf.append("&apos;");
    }
     else {
    buf.append(cur_char);
    }
    break;
    case '"':if (transQuotes) {
    buf.append("&quot;");
    }
     else {
    buf.append(cur_char);
    }
    break;
    default:buf.append(cur_char);
    break;
    }
    }
    return buf.toString();
    }

    String method2(String input,boolean quote){
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
}
