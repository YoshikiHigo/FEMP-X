package all;

public class ClonePair7436 {

    String method1(String s,int width,char fillchar){
      if (s == null || s.length() >= width)   return s;
      StringBuilder b=new StringBuilder(width);
      b.append(s);
      while (b.length() < width) {
        b.append(fillchar);
      }
      return b.toString();
    }

    String method2(String as_texto,int ai_longMinima,char ac_relleno){
      if (as_texto == null)   return as_texto;
      if (as_texto.length() < ai_longMinima)   for (int i=0; i < ai_longMinima - as_texto.length(); i++) {
        as_texto=ac_relleno + as_texto;
      }
      return as_texto;
    }
}
