package Comparer;
import Core.Fahrzeuge;

import java.util.Comparator;

public class ErstZulassungsComparer implements Comparator<Fahrzeuge>
{
    @Override
    public int compare(Fahrzeuge o1, Fahrzeuge o2) {
        return o1.getErstzulassung().compareTo(o2.getErstzulassung());
    }
}