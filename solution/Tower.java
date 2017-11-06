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
}
