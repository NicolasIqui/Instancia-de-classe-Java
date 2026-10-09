import java.util.Random;
public class classemetodo{
    Random random=new Random();

    public Votacao[]Fcadastravotacao(Votacao[] votacao){
        for(int i=0;i<5;i++){
            votacao[i].numeroSecao=random.NextInt(11);
            votacao[i].numCandidato=random.NextInt(301);
        }
    }
}