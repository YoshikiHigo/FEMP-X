package all;

public class ClonePair12788 {

    boolean method1(String uri){
      char ch='\0';
      int pos=0, len=uri.length();
      while (pos < len && (ch=uri.charAt(pos)) != ':' && ch != '/' && ch != '?' && ch != '#')   pos++;
      return (ch == ':');
    }

    boolean method2(String uri){
      int i=uri.indexOf(':');
      if (i < 0)   return false;
      while (--i >= 0) {
    switch (uri.charAt(i)) {
    case '#':case '/':case '?':      return false;
      }
    }
    return true;
    }
}
