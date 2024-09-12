# Sportschool Management Systeem

Een desktopapplicatie voor het beheren van een sportschool met Java Swing. De applicatie biedt een interface voor gebruikers om hun sportschooltoegang te beheren, in te schrijven voor cursussen, afspraken te maken met personal coaches en abonnementen te annuleren.

## Inhoud

- [Functies](#functies)
- [Voorvereisten](#voorvereisten)
- [Installatie](#installatie)
- [Gebruik](#gebruik)
- [Code Conventies](#conventies)
- [Bijdragen](#bijdragen)
- [Licentie](#licentie)

## Functies

- **Toegang sportschool**: Laat de gebruiker zien hoeveel toegang ze hebben op basis van hun abonnementstype.
- **Inschrijven cursus**: Gebruikers kunnen zich inschrijven voor verschillende cursussen zoals Yoga, Pilates en Paaldansen.
- **Afspraak personal coach**: Maak afspraken door een datum en tijd in te voeren.
- **Abonnement annuleren**: Annuleer een abonnement met bevestiging.

## Conventies
  - Bestandsnamen: Gebruik CamelCase voor bestandsnamen. Bijvoorbeeld: Main.java, StartWindow.java, Styling.java.
  - Indentatie: Gebruik vier spaties per indentatieniveau. Vermijd het gebruik van tabs.
  - Klassennaam: Gebruik CamelCase voor klassenamen, beginnend met een hoofdletter. Bijvoorbeeld: Main, StartWindow, Styling.
  - Hoofdklasse: De hoofdklasse van een project moet de naam van het project volgen en in CamelCase zijn. Bijvoorbeeld: Main.
  - Methodenaam: Gebruik camelCase voor methodennamen, beginnend met een kleine letter. Bijvoorbeeld: showAccessLeft, applyButtonStyle.
  - Methoden: Methoden moeten duidelijk omschrijven wat ze doen en zouden idealiter niet langer moeten zijn dan 50 regels.
  - Instantievariabelen: Gebruik camelCase voor instantievariabelen, beginnend met een kleine letter. Bijvoorbeeld: abonnementType, panel.
  - Lokaal: Gebruik camelCase voor lokale variabelen in methoden. Bijvoorbeeld: datumField, gekozenDatum.
  - Constanten: Gebruik hoofdletters met underscores voor constanten. Bijvoorbeeld: MAX_ATTEMPTS, DEFAULT_DATE_FORMAT.
  - Commentaar: Voeg nuttige commentaren toe om de functionaliteit van complexe code te verduidelijken. Gebruik Javadoc voor documentatie van klassen en methoden.
  - Overbodige Commentaren: Vermijd overbodige commentaren die de code alleen maar herhalen. Gebruik commentaren om te verduidelijken, niet om te verklaren wat de code al doet.
  - Imports: Groepeer imports op alfabetische volgorde. Verwijder ongebruikte imports om de code schoon en overzichtelijk te houden.
  - Regellengte: Houd de lengte van een regel tot maximaal 120 tekens om de leesbaarheid te verbeteren.
  - Lege Regels: Gebruik lege regels om logische secties van de code te scheiden. Bijvoorbeeld, tussen methoden of na een klasse-declaratie.
  - Exception Namen: Gebruik duidelijke namen voor je eigen gemaakte exceptions, en gebruik CamelCase. Bijvoorbeeld: InvalidDateFormatException.
  - Exception Handling: Vang specifieke exceptions in plaats van generieke Exception. Dit helpt bij het oplossen van problemen en maakt de code robuuster.

## Voorvereisten

Om dit project uit te voeren, heb je het volgende nodig:

- Java Development Kit (JDK) versie 8 of hoger
- Maven (voor het beheren van afhankelijkheden)

