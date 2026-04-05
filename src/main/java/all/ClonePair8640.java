package all;

public class ClonePair8640 {

    StringBuffer method1(StringBuffer buf,String path){
      if (buf == null) {
        loop:     for (int i=0; i < path.length(); i++) {
          char c=path.charAt(i);
    switch (c) {
    case '%':case '?':case ';':case '#':case ' ':        buf=new StringBuffer(path.length() << 1);
          break loop;
      }
    }
    if (buf == null) {
      return null;
    }
    }
    synchronized (buf) {
    for (int i=0; i < path.length(); i++) {
      char c=path.charAt(i);
    switch (c) {
    case '%':    buf.append("%25");
      continue;
    case '?':buf.append("%3F");
    continue;
    case ';':buf.append("%3B");
    continue;
    case '#':buf.append("%23");
    continue;
    case ' ':buf.append("%20");
    continue;
    default:buf.append(c);
    continue;
    }
    }
    }
    return buf;
    }

    StringBuffer method2(StringBuffer buf,String path){
      if (buf == null) {
        loop:     for (int i=0; i < path.length(); i++) {
          char c=path.charAt(i);
    switch (c) {
    case '%':case '?':case ';':case '#':case ' ':        buf=new StringBuffer(path.length() << 1);
          break loop;
      }
    }
    if (buf == null) return null;
    }
    synchronized (buf) {
    for (int i=0; i < path.length(); i++) {
      char c=path.charAt(i);
    switch (c) {
    case '%':    buf.append("%25");
      continue;
    case '?':buf.append("%3F");
    continue;
    case ';':buf.append("%3B");
    continue;
    case '#':buf.append("%23");
    continue;
    case ' ':buf.append("%20");
    continue;
    default:buf.append(c);
    continue;
    }
    }
    }
    return buf;
    }
}
