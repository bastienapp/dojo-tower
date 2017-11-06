# Tower

Dessiner une tour de N étages, en commençant par le sommet et en allant jusqu’à la base, les étages étant centrés (voir exemples ci-dessous).
La tour doit être représentée sous la forme d'un tableau, ou chaque étage est une chaîne de caractères. La méthode prendra le nombre d’étages en paramètre.

*Exemples :*

Tour de 2 étages :

	 *
	***

Tour de 5 étages :

	    *
	   ***
	  *****
	 *******
	*********

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar TowerTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TowerTest