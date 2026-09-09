# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* s123456, s123456@oslomet.no
* ...

## Arbeidsfordeling
I oppgaven har vi hatt følgende arbeidsfordeling:
* s123456 har hatt hovedansvar for oppgave 1, 3, og 5.
* s612345 har hatt hovedansvar for oppgave 2, 4, og 6.
* s561234 har hatt hjulpet til med oppgave 2, 4, 5, og hatt hovedansvar for 7.
* s456123 har hatt hovedansvar for oppgave 8, og 9.
* Vi har gjort oppgave 10 felles.

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

(a) Det blir n - 1 sammenligninger. Grunnen er at vi sammenligner hvert tall med tallet som kommer etter. Hvis tabellen har 5 tall, blir det derfor 4 sammenligninger.

(b) Det blir færrest ombyttinger når tabellen allerede er sortert stigende, for eksempel {1, 2, 3, 4, 5}. Da er tallet til venstre aldri større enn tallet til høyre, og vi får derfor 0 ombyttinger.

(c) Det blir flest ombyttinger når det største tallet ligger først i tabellen. Da må det største tallet bytte plass med hvert tall det møter på vei mot slutten. Det blir derfor n − 1 ombyttinger.

(d) For å finne gjennomsnittlig antall ombyttinger kan vi teste metoden på mange tilfeldige tabeller. Da ser vi at gjennomsnittet følger formelen n - Hₙ, der Hₙ er summen 1 + 1/2 + 1/3 + ... + 1/n. Dette betyr at antall ombyttinger i gjennomsnitt blir litt mindre enn n.



### Oppgave 2
I oppgave 2 gikk jeg frem ved og først lage en if-setning som sjekker om tabellen er tom, og hvis den er tom skal jeg returnere 0. 
Videre opretter jeg en telle-variabel int antall som starter på 1. 