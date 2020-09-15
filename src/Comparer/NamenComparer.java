package Comparer;
import Core.Fahrzeuge;

import java.util.Comparator;

public class NamenComparer implements Comparator<Fahrzeuge>
{
    @Override
    public int compare(Fahrzeuge o1, Fahrzeuge o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
