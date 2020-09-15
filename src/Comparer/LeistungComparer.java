package Comparer;

import Core.Fahrzeuge;

import java.util.Comparator;

public class LeistungComparer implements Comparator<Fahrzeuge>
{
    @Override
    public int compare(Fahrzeuge o1, Fahrzeuge o2)
    {
        return o1.getLeistung() < o2.getLeistung() ? -1 : o1.getLeistung() > o2.getLeistung() ? +1 : 0;
    }
}
