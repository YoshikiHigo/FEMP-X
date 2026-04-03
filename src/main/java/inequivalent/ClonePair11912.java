package inequivalent;

public class ClonePair11912 {

    String method1(String ent, String proc, String strocar) {
        String trocar;
        if (ent == null) {
            return null;
        }
        if (ent.equals("")) {
            return "";
        }
        if ((proc == null) || (proc.equals(""))) {
            return ent;
        }
        if (strocar == null) {
            trocar = "";
        } else {
            trocar = strocar;
        }
        StringBuffer sb = new StringBuffer(ent);
        int fi = 0;
        int larg = proc.length();
        int larg2 = trocar.length();
        int local = sb.indexOf(proc, fi);
        while (local != -1) {
            sb.delete(local, local + larg);
            sb.insert(local, trocar);
            fi = local + larg2;
            local = sb.indexOf(proc, fi);
        }
        return sb.toString();
    }

    String method2(String inString, String oldPattern, String newPattern) {
        if (inString == null) {
            return null;
        }
        if (oldPattern == null || newPattern == null) {
            return inString;
        }
        StringBuffer sbuf = new StringBuffer();
        int pos = 0;
        int index = inString.indexOf(oldPattern);
        int patLen = oldPattern.length();
        while (index >= 0) {
            sbuf.append(inString, pos, index);
            sbuf.append(newPattern);
            pos = index + patLen;
            index = inString.indexOf(oldPattern, pos);
        }
        sbuf.append(inString.substring(pos));
        return sbuf.toString();
    }
}
