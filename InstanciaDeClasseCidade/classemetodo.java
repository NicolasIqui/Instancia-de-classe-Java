package InstanciaDeClasseCidade;
import javax.swing.JOptionPane;
import java.util.Random;
public class classemetodo {
 
    public Cidade[]FCADASTRA(Cidade[]cidade){
        Random random = new Random();

        for (int i=0;i<3;i++){
            cidade[i].codcidade=random.nextInt(1000)+1;
            cidade[i].nNomeCidade=JOptionPane.showInputDialog("digite o nome da cidade");
            cidade[i].qqtdAcidentes=random.nextInt(700)+1;
        }
        return cidade;
    }
    public void consultaCidadeacidente(Cidade[] cidade){
        for (int i=0;i<3;i++){
                if(cidade[i].qqtdAcidentes>=100 && cidade[i].qqtdAcidentes<=500){
                    JOptionPane.showMessageDialog(null, "a cidade " +(i+1)+ " teve " +cidade[i].qqtdAcidentes+ " ficando dentro do intervalo" );
            }
        }
    }
    public void consultaCidadeacidenteteste(Cidade[] cidade){
        for (int i=0;i<3;i++){
            JOptionPane.showMessageDialog(null, "a cidade " +(i+1)+ " teve " +cidade[i].qqtdAcidentes+ " ficando dentro do intervalo" );
            
        }
    }
    public void consultaCidadeMedia(Cidade[] cidade) {
       double media=0;
        for(int i=0;i<3;i++){
        media=media+cidade[i].qqtdAcidentes;
       } 
       media=media/3;
       for(int i=0;i<3;i++){
        if(cidade[i].qqtdAcidentes>media){
            JOptionPane.showMessageDialog(null, "a cidade " +(i+1)+ "esta acima da media de acidente das cidades " );
        }
       }
    }
 
    public void bubbleSortCidade(Cidade[] cidade) {
    Cidade c;

    for (int i = 0; i < 3 - 1; i++) {
        for (int j = i + 1; j < 3; j++) {
            if (cidade[i].qqtdAcidentes > cidade[j].qqtdAcidentes) {
                c = cidade[i];
                cidade[i] = cidade[j];
                cidade[j] = c;
            }
        }
    }    
    JOptionPane.showMessageDialog(null, "a cidade com menor  quantidade de acidentes foi "+cidade[0].qqtdAcidentes );
    JOptionPane.showMessageDialog(null, "a cidade com maior quantidade de acidentes foi "+cidade[2].qqtdAcidentes );
}
}
