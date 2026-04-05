package all;

public class ClonePair4764 {

    String method1(String inicial,char adicionar,int comprimentoTotal){
      if (inicial == null)   return inicial;
      int comprimentoInicial=inicial.length();
      if (comprimentoInicial == comprimentoTotal)   return inicial;
      StringBuffer sb=new StringBuffer(inicial);
      for (int i=0; i < (comprimentoTotal - comprimentoInicial); i++) {
        sb.append(adicionar);
      }
      return sb.toString();
    }

    String method2(String value,char padding,int totalLength){
      if (value == null) {
        return value;
      }
      if (value.length() >= totalLength) {
        return value;
      }
      final StringBuffer sb=new StringBuffer(value);
      for (int i=0; i < totalLength - value.length(); i++) {
        sb.append(padding);
      }
      return sb.toString();
    }
}
