package all;

public class ClonePair5706 {

    boolean method1(String value,String search,boolean matchCase){
      if (matchCase) {
        return value.indexOf(search) != -1;
      }
      return value.toLowerCase().indexOf(search.toLowerCase()) != -1;
    }

    boolean method2(String expression,String criteria,boolean caseSensitive){
      final char[] crit=caseSensitive ? criteria.toCharArray() : criteria.toUpperCase().toCharArray();
      final char[] exp=caseSensitive ? expression.toCharArray() : expression.toUpperCase().toCharArray();
      final int limit=exp.length - 1;
      int index=0;
      for (int loop=0; loop < crit.length; loop++) {
        if (index > limit) {
          return false;
        }
        final char c=crit[loop];
    switch (c) {
    case '?':      index++;
        break;
    case '%':  if (loop + 1 < crit.length) {
        final char next=crit[loop + 1];
        while (index <= limit && next != exp[index]) {
          index++;
        }
        if (index > limit || next != exp[index]) {
          return false;
        }
      }
     else {
        return true;
      }
    break;
    default:if (c == exp[index]) {
    index++;
    }
     else {
    return false;
    }
    break;
    }
    }
    if (index <= limit) {
    return false;
    }
    return true;
    }
}
