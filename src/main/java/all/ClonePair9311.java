package all;

public class ClonePair9311 {

    String method1(char[] chars,int offset,int length){
      final StringBuffer escaped=new StringBuffer();
      final int end=offset + length;
      for (int i=offset; i < end; ++i) {
        final char c=chars[i];
    switch (c) {
    case '\'':      escaped.append("&apos;");
        break;
    case '\"':  escaped.append("&quot;");
    break;
    case '<':escaped.append("&lt;");
    break;
    case '>':escaped.append("&gt;");
    break;
    case '&':escaped.append("&amp;");
    break;
    default:escaped.append(c);
    }
    }
    return escaped.toString();
    }

    String method2(char[] chars,int start,int length){
      StringBuffer buff=new StringBuffer();
      for (int i=start; i < start + length; i++) {
        char c=chars[i];
    switch (c) {
    case '\'':      buff.append("&apos;");
        break;
    case '"':  buff.append("&quot;");
    break;
    case '&':buff.append("&amp;");
    break;
    case '<':buff.append("&lt;");
    break;
    case '>':buff.append("&gt;");
    break;
    default:buff.append(c);
    break;
    }
    }
    return buff.toString();
    }
}
