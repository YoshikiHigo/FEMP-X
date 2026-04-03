package equivalent;

public class ClonePair7223 {
    boolean method1(String valor1, String valor2) {
        boolean igual = (valor1 == null && valor2 == null) || (valor1 == null && valor2 != null && valor2.equals("")) || (valor2 == null && valor1 != null && valor1.equals(""));
        if (valor1 != null && valor1.equals(valor2)) {
            igual = true;
        }
        return igual;
    }

    boolean method2(String left, String right) {
        boolean ret;
        if ((left == null) && (right == null)) {
            ret = true;
        } else if (right == null && (left != null && left.length() == 0)) {
            ret = true;
        } else if (left == null && (right != null && right.length() == 0)) {
            ret = true;
        } else if ((left == null) || (right == null)) {
            ret = false;
        } else {
            ret = left.equals(right);
        }
        return ret;
    }
}
