package iut.tdd;

public class Convert {
	public String num2text(String input) {
		int taille=input.length();
		String result="";
		while (taille>0){
			char l=input.charAt(0);
			if (taille==4){
				result="mille";
			}else if(taille==3){
				result="cent";
			}else if(taille==2){
				char l2=input.charAt(1);
				if (l=='1'){
					if (l2=='1'){
						result="onze";
					}else if (l2=='2'){
						result="douze";
					}else if (l2=='3'){
						result="treize";
					}else if (l2=='4'){
						result="quatorze";
					}else if (l2=='5'){
						result="quinze";
					}else if (l2=='6'){
						result="seize";
					}else{
						result="dix";
					}
				}else if (l=='2'){
					result="vinght";
				}else if (l=='3'){
					result="trente";
				}else if (l=='4'){
					result="quarente";
				} if (l=='6'){
					result="soixante";
				}else if (l=='7'){
					if (l2=='1'){
						result="soixante-et-onze";
					}else if (l2=='2'){
						result="soixante-douze";
					}else if (l2=='3'){
						result="soixante-treize";
					}else if (l2=='4'){
						result="soixante-quatorze";
					}else if (l2=='5'){
						result="soixante-quinze";
					}else if (l2=='6'){
						result="soixante-seize";
					}else{
						result="soixante-dix";
					}
				}else if (l=='8'){
					result="quatre-vinght";
				}else if (l=='9'){
					if (l2=='1'){
						result="quatre-vinght-onze";
					}else if (l2=='2'){
						result="quatre-vinght-douze";
					}else if (l2=='3'){
						result="quatre-vinght-treize";
					}else if (l2=='4'){
						result="quatre-vinght-quatorze";
					}else if (l2=='5'){
						result="quatre-vinght-quinze";
					}else if (l2=='6'){
						result="quatre-vinght-seize";
					}else{
						result="quatre-vinght-dix";
					}
				}
			}else if (taille==1){
				if (l=='0'){
					result="zero";
				}else if (l=='1'){
					result="un";
				}else if (l=='2'){
					result="deux";
				}else if (l=='3'){
					result="trois";
				}else if (l=='4'){
					result="quatre";
				}else if (l=='5'){
					result="cinq";
				}else if (l=='6'){
					result="six";
				}else if (l=='7'){
					result="sept";
				}else if (l=='8'){
					result="huit";
				}else if (l=='9'){
					result="neuf";
				}
			}
			taille=taille-1;
			return result;
		}
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}