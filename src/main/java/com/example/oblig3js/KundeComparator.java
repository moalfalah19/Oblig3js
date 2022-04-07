package com.example.oblig3js;
import java.util.Comparator;

    public class KundeComparator implements Comparator<Kunde> {

        public int compare(Kunde k1, Kunde k2) {
            return k1.getEtternavn().compareTo(k2.getEtternavn());
        }
    }

