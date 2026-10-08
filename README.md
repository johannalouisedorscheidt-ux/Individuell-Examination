1) Datasäkerhet/Inkapsling: Hur har du skyddat kontots uppgifter i din kod, 
och vad hade kunnat hända om du inte gjorde det?

Mitt svar: Jag har skyddat kontots uppgifter i min kod genom att jag har gjort (String name) och (Int balance)
private istället för public, annars hade man kunnat ändra kontots uppgifter direkt från Main. 

Istället har jag skapat upp metoder för att läsa saldot "getBalance()" eller ändra saldot deposit() och withdraw(). Om det skulle vara så att jag inte
hade använt mig av inkapsling så hade som jag nämnde ovan att Main eller andra klasser kunna ändra kontots uppgifter direkt. 
Det skulle bara leda till att saldot skulle kunna bli hur tokigt som helst.

2) Skapande-mönster (Factory): Varför skapas kontot via registrets metod istället för direkt ute i Main?

Mitt svar: Anledningen varför vi skapar upp konton via Account-register istället för direkt ute i Main är för att 
Account-register tar hand om konton som har skapats upp och informationen kring dom. Det leder till att Main
inte behöver ha det ansvaret och kan/ska bara fokusera på att ta emot och hantera inmatningen av val användaren gör i konsolen.

3) Flöde: Beskriv ett av menyvalen steg för steg (vad användaren matar in → vilket objekt som hanterar det → vilken metod som körs → vad som skrivs ut).

Mitt svar: Jag väljer för att beskriva steg för steg menyval 3. Det funkar genom att när användaren väljer 3 i menyvalet
för att i detta fallet sätta in pengar på kontot, då ber Main först om att användaren skriver in namnet på kontot hen vill skapa upp och ett startsaldo hen vill ha ifrån början. Vi tar ett simpelt exempel (250) som startsaldo.

Nu när ett konto med ett start saldo har skapats så sparas det i AccountRegister.java som har hand om att hitta kontot. 
I AccountRegister.java samlas alla konton som har sparats och läggs i en form av samlingslista (ArrayList).
Sedan så samarbetar AccountRegister och findAccount() metoden för att hitta rätt konto. 

Nu om användaren skulle vilja sätta in en insättning med saldo exempel (500), det som skulle hända härnäst är att Account hanterar saldots insättning och samarbetar med metoden deposit() 
som ändrar kontots saldo som var ifrån början till det nya saldot. Main hämtar sedan det nya saldots status genom found.getBalance() metoden. 

Det som händer till sist är att konsolen skriver ut resultatet av vad det nya saldot har blivit efter insättningen, exempelvis
att "Det nya saldot är: 750".


4) Reflektion (3–5 meningar): Hur gjorde du när du körde fast eller stötte på ett problem? Om du använde verktyg som AI, 
Google eller kursmaterial: ge ett konkret exempel på hur du tog hjälp för att förstå och lösa problemet själv.

Mitt svar: Det jag gjorde när jag körde fast var att jag i första hand provade själv att lösa det för att se om jag ändå kunde lösa detta på egen hand. 
Men om jag inte lyckades så frågade klasskamraterna när vi satt i en gemensam röstkanal. 

Jag hade redan skapat upp deposit() metoden som ska öka saldot vid val av insättning. Men problemet jag stötte på var att man kunde i programmet sätta in negativa belopp, vilket var ett val vi skulle förhindra användaren från att göra.

Jag hade även skapat upp withdraw() metoden som minskade på saldot när användaren gjorde ett val att ta ut pengar från kontot. 
Men ett annat problem jag stötte på var att man kunde antigen ta ut ett negativt belopp eller välja för att ta ut 0 kronor. 

Så det jag fick hjälp med av klasskamraterna handlade om hur jag skulle kunna lösa dom två problemen. 
Jag tyckte att jag lärde mig mycket av dom och vet nu till nästa gång hur jag ska hantera det problemet om jag skulle stötta på samma sak eller liknande under utbildningens gång. 

