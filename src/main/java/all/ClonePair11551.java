package all;

public class ClonePair11551 {

    String method1(String formats,String number){
      number=number.trim();
      final int nlen=number.length();
      final int formatslen=formats.length();
      StringBuffer sb=new StringBuffer();
      for (int f=0; f < formatslen; ) {
        sb.setLength(0);
        int n=0;
        while (true) {
          final char fch=formats.charAt(f);
          if (fch == '\n' && n >= nlen)       return sb.toString();
          if (fch == '\n' || n >= nlen)       break;
          final char nch=number.charAt(n);
          if (fch == nch || (fch == 'x' && Character.isDigit(nch))) {
            f++;
            n++;
            sb.append(nch);
          }
     else       if (fch == ' ') {
            f++;
            sb.append(' ');
            if (formats.charAt(f) == '\n') {
              return sb.append(number,n,nlen).toString();
            }
          }
     else       break;
        }
        f=formats.indexOf('\n',f) + 1;
        if (f == 0)     break;
      }
      return null;
    }

    String method2(String formats,String number){
      number=number.trim();
      final int nlen=number.length();
      final int formatslen=formats.length();
      StringBuffer sb=new StringBuffer();
      for (int f=0; f < formatslen; ) {
        sb.setLength(0);
        int n=0;
        while (true) {
          final char fch=formats.charAt(f);
          if (fch == '\n' && n >= nlen)       return sb.toString();
          if (fch == '\n' || n >= nlen)       break;
          final char nch=number.charAt(n);
          if (fch == nch || (fch == 'x' && Character.isDigit(nch))) {
            f++;
            n++;
            sb.append(nch);
          }
     else       if (fch == ' ') {
            f++;
            sb.append(' ');
            if (formats.charAt(f) == '\n')         return sb.append(number,n,nlen).toString();
          }
     else       break;
        }
        f=formats.indexOf('\n',f) + 1;
        if (f == 0)     break;
      }
      return null;
    }
}
