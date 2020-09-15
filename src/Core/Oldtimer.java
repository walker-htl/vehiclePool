package Core;

public class Oldtimer extends Auto implements IOldtimer
{
    private double sammlerWert;
    private int zustandsNote;

    public Oldtimer(String name, String erstzulassung, int leistung, double spritverbrauch, double eurotaxEinkaufspreis, double tatsaechlicherEinkaufspreis,
                    double eurotaxVerkaufspreis, int anzahlDerSitze, boolean isBenziner, double sammlerWert, int zustandsNote) {
        super(name, erstzulassung, leistung, spritverbrauch, eurotaxEinkaufspreis, tatsaechlicherEinkaufspreis, eurotaxVerkaufspreis, anzahlDerSitze, isBenziner);
        this.sammlerWert = sammlerWert;
        this.zustandsNote = zustandsNote;
    }

    @Override
    public double getSammlerwert() {
        return 0;
    }

    @Override
    public int getZustandsnote() {
        return 0;
    }

    @Override
    public String toString() {
        return "Oldtimer {" +
                "Sammlerwert=" + sammlerWert +
                ", Zustandsnote=" + zustandsNote +
                super.toString();
    }
}
