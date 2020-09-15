package Comparer;

import Core.Fahrzeuge;

import java.util.Comparator;

public class SpritverbrauchComparer implements Comparator<Fahrzeuge>
{
    @Override
    public int compare(Fahrzeuge o1, Fahrzeuge o2)
    {
        return o1.getSpritverbrauch() < o2.getSpritverbrauch() ? -1 : o1.getSpritverbrauch() > o2.getSpritverbrauch() ? +1 : 0;
    }
}
