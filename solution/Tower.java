class Tower {
	
	public static String[] buildTower(int floor) {
		String[] tower = new String[floor];
		for (int i = 1; i <= floor; i++) {
			int nbBlanks = floor - i;
			String blanks = new String(new char[nbBlanks]).replace("\0", " ");
			int nbStars = i + (i - 1);
			String stars = new String(new char[nbStars]).replace("\0", "*");
			tower[i-1] = blanks + stars + blanks;
		}
		return tower;
	}
	
	public static String[] buildTowerLoops(int nbreEtages) {
		String[] tower = new String[nbreEtages];

		for (int i = 1; i <= tower.length; i++ ) {
			int nbEtoile = i + i -1;
			int nbEspace = nbreEtages - i;

			String espace = "";
			for(int j=0; j < nbEspace; j++){
				espace = espace + " ";
			}
			String etoile = "";
			for (int k=0; k < nbEtoile; k++){
				etoile = etoile + "*";
			}

			tower[i-1] = espace + etoile + espace;
		}
		return tower;
	}
}
