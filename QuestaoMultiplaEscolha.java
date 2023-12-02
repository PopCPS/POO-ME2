public class QuestaoMultiplaEscolha extends Questao
{
    private char opcaoCorreta;
    private char opcaoMarcada;
    
    public QuestaoMultiplaEscolha(){
            this.idQuestao = contador++;
    }
    
    public void marcaOpcao(char opcaoMarcada) throws NonExistentCorrectAnswer {
        if(opcaoMarcada == 'A' || opcaoMarcada == 'B' || opcaoMarcada == 'C'){
            this.opcaoMarcada = opcaoMarcada;
        }else{
            throw new NonExistentCorrectAnswer("Resposta inválida, valores válidos são A, B e C");
        }
    }
    
    public double calculaNotaObtida(){
        if(opcaoMarcada == opcaoCorreta){
            this.notaObtida = notaPadrao;
            return notaObtida;
        }else{
            this.notaObtida = 0;
            return notaObtida;
        }
    }
    
    @Override
    public String toString(){
        return(
            "\n" +
            "*** Questão de Multipla Escolha ***" + "\n" +
            "\n" +
            "Número          : " + idQuestao + "\n" +
            "\n" +
            "Enunciado       : " + enunciado + "\n" +
            "\n" +
            "A - " + opcaoA + "\n" +
            "B - " + opcaoB + "\n" +
            "C - " + opcaoC + "\n" +
            "\n" +
            "Nota da questão : " + notaPadrao
        );
    }
    
    
    public void setNotaPadrao(double notaPadrao){
        this.notaPadrao = notaPadrao;
    }
    
    public void setOpcaoCorreta(char opcaoCorreta) throws NonExistentCorrectAnswer{
        if(opcaoCorreta == 'A' || opcaoCorreta == 'B' || opcaoCorreta == 'C'){
            this.opcaoCorreta = opcaoCorreta;
        }else{
            throw new NonExistentCorrectAnswer("Resposta Correta inválida, valores válidos são A, B e C");
        }
    }
}