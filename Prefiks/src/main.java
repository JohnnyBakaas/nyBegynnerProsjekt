
public class main {

	public static void main(String[] args) {
		
		String[] liste = {"apelsin", "ape", "apekatt", "ape"};
		int lengdeAvKortesteOrd = liste[0].length();
		for (int i=0; i < liste.length; i++) {
			if (lengdeAvKortesteOrd > liste[i].length()) {
				lengdeAvKortesteOrd = liste[i].length();
			} 
		}
		
		int lengdeFelles = 0;
		boolean giFaen = true;
		
		
		for (int i=0; i < lengdeAvKortesteOrd; i++) {
			if (giFaen) {
					for (int j=0; j < liste.length; j++) {
					if (liste[j].charAt(i) == liste[0].charAt(i)) {
						lengdeFelles += 1;
					} else {
						giFaen = false;
						break;
					}
				}
			}
		}
		
		int endeligFelles = lengdeFelles / liste.length;
		System.out.println(endeligFelles);
		System.out.println("Den lengste prefixen er: '" + liste[0].substring(0, endeligFelles) + "' og den er " + endeligFelles + " bokstaver lang");
	}
}