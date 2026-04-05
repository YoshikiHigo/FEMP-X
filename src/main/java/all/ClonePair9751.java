package all;

public class ClonePair9751 {

    boolean method1(char[] str,char[] pat){
      int stri;
      int pati;
      int starstri;
      int starpati;
      final int strlen=str.length;
      final int patlen=pat.length;
      stri=pati=0;
      starstri=starpati=-1;
      while (true) {
        if (pati < patlen) {
          final char patc=pat[pati];
    switch (patc) {
    case '?':        if (stri == strlen)         break;
          stri++;
        pati++;
      continue;
    case '*':pati++;
    starpati=pati;
    starstri=stri;
    continue;
    default:if (stri < strlen && str[stri] == patc) {
    stri++;
    pati++;
    continue;
    }
    break;
    }
    }
     else if (stri == strlen) return true;
    if (starpati < 0 || starstri == strlen) return false;
    pati=starpati;
    starstri++;
    stri=starstri;
    }
    }

    boolean method2(char[] a1,char[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (a1[i] != a2[i])   return false;
      return true;
    }
}
