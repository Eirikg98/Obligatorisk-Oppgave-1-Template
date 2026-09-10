# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* eigus6527  // eigus6527@oslomet.no
* ...

## Arbeidsfordeling
Jeg har jobbet alene, så har gjort alle oppgavene selv. Det er 0,1,2,3,4,5,6 og 8. 
## Oppgavebeskrivelser

### Oppgave 0

I oppgave 0 skulle jeg returnere antall gruppe-medlemmmer. Der returnerte jeg 1, siden jeg jobber alene. 

### Oppgave 1
Jeg startet med å sjekke om tabellen er tom ved hjelp av en if-setning. Hvis tabellen er tom, kastes en NoSuchElementException. 
Deretter bruker jeg en for-løkke som går gjennom tabellen og sammenligner to naboverdier om gangen. 
Hvis verdien til venstre er større enn verdien til høyre, bytter de plass ved hjelp av en midlertidig variabel (temp). 
På denne måten flyttes den største verdien stegvis mot slutten av tabellen. 
Etter at løkken er ferdig, ligger den største verdien bakerst og kan returneres.

Metoden ombyttinger() bruker den samme algoritmen, men har i tillegg en teller som økes hver gang to verdier bytter plass. 
Til slutt returneres antall ombyttinger.

For å undersøke antall ombyttinger testet jeg ombyttinger() på forskjellige tilfeldige permutasjoner av tallene fra 1 til n. 
Jeg sammenlignet resultatene for å se når det ble færrest og flest ombyttinger, og for å få en indikasjon på hvor mange ombyttinger det blir i gjennomsnitt.



### Oppgave 2

I oppgave 2 gikk jeg frem ved å først lage en if-setning som sjekker om tabellen er tom. Hvis den er tom, returnerer metoden 0.
Videre oppretter jeg en tellevariabel int antall som starter på 1, siden det første tallet i en ikke-tom tabell alltid teller som én ulik verdi.
Deretter går jeg gjennom tabellen med en for-løkke og sammenligner hvert tall med tallet som kommer etter.
Hvis et tall er større enn det neste tallet, betyr det at tabellen ikke er sortert stigende, og da kastes en IllegalStateException.
Hvis to nabotall er forskjellige, økes telleren med 1. Til slutt returneres antall ulike verdier i tabellen.

### Oppgave 3

I oppgave 3 skulle jeg finne antall ulike verdier i en usortert tabell.
Jeg starter med en teller antall som er 0. Deretter går jeg gjennom hele tabellen med en for-løkke.
For hvert tall bruker jeg en ny for-løkke som sjekker alle verdiene som står tidligere i tabellen.
Hvis den samme verdien allerede finnes, setter jeg en boolean-variabel til true.
Hvis verdien ikke er funnet tidligere, økes antall med 1. Til slutt returneres antall forskjellige verdier.

### Oppgave 4

I oppgave 4 skulle jeg sortere en bestemt del av en tabell.
Jeg starter med å sjekke om fra er negativ eller om til er større enn lengden på tabellen. Hvis dette skjer, kastes en IndexOutOfBoundsException.
Hvis fra er større enn eller lik til, gjør metoden ingenting.
For å sortere bruker jeg kvikksortering. Jeg velger først en pivot fra midten av området og flytter denne til slutten.
Deretter deler jeg området slik at verdier mindre enn pivot kommer på venstre side, mens større eller like verdier kommer på høyre side.
Til slutt blir de to delene sortert videre ved hjelp av rekursjon.

### Oppgave 5

I oppgave 5 skulle jeg dele tabellen slik at alle oddetall kommer først og alle partall kommer etterpå.
Jeg bruker to variabler, en som starter fra venstre side av tabellen og en som starter fra høyre side.
Fra venstre går jeg videre så lenge jeg finner oddetall, og fra høyre går jeg bakover så lenge jeg finner partall.
Hvis jeg finner et partall på venstre side og et oddetall på høyre side, bytter de plass.
Når alle oddetall og partall er delt, bruker jeg sorter() fra oppgave 4 på hver del av tabellen.
På denne måten blir oddetallene sortert først og partallene sortert etterpå.

### Oppgave 6

I oppgave 6 skulle jeg rotere en char-tabell ett steg mot høyre.
Jeg starter med å sjekke om tabellen har 0 eller 1 element. I så fall trenger metoden ikke å gjøre noe.
Deretter lagrer jeg det siste elementet i en midlertidig variabel.
Så går jeg baklengs gjennom tabellen og flytter hvert element én plass mot høyre.
Til slutt legger jeg det siste elementet på første plass i tabellen.

### Oppgave 8a

I oppgave 8a skulle jeg flette sammen to strenger.
Jeg går gjennom begge strengene samtidig og legger først inn ett tegn fra den første strengen og deretter ett tegn fra den andre.
Dette fortsetter så lenge begge strengene har tegn igjen.
Hvis den ene strengen er lengre enn den andre, legges resten av tegnene fra denne strengen til slutt.
Til slutt returneres den ferdig flettede strengen.

### Oppgave 8b 

I oppgave 8b skulle jeg flette sammen et vilkårlig antall strenger.
Jeg starter med å finne lengden på den lengste strengen.
Deretter bruker jeg en dobbel for-løkke. Den ytre løkken går gjennom bokstavposisjonene, mens den indre løkken går gjennom alle strengene.
Hvis en streng har et tegn på den aktuelle posisjonen, legges dette tegnet til resultatet.
Hvis strengen er kortere og ikke har flere tegn igjen, blir den hoppet over. Til slutt returneres den ferdig flettede strengen. 