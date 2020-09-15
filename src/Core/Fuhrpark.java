package Core;

import Comparer.ErstZulassungsComparer;
import Comparer.NamenComparer;

import java.util.Arrays;

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
        Arrays.sort(fahrzeuge, new ErstZulassungsComparer());
        printArray();
    }

    public void printNamenListe()
    {
        Arrays.sort(fahrzeuge, new NamenComparer());
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