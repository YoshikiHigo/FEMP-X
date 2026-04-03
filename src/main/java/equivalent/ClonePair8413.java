package equivalent;

public class ClonePair8413 {
    String method1(String sent, int[] sent_id) {
        if (sent.matches("^<seg\\s+id=.*$")) {
            String res_sent = sent.replaceAll("^<seg\\s+id=\"", "");
            String str_id = "";
            for (int i = 0; i < res_sent.length(); i++) {
                char cur = res_sent.charAt(i);
                if (cur != '"') str_id += cur;
                else break;
            }
            int res_id = (Integer.valueOf(str_id)).intValue();
            res_sent = res_sent.replaceFirst(str_id + "\">", "");
            res_sent = res_sent.replaceAll("</seg>", "");
            sent_id[0] = res_id;
            return res_sent;
        } else {
            sent_id[0] = -1;
            return sent;
        }
    }

    String method2(String sent, int[] sent_id) {
        if (sent.matches("^<seg\\s+id=.*$")) {
            String res_sent = sent.replaceAll("^<seg\\s+id=\"", "");
            String str_id = "";
            for (int i = 0; i < res_sent.length(); i++) {
                char cur = res_sent.charAt(i);
                if (cur != '"') {
                    str_id += cur;
                } else {
                    break;
                }
            }
            int res_id = Integer.parseInt(str_id);
            res_sent = res_sent.replaceFirst(str_id + "\">", "");
            res_sent = res_sent.replaceAll("</seg>", "");
            sent_id[0] = res_id;
            return res_sent;
        } else {
            sent_id[0] = -1;
            return sent;
        }
    }
}
