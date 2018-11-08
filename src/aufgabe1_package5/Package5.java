package aufgabe1_package5;

public class Package5 {

    public static void main (String args[])
    {

        /*Ausgabe mit doppelten Anführungszeichen*/

        System.out.println("JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen\n" +
                "wie 'c' um einzelne Zeichen zu definieren");

        /*Ausgabe mit doppel Backslash*/

        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");

        /*Ausgabemit \b Backspace, die Newline\n und den \tTabulator*/

        System.out.println("Ich verwende den\\b Backspace, die Newline\\n und den \\tTabulator");

        /*Ausgabe mit Wagenrücklauf*/

        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "diebestehendeZeile.\\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt.");
    }
}
