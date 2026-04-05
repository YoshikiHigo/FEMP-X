package all;

public class ClonePair6548 {

    String method1(String source,boolean bReplaceNl,boolean bReplaceTag,boolean bReplaceQuote){
      StringBuffer sb=new StringBuffer();
      int len=source.length();
      for (int i=0; i < len; i++) {
        char c=source.charAt(i);
    switch (c) {
    case '\"':      if (bReplaceQuote) {
            sb.append("&quot;");
          }
     else {
            sb.append(c);
          }
        break;
    case '<':  if (bReplaceTag) {
        sb.append("&lt;");
      }
     else {
        sb.append(c);
      }
    break;
    case '>':if (bReplaceTag) {
    sb.append("&gt;");
    }
     else {
    sb.append(c);
    }
    break;
    case '\n':if (bReplaceNl) {
    if (bReplaceTag) {
    sb.append("&lt;br&gt;");
    }
     else {
    sb.append("<br>");
    }
    }
     else {
    sb.append(c);
    }
    break;
    case '\r':break;
    case '&':sb.append("&amp;");
    break;
    default:sb.append(c);
    break;
    }
    }
    return sb.toString();
    }

    String method2(String source,boolean bReplaceNl,boolean bReplaceTag,boolean bReplaceQuote){
      StringBuffer sb=new StringBuffer();
      int len=source.length();
      for (int i=0; i < len; i++) {
        char c=source.charAt(i);
    switch (c) {
    case '\"':      if (bReplaceQuote)       sb.append("&quot;");
     else       sb.append(c);
        break;
    case '<':  if (bReplaceTag)   sb.append("&lt;");
     else   sb.append(c);
    break;
    case '>':if (bReplaceTag) sb.append("&gt;");
     else sb.append(c);
    break;
    case '\n':if (bReplaceNl) {
    if (bReplaceTag) sb.append("&lt;br&gt;");
     else sb.append("<br>");
    }
     else {
    sb.append(c);
    }
    break;
    case '\r':break;
    case '&':sb.append("&amp;");
    break;
    default:sb.append(c);
    break;
    }
    }
    return sb.toString();
    }
}
