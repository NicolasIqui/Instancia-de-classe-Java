package InstanciaDeClasseCidade;
class Cidade{

    int codcidade;
    String nNomeCidade;
    int qqtdAcidentes;

    Cidade(){
        this(0,"",0);
    }
    Cidade(int codigodacidade,String NomeCidade,int qtdAcidentes){
     codcidade=codigodacidade;
     nNomeCidade=NomeCidade;
     qqtdAcidentes=qtdAcidentes; 
    }

}