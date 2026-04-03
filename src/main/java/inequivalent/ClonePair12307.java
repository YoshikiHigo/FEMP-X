package inequivalent;

public class ClonePair12307 {

    float method1(float valeur, String contenu) {
        float resul = valeur;
        String min = "";
        int minutes = 00;
        if (contenu.lastIndexOf(".") == -1) minutes = 00;
        else {
            min = contenu.substring(contenu.lastIndexOf(".") + 1);
            minutes = Integer.parseInt(min);
            if (minutes / 10 == 0 && min.length() == 1) minutes = minutes * 10;
        }
        if (minutes / 100 != 0) return valeur;
        int heures = 0;
        heures = (int) valeur;
        while (minutes >= 60) {
            heures++;
            minutes -= 60;
        }
        float resultat = heures + (float) (minutes / 100.0);
        return resultat;
    }

    float method2(float valeur, String contenu) {
        float resul = valeur;
        String min = "";
        int minutes = 00;
        if (contenu.lastIndexOf(".") == -1) minutes = 00;
        else {
            min = contenu.substring(contenu.lastIndexOf(".") + 1);
            minutes = Integer.parseInt(min);
            if (minutes / 10 == 0 && min.length() == 1) minutes = minutes * 10;
        }
        if (minutes / 100 != 0) return valeur;
        System.out.println("minutes: " + minutes);
        int heures = 0;
        heures = (int) valeur;
        while (minutes >= 60) {
            heures++;
            minutes -= 60;
        }
        float resultat = heures + (float) (minutes / 100.0);
        return resultat;
    }
}
