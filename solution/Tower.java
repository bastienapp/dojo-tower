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
	public static String[] buildTowerVariable(int nbEtage){
		String[] tower = new String[nbEtage];
		int nbEtoile=1;
		for(int i = 1; i<=nbEtage; i++) {
			String etage="";

			for(int j = 0; j< nbEtage - i; j++){
				etage += " ";
			}

			for(int j=0;j<nbEtoile;j++){
				etage += "*";
			}
			
			for(int j = 0; j< nbEtage - i; j++){
				etage += " ";
			}

			tower[i-1] = etage;

			nbEtoile+=2;
		}
		return tower;
	}
	
	public static String[] buildTowerBiLoop (int n) {

		String[] tower = new String [n];

		for (int i = 0; i < n; i++) {
			String level = "";
			for (int j = 0; j < (2*n -1); j++) {
				if ((j < n - 1 - i) || (j >= n + i)) {
					level += " ";
				} else {
					level += "*";
				}
			}
			tower[i] = level;	
		}
		return tower;
	}
	
}
