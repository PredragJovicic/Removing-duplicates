
# Uklanjanje duplikata iz niza

## Objasnjenje:

 Ulaz je uradjen preko klase Scanner. Po unosu provera se dali je unos broj, ako jeste poziva se metoda
 removeduplicates(List<Double> list), ako je slovo izlazi se iz programa( to sam stavio samo radi lakseg izlaska iz programa, u pravom
 programu bi upozorio na gresku i cekao novi unos). Posto je jedan ulaz, najjednostavnije je uzeti ulaze kao double ( jer double prihvata
 i integer) i dodati ih u niz List<Double> list = new ArrayList<Double>(). Zatim se poziva metoda removeduplicates(List<Double> list) za
 uklanjanje duplikata iz niza. Ona radi tako sto kreira jos jedan niz i sve clanove prvog niza prekopira u taj niz
 List<Double> mylist = list. Zatim preko dve for petlje poredi svaki clan prvog niza sa svim clanovima istog niza, zato je prvi uslov
 da su indeksi i - j if(i != j) razliciti, znaci poredi vrednost na odredjenom indeksu sa vrednostima niza na ostalim indeksima. Ako nadje
 istu vrednost ukloni je iz drugog niza mylist.remove(j), ne iz prvog List<Double> list jer bi to poremetilo raspored indeka
 u prvom nizu i broj clanova niza, sto bi dovelo do prekoracenja i i j, i izazvalo fatal error. Ovo moze da se uradi i sa jednim nizom ali se
 koristi klasa Iterator koja proverava dali ima sledeceg clana u nizu a ne duzinu niza.
 Niz stringova List<String> valuefordisplay sluzi samo za formatiranje izlaza, da skloni tacku i nulu sa vrednosti
 ( 3.0 prikazuje kao 3), posto vidim u outputima u pdf-u da tako izgleda.
 Posto sa ulaza stizu i celi i decimalni brojevi metod prepoznaje da je 2.0 i 2 ista vrednost tako da ako u nizu postoji 2 i vi umesete
 2.0, 2.0 bice sklonjeno kao duplikat.
