# Java Collections API säiliöt.

**1. Järjestetty: Kaikki List-rajapinnan toteuttavat luokat (ArrayList, LinkedList), LinkedHashSet, TreeSet, LinkedHashMap, TreeHashMap**

List ja ArrayList luokkien metodi get(int index) paljastaa, että kyseessä on järjestetty lista. LinkedHashSet ja LinkedHashMap ovat HashSetin ja HashMapin alaluokkia, jotka tarjoavat järjestyksen. Järjestys perustuu siihen, että linked-list tallennustavassa elementit tietävät seuraavan elementtinsä (ja joskus myös edellisenkin, jos kyseessä on kaksisuuntainen linked-list). TreeSet ja TreeHashMap ovat NavigableSetin ja NavigableMapin alaluokkia, jotka tarjoavat myös järjestyksen. Järjestys vaaditaan Tree-toteutuksiin. Treen ominaisuus on nopea elementtien etsintä.

**2. Järjestemätön: HashSet, HashMap**

Järjestystä ei välttämättä tarvita, sillä Hash-pohjaisissa toteutuksissa arvoon päästään käsiksi avaimen kautta. HashSet toimii HashMapilla, johon tallennetaan avaimena tallennettavasta esineestä laskettu hash-arvo, joten etsintä listasta tapahtuu tallennetun esineen avulla ja HashMapissa ohjelmoija itse päättää avaimen.

**3a. Ei salli duplikaatteja: Kaikki Set-rajapinnan toteuttavat luokat**

Set rajapinta on mallinnettu tarkoituksella siten, että duplikaatteja ei sallita. Nimi Set viittaakin matematiikasta tuttuun konseptiin: joukko (eng. set), jossa on vain yksilöiviä alkioita.

**3b. Sallii duplikaatteja: Kaikki muut, kuin Set-rajapinnan toteuttavat luokat**

Huomioitavaa on kuitenkin se, että vaikka Map salliikin duplikaatteja arvoissa, se ei salli duplikaatteja arvoihin viittaavissa avaimissa.
