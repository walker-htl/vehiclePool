package Core;

import Comparer.*;
import java.util.Arrays;
import java.util.Collections;

public class Fuhrpark
{
    private Fahrzeuge[] fahrzeuge;
    private int index;

    public Fuhrpark(int maxAnzahlVonFahrzeugen)
    {
        fahrzeuge = new Fahrzeuge[maxAnzahlVonFahrzeugen];
        index = 0;
    }

    public void addFahrzeug(Fahrzeuge fahrzeug)
    {
        fahrzeuge[index] = fahrzeug;
        index++;
    }

    public void printPreisliste()
    {
        Arrays.sort(fahrzeuge);
        printArray();
    }

    public void printErstZulassungsListe()
    {
        Arrays.sort(fahrzeuge, Collections.reverseOrder(new ErstZulassungsComparer()));
        printArray();
    }

    public void printNamenListe()
    {
        Arrays.sort(fahrzeuge, new NamenComparer());
        printArray();
    }

    public void printLeistungListe()
    {
        Arrays.sort(fahrzeuge, new LeistungComparer());
        printArray();
    }

    public void printSpritverbrauchListe()
    {
        Arrays.sort(fahrzeuge, new SpritverbrauchComparer());
        printArray();
    }

    private void printArray()
    {
        for (int i = 0; i < index; i++)
        {
            System.out.println(fahrzeuge[i].toString());
        }
    }

}