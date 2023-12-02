public abstract class Questao implements IQuestao
{
    protected static int contador = 1;
    protected int idQuestao;
    protected String enunciado;
    protected String opcaoA;
    protected String opcaoB;
    protected String opcaoC;
    protected double notaPadrao;
    protected double notaObtida;
    
    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }
    
    public void setOpcaoA(String opcaoA){
        this.opcaoA = opcaoA;
    }
    
    public void setOpcaoB(String opcaoB){
        this.opcaoB = opcaoB;
    }
    
    public void setOpcaoC(String opcaoC){
        this.opcaoC = opcaoC;
    }
    
    public void setNotaPadrao(double notaPadrao){
        this.notaPadrao = notaPadrao;
    }
}