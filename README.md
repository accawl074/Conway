# Conway-Simulator ( Jeux de la vie de CONWAY)

- Une cellule morte possédant exactement trois voisines vivantes devient vivante (elle naît).
- Une cellule vivante possédant deux ou trois voisines vivantes le reste, sinon elle meurt.
- [Source](https://fr.wikipedia.org/wiki/Jeu_de_la_viem)

# Fichier d'entrée :
-	Dans ce programme les données sont chargé à partir d'un fichier texte (src/main/resources/demo.text)
-	Le fichier contient 3 lignes
-	La première ligne c'est la dimension, dans notre cas on manipule des table ayant nombre de lignes = nombre de colonnes. ( ex : valeur dans le fichier = 2, donc il s'agit de la dimension 2x2)
-	La deuxième ligne concerne le nombre d'évolution qu'on souhaite affiché, (exemple : nombre d'évolutions = 4 ) on aura dans l'affichage 5 grilles, une première avec les données entrées et les trois qui suivent présentent les états transitoires et la cinquième présente l'état finale.
-	La troisième ligne contient les données, les lignes de cellules sont séparé par une virgule "," et les cellules sont séparées par des espaces.


# Exemple de résultat pour une grille 8x8 :
voir : [src/main/resources/output-example](https://github.com/accawl074/Conway/blob/master/src/main/resources/output-example)

## Building 


    ./mvn clean install
    
 
