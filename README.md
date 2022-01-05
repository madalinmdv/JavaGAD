## JavaGAD
## Design pattern - projects
### Acest repository cuprinde Code Challange-urile lucrate lucrate la cursurile oferite de Atelierul Digital pentru Programatori - Java. De asemenea, am urcat proiectul final, prezentand 2 Design Pattern-uri, cat si un "use-case" pentru acestea.


Primul design pattern abordat este *Memento*.
In cazul dat avem un editor de text, care necesita implementarea functiei de Undo. In acest caz ma folosesc de un design pattern de tip Memento.
Acesta permite utilizatorului sa adauge atributii ulterioare editorului/programului care sa poata sa foloseasca functia de Undo.

Al doilea design pattern ales de mine este Adapter. Acesta este folosit pentru a converti interfata unei clase.
In cazul de fata, vorbim despre o aplicatie care aplica diferite filtre asupra imaginilor. La aceasta adaugam prin absurd un package cu mulitiple filtre. Dar, incercand sa folosim unul din filtrele respective vom avea o eroare de compliare, intrucat interfata acestora nu corespunde cu 
"apply" method. Aceasta asteapta  clasa respectiva sa implementeaze interfata "Filtru", caz in care este necesara implementarea pattern-ului Adapter.
In cazul de fata am luat ca exemplu filtrul Retro, pentru care am creat o clasa "RetroAdapter" care sa implementeze interfata "Filtru" si in interiorul careia avem un obiect de tip Retro, astfel incat sa poata fii folosit.