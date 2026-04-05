package all;

public class ClonePair4002 {

    boolean method1(String Restaurante,String Endereco,String TipoComida){
      if (!(Restaurante == null || Restaurante.equals("") || Endereco == null || Endereco.equals("") || TipoComida == null || TipoComida.equals(""))) {
        return true;
      }
      return false;
    }

    boolean method2(String type,String id,String op){
      if (type == null || type.equals(""))   return false;
      if (id == null || id.equals(""))   return false;
      if (op == null || op.equals(""))   return false;
      return true;
    }
}
