package no.oslomet.cs.algdat;

import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {
    }

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;


    }

    // Oppgave 1

    /**
     * (a) Det blir n - 1 sammenligninger, fordi hvert tall blir
     * sammenlignet med tallet som kommer etter.
     * <p>
     * (b) Det blir færrest ombyttinger når tabellen allerede er
     * sortert stigende. Da blir det 0 ombyttinger.
     * <p>
     * (c) Det blir flest ombyttinger når det største tallet ligger
     * først. Da må det flyttes helt til slutten, og det blir
     * n - 1 ombyttinger.
     * <p>
     * (d) Jeg testet ombyttinger() på forskjellige tilfeldige
     * permutasjoner av tallene fra 1 til n. Gjennomsnittet følger
     * formelen n - H_n, der H_n = 1 + 1/2 + 1/3 + ... + 1/n.
     */
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom");

        }
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;

            }
        }
        return a[a.length - 1];


    }

    public static int ombyttinger(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom");
        }
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antall++;
            }

        }
        return antall;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int antall = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Tabellen er ikke sortert");
            }
            if (a[i] != a[i + 1]) {
                antall++;
            }
        }
        return antall;


    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length; i++) {
            boolean verdiFunnet = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    verdiFunnet = true;

                }
            }
            if (!verdiFunnet) {
                antall++;
            }
        }
        return antall;
    }

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if (fra < 0) {
            throw new IndexOutOfBoundsException("Tallet er negativt");
        }
        if (til > a.length) {
            throw new IndexOutOfBoundsException("Tallet er større enn tabellens lengde");

        }
        if (fra >= til) {
            return;
        }
        kvikksortering(a, fra, til - 1);
    }

    private static void kvikksortering(int[] a, int venstre, int høyre) {
        // 0 eller 1 element -> allerede sortert
        if (venstre >= høyre) {
            return;
        }

        // Finner elementet i midten
        int midt = (venstre + høyre) / 2;

        // Flytter det til slutten
        bytt(a, midt, høyre);

        // Verdien vi skal bruke som pivot
        int pivot = a[høyre];

        int forsteStore = parterSkilleverdi(a, venstre, høyre - 1, pivot);

        bytt(a, høyre, forsteStore);

        kvikksortering(a, venstre, forsteStore - 1);
        kvikksortering(a, forsteStore + 1, høyre);
    }


    private static int parterSkilleverdi(int[] a, int venstre, int høyre, int pivot) {
        while (true) {
            while (venstre <= høyre && a[venstre] < pivot) {
                venstre++;
            }

            while (venstre <= høyre && a[høyre] >= pivot) {
                høyre--;
            }

            if (venstre < høyre) {
                bytt(a, venstre, høyre);
            } else {
                break;
            }
        }

        return venstre;
    }


    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    // Oppgave 5
    public static void delsortering(int[] a) {
        int venstre = 0;
        int høyre = a.length - 1;

        // Deler tabellen i oddetall til venstre og partall til høyre
        while (venstre <= høyre) {

            // Gå videre så lenge vi finner oddetall
            while (venstre <= høyre && a[venstre] % 2 != 0) {
                venstre++;
            }

            // Gå bakover så lenge vi finner partall
            while (venstre <= høyre && a[høyre] % 2 == 0) {
                høyre--;
            }

            // Hvis vi har et partall til venstre og oddetall til høyre,
            // bytter vi plass på dem
            if (venstre < høyre) {
                bytt(a, venstre, høyre);
                venstre++;
                høyre--;
            }
        }

        // venstre er nå skillet mellom oddetall og partall
        int skille = venstre;

        // Sorterer oddetallene
        sorter(a, 0, skille);

        // Sorterer partallene
        sorter(a, skille, a.length);
    }


    // Oppgave 6
    public static void rotasjon(char[] a) {
        // Tom tabell eller kun ett element trenger ingen rotasjon
        if (a.length <= 1) {
            return;
        }

        // Tar vare på siste element
        char siste = a[a.length - 1];

        // Flytter alle elementene ett steg mot høyre
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        // Legger det siste elementet først
        a[0] = siste;

    }

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 8a
    public static String flett(String s, String t) {

        String resultat = "";
        int i = 0;

        while (i < s.length() && i < t.length()) {
            resultat += s.charAt(i);
            resultat += t.charAt(i);
            i++;
        }

        while (i < s.length()) {
            resultat += s.charAt(i);
            i++;
        }

        while (i < t.length()) {
            resultat += t.charAt(i);
            i++;
        }

        return resultat;
    }


    //Oppgave 8b
    public static String flett(String... s) {
        String resultat = "";
        int lengste = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > lengste) {
                lengste = s[i].length();
            }
        }

        for (int j = 0; j < lengste; j++) {
            for (int i = 0; i < s.length; i++) {
                if (j < s[i].length()) {
                    resultat += s[i].charAt(j);
                }
            }
        }

        return resultat;
    }


    // Oppgave 9
    public static int[] indeksSortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }
}