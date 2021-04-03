import java.util.Scanner;
public class ExercicioExtra6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int voto, totVoto=0, cand1=0, cand2=0, cand3=0, cand4=0, cand5=0;
		
		System.out.println("Digite os votos:");
		voto = input.nextInt();
		
		while (voto != 0) {
			voto = input.nextInt();
			totVoto++;
			
			if(voto == 1) {
				cand1++;
			}else if(voto == 2) {
				cand2++;
			}else if(voto == 3) {
				cand3++;
			}else if(voto == 4) {
				cand4++;
			}else {
				cand5++;
			}
		}
		System.out.println("O total de votos foi "+totVoto);
		
		cand1 = percent(cand1, totVoto);
		cand2 = percent(cand2, totVoto);
		cand3 = percent(cand3, totVoto);
		cand4 = percent(cand4, totVoto);
		cand5 = percent(cand5, totVoto);
		
		System.out.print("Candidato 1: "+cand1+"% "+"Candidato 2: "+cand2+"% "+"Candidato 3: "+cand3+"% ");
		System.out.print("Candidato 4: "+cand4+"% "+"Candidato 5: "+cand5+"% ");
	}
	static int percent(int votos, int tot) {
		int percentual = (votos*100)/tot;
		return percentual;
	}
}
