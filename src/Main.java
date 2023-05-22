import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner PlayGame = new Scanner(System.in);
        String playagain = "y";
        while (Objects.equals(playagain, "y")) {
            guess();
            System.out.println("Would you like to play again? y/n");
            playagain = PlayGame.nextLine();
        }
    }
    static void guess() {
        Scanner GetInput = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 1000);

        int i = 0;
        while (i < 10) {
            System.out.println("Enter a number 0-1000");
            int userinput = GetInput.nextInt();
            if (userinput < 0 || userinput > 1000) {
                System.out.println("Not a valid number!");
                i--;
            } else if (userinput == randomNum) {
                System.out.println("Congratulations, you guessed the correct number!");
                break;
            } else if (userinput < randomNum) {
                System.out.println("The number is higher");
            } else
                System.out.println("The number is lower");
            i++;
        }
        if (i == 10) {
            System.out.println("You didn't guess the number within 10 tries! The number was " + randomNum);
        }
    }
}

/*
Oefening: Raad-het-getal
Omschrijving
In deze oefening ga je werken met variabele en logica.
Je gaat een programma schrijven waar het programma een random getal kiest tussen de 0 en 1000.
Hierna krijgt de gebruiker 10 beurten om het getal te raden.
Na iedere gok geeft het programma terug of het random getal hoger of lager is dan de gok van de gebruiker.

Opdracht
Stap 1: Laat het programma een random getal tussen de 0 en 1000 kiezen.
Stap 2: Vraag aan de gebruiker om input van een getal.
Stap 3: Geef feedback aan de gebruiker: moet die hoger of lager raden? Of is het al goed?.
Stap 4: Zorg dat het programma de gebruiker 10 beurten geeft om het getal te raden. Als de gebruiker het getal heeft geraden dan stopt het programma. Als de gebruiker na 10 beurten het getal niet heeft geraden dan stopt het programma krijgt de gebruiker het getal te zien.
(Optioneel) stap 5: Zorg dat de gebruiker opnieuw kan spelen zonder het programma opnieuw op te starten.

Bronnen
Java Math
Java If ... Else
Java While Loop
Java User Input (Scanner class)
Java Break and Continue
*/