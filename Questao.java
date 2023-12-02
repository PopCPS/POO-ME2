public abstract class Questao implements IQuestao
{
    protected static int contador = 1;
    private int idQuestao;
    private String enunciado;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private double notaPadrao;
    protected double notaObtida;
    
    public int getIdQuestao(){
        return this.idQuestao;
    }
    
    public String getEnunciado(){
        return this.enunciado;
    }
    
    public String getOpcaoA(){
        return this.opcaoA;
    }
    
    public String getOpcaoB(){
        return this.opcaoB;
    }
    
    public String getOpcaoC(){
        return this.opcaoC;
    }
    
    public double getNotaPadrao(){
        return this.notaPadrao;
    }
    
    public void setIdQuestao(int idQuestao){
        this.idQuestao = idQuestao;
    }
    
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
