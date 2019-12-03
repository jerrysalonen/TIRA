# Verkkoalgoritmi

## PageRank

Googlen algoritmi, jolla lasketaan hakutulosten järjestystä. Perustuu sivujen ristiinlinkitykseen. 

Oletetaan, että hakutulokset ovat sivut A, B ja C. Kaikki saavat aluksi arvokseen yksi jaettuna tulosten lukumäärällä, eli tässä tapauksessa 0,33. Jos mikään sivu ei linkitä toiseen, kaikki pitävät arvon 0,33. Jos jonkun sivun linkkejä on muilla sivuilla, tämän sivun linkin arvoon lisätään (linkittäneen sivun arvo / linkkien määrä kaikkiin sivuihin). 

Eli jos sivut A, B sisältävät linkin sivuun C, C:n arvoksi tulee (0.33/1 + 0.33/1). Jos taas A ja B sisältäisivät linkin sivuun C ja B sisältäisi linkin myös sivuun A, C:n arvoksi tulee (0.33/1 + 0.33/2).
