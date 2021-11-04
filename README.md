# oblig3

Vi startet med å opprette en workflow som github foreslo for oss. 
I dette tilfelle valgte vi en som het "Java with Maven", som sjekker sjekker at tester blir gjennomført og prosjektet satt opp riktig.
Denne "actionen" vil kun bli kjørt når man pusher en commit til "main" branchen. Dette skal igjen føre til at testene blir vist for hver commit. 
Kun ved å bruke denne fikk vi ikke opp testene i en egen tabb. 
Vi fikk heller ikke opp testene, fordi vi først manglet Maven surefire plugin. 
Etter å ha lagt inn denne plug-in'en i pom filen og pressisert at projektet var UTF8 "encodet", fikk vi opp test resultatene, men ikke som en egen tabb. 
Vi la derfor inn ett nytt "step" som hentet ut test rapporten fra Maven surefire plug-in'en og la den som en egen tabb. 
Når dette steget ble implemenmter, fikk vi opp test resultatene og byggingen av projektet som to separate tabber. 
