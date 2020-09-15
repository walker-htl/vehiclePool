package Core;

public class Motorrad extends Fahrzeuge implements IFortbewegungsmittel
{
    // sollte eigentlich ein enum sein!
    private String motorTyp;

    public Motorrad(String name, String erstzulassung, int leistung, double spritverbrauch, double eurotaxEinkaufspreis, double tatsaechlicherEinkaufspreis, double eurotaxVerkaufspreis, String motorTyp) {
        super(name, erstzulassung, leistung, spritverbrauch, eurotaxEinkaufspreis, tatsaechlicherEinkaufspreis, eurotaxVerkaufspreis);
        this.motorTyp = motorTyp;
    }

    @Override
    public int GetPassagierkapazitaet() {
        return 0;
    }

    @Override
    public double GetKilomenterpreisFuerBenzin() {
        return 0;
    }

    // hier wäre eine abstrakte Klasse besser
    @Override
    public int compareTo(Fahrzeuge o) {
        int returnValue = -99;

        if (o != null)
        {
            returnValue = Double.compare(this.getEurotaxVerkaufspreis(), o.getEurotaxEinkaufspreis());
        }

        return returnValue;
    }

    @Override
    public String toString() {
        return "Motorrad {" +
                "Motortyp=" + motorTyp +
                ", " +
                super.toString();
    }
}
