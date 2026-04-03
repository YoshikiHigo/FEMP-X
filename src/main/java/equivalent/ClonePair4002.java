package equivalent;

public class ClonePair4002 {
    boolean method1(String Restaurante, String Endereco, String TipoComida) {
        return !(Restaurante == null || Restaurante.equals("") || Endereco == null || Endereco.equals("") || TipoComida == null || TipoComida.equals(""));
    }

    boolean method2(String type, String id, String op) {
        if (type == null || type.equals("")) return false;
        if (id == null || id.equals("")) return false;
        return op != null && !op.equals("");
    }
}
