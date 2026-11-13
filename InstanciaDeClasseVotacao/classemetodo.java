import java.util.Random;

public class classemetodo {
    Random random = new Random();

    public Votacao[] Fcadastravotacao(Votacao[] votacao) {
        int[]totalVotosCandidato=new int [300];
        int[]totalPorsecao=new int[10];
        int[]eleitoressecao=new int[10];
        for (int i = 0; i < 5; i++) {
            votacao[i].numeroSecao = random.nextInt(11);
            votacao[i].numCandidato = random.nextInt(301);

        int candidatoSorteado = votacao[i].numCandidato;
        int quantsecaoeleitores=votacao[i].numeroSecao;
        eleitoressecao[quantsecaoeleitores]++;
        totalVotosCandidato[candidatoSorteado]++;
        int quantSecao=votacao[i].numeroSecao;
        totalPorsecao[quantSecao]++;
        }
        return votacao;
    }
    public void secaoMaiormenor(Votacao[] votacao){
        int maiorSecaoEleitores=0;
        int menorSecaoEleitores=0;
        for(int i=0;i<5;i++){
            if(i==0){
             maiorSecaoEleitores=votacao[i].eleitoressecao[i];
            }
        }
    }



    public String FClassificasecao(Votacao[] votacao) {
        Votacao v;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (votacao[i].numeroSecao > votacao[j].numeroSecao) {
                    v = votacao[i];
                    votacao[i] = votacao[j];
                    votacao[j] = v;
                }
            }
        }
        return "classificacado";
    }

    public void consultaVotacao(Votacao[] votacao) {
        for (int i = 0; i < 5; i++) {

        }
    }

}
