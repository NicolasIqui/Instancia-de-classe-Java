import java.util.Random;
public class classemetodo{
    Random random=new Random();

    public Votacao[]Fcadastravotacao(Votacao[] votacao){
        for(int i=0;i<5;i++){
            votacao[i].numeroSecao=random.NextInt(11);
            votacao[i].numCandidato=random.NextInt(301);                                                
        }
    }
    public String FClassificasecao(Votacao[]votacao){
        Votacao v;
        for(int i=0;i<4;i++){
            for(int j=j+i;j<5;j++){ 
                if(votacao[i].numeroSecao>votacao[j].numeroSecao){
                    v=votacao[i];
                    votacao[i]=votacao[j];
                    votacao[j]=v;
                }
            }
        }
    }
     public void consultaVotacao(Votacao[] votacao){
        for (int i=0;i<5;i++){
            JOptionPane.showMessageDialog(null, "a Votacao " +(i+1)+ " teve estas secoes " +votacao[i].numeroSecao+ " " );
        
        }
    }
    
}

