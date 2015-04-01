package iut.tdd;

public class Convert {
	public String num2text(String input) {
		int taille=input.length();
		String result="";
		int i=0;
		while (taille>0){
			char l=input.charAt(i);
			if (taille==4){
				result+="mille";
			}else if(taille==3){
				result+="cent";
			}else if(taille==2){
				char l2=input.charAt(i+1);
				if (l=='1'){
					if (l2=='1'){
						result+="onze";
						taille=taille-1;
					}else if (l2=='2'){
						result+="douze";
						taille=taille-1;
					}else if (l2=='3'){
						result+="treize";
						taille=taille-1;
					}else if (l2=='4'){
						result+="quatorze";
						taille=taille-1;
					}else if (l2=='5'){
						result+="quinze";
						taille=taille-1;
					}else if (l2=='6'){
						result+="seize";
						taille=taille-1;
					}else{
						result+="dix";
					}
				}else if (l=='2'){
					result+="vinght";
				}else if (l=='3'){
					result+="trente";
				}else if (l=='4'){
					result+="quarente";
				} if (l=='6'){
					result+="soixante";
				}else if (l=='7'){
					if (l2=='1'){
						result+="soixante-et-onze";
						taille=taille-1;
					}else if (l2=='2'){
						result+="soixante-douze";
						taille=taille-1;
					}else if (l2=='3'){
						result+="soixante-treize";
						taille=taille-1;
					}else if (l2=='4'){
						result+="soixante-quatorze";
						taille=taille-1;
					}else if (l2=='5'){
						result+="soixante-quinze";
						taille=taille-1;
					}else if (l2=='6'){
						result+="soixante-seize";
						taille=taille-1;
					}else{
						result+="soixante-dix";
					}
				}else if (l=='8'){
					result+="quatre-vinght";
				}else if (l=='9'){
					if (l2=='1'){
						result+="quatre-vinght-onze";
						taille=taille-1;
					}else if (l2=='2'){
						result+="quatre-vinght-douze";
						taille=taille-1;
					}else if (l2=='3'){
						result+="quatre-vinght-treize";
						taille=taille-1;
					}else if (l2=='4'){
						result+="quatre-vinght-quatorze";
						taille=taille-1;
					}else if (l2=='5'){
						result+="quatre-vinght-quinze";
						taille=taille-1;
					}else if (l2=='6'){
						result+="quatre-vinght-seize";
						taille=taille-1;
					}else{
						result+="quatre-vinght-dix";
					}
				}
			}else if (taille==1){
				if (l=='0'){
					if (i==0){
						result="zero";
					}else{
						result=result.substring(0,result.length()-1);
					}
				}else if (l=='1'){
					result+="un";
				}else if (l=='2'){
					result+="deux";
				}else if (l=='3'){
					result+="trois";
				}else if (l=='4'){
					result+="quatre";
				}else if (l=='5'){
					result+="cinq";
				}else if (l=='6'){
					result+="six";
				}else if (l=='7'){
					result+="sept";
				}else if (l=='8'){
					result+="huit";
				}else if (l=='9'){
					result+="neuf";
				}
			}
			taille=taille-1;
			i=i+1;
			result+="-";
		}
		result=result.substring(0,result.length()-1);
		return result;
	}
	public static String text2num(String input) {
		return null;
	}
}