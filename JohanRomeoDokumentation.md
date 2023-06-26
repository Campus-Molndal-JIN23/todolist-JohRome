# Ditt namn
Johan Romeo

## Egna reflektioner
 - Bra att använda sig av det vi har gått igenom i alla kurser och sätta samman det till ett projekt. 
 - Väldigt lärorikt och inspirerande att få se på sina klasskamraters projekt och hur de har löst uppgiften. Det lär jag mig mycket utav.
 - Att även få arbetet godkänt av andra samt att godkänna själv är något jag tycker är viktigt för framtiden och för personlig utveckling.

## Projektet

### Beskrivning av projektet
Jag har skapat ett program som låter användaren skapa todo-lappar som sedan skickas upp till en MongoDB databas.
Användaren kan utföra CRUD(L) operationer mot databasen via programmet.
### Vad du har gjort
Efter som detta var en enskild uppgift så har jag gjort allting själv.
Allt ifrån planering till implementation och testning.
## Planering

### Lösningsförslag innan uppgiften påbörjas
Då allt gick åt fanders bestämde jag mig för att göra om det. Det som gick snett för mig tidigare är att jag har en förmåga att göra saker svårt för mig själv. Jag bortser från MVP och när jag fastnar tar det tid.

#### Skisser (exempelvis)
Skisser på (ej uppdaterat) UML-diagram, flödesschema samt ERD finns i mappen Planning

#### Hur du tänker försöka lösa uppgiften.(exempelvis)
Jag kommer att utgå ifrån samma Product Backlog som jag hade innan och plocka ut user stories till mina sprintar och arbeta därefter. Jag tänker börja med att lägga till alla nödvändiga klasser, ToDo, en klass som hanterar MongoDB och dess CRUD(L) implementation samt en facad klass som kallar dess metoder och köra tester. Därefter, om tid finns, kommer jag lägga till ytterligare klasser för att göra programmet bättre
#### Pseudokod.(exempelvis)

#### Diagram.(exempelvis)
Diagram finns i Planning mappen. UML ej relevant. Stress och tidsbrist och annat i livet gör det svårt att
### Jira/Trello/Github Project och projekthantering enligt Scrum/Kanban
Jag kör med Jira Software och använder mig av en SCRUM mall. Bild på detta finns i mappen Planning
## Arbetet och dess genomförande
Jag började att skissa ner hur jag trodde programmet skulle se ut och skissade upp flödesschema och UML diagram. UML-diagrammet visade sig senare vara riktigt genomtänkt så jag fick vid senare skede
göra om programmet på ett enklare sätt.
Jag gjorde ett interface som sade åt vilka metoder som bör finnas för att utföra CRUD(L) operationer och jag skapade sedan klasser för att implementera dessa.
Jag skapade en klass som hanterar input från användaren och en klass som hanterar output till användaren och satte samman dessa i en Application klass som kör programmet.
### Vad som varit svårt
Att påminnas om hur snabbt man glömmer bort hur man skriver kod, exempelvis implementering av CRUD(L) operationer mot MongoDB.
### Beskriv lite olika lösningar du gjort
Jag har skapat enklare lösningar åt användare så att denne kan skapa, läsa, uppdatera och ta bort todo-lappar från MongoDB:n.
Via en Output klass kan användaren få se utskrift på skärmen. Detta gör att frontend inte beblandas med backend. Något som Marcus har varit på om.
### Beskriv något som var besvärligt att få till
Att få till de olika testerna, just mot Input klassen.
Den var besvärlig eftersom det var många nya begrepp som jag inte var bekant med. 

### Beskriv om du fått byta lösning och varför i sådana fall
Första programmet jag gjorde hade en klass som implementerade alla CRUD(L) operationer. Denna klass testades direkt och jag fick inte testerna att fungera eftersom jag hade satt upp allt fel och tänkt fel från första början.
Mycket lättare blev det senare när jag gjorde om programmet och skapade en klass för varje CRUD(L) operation och en fasadklass som hanterade dessa metoder för att sicka en todo till MongoDB.
## Reflektion & Slutsatser
Överlag är jag inte så nöjd över min insats. Livssituationer förändras, humöret är inte där det ska vara och lusten sviktar från och till. Detta bidrar till att jag inte kan ge mitt allt och därav resultatet.
Å andra sidan har jag fått prova på att använda mig utav Jira Software, där jag använde en SCRUM mall för planerande och utförande av projektet. Detta var en ny erfarenhet som jag kommer att ta med mig.
### Vad gick bra
När korta spurtar av glädje och längtan efter att få sitta och skriva kod kom så fick jag mycket gjort.
Jag är ganska nöjd över hur jag har delat upp alla klasser. Det är lätt att förstå vad som händer och var.
### Vad gick dåligt
Att inte kunna förstå hur programmet skulle byggas upp innan start gjorde mig lite osäker. Jag måste ta med mig en sak till nästa gång, och det är att gräva djupare i varje klass och förstå sambanden mellan klasser.
### Vad har du lärt dig
Jag har lärt om hur viktigt det är att inte göra det komplicerat för mig från början. Det sinkar ner mig och gör mig stressad.
Jag har även lärt mig att använda mig av Jira för att planera upp arbetet bättre (ironiskt nog). 
Något som var lite av en irritation var att det inte alls var lätt att testa Input klassen.
### Vad hade ni gjort annorlunda om ni gjort om projektet
Jag hade lagt en dag extra på att planera upp projektet och skriva ner alla klasser och deras metoder. Detta hade gjort det lättare för mig att förstå vad som skulle göras och hur.
Andas lite lära mig att försöka njuta av detta och försöka ha roligt på vägen. Det hade gynnat mig väldigt mycket.
### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Att ständigt ställas inför utmaningar gör att man växer som person. Jag lär mig och blir ständigt påmind om hur viktigt det är att repetera saker så de inte glöms bort.
Självklart är ju något väldigt positivt att jag har fått lära mig hur man använder Mockito och Junit5 för att utföra tester. Detta gör programmet bättre och mer robust.