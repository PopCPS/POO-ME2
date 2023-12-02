public class QuestaoRespostaProporcional extends Questao
{
  private int valorOpcaoA;
  private int valorOpcaoB;
  private int valorOpcaoC;
  private char opcaoMarcada;
  
    public QuestaoRespostaProporcional(){
        setIdQuestao(contador);
        contador++;
    }
  
    public void marcaOpcao(char opcaoMarcada) throws NonExistentCorrectAnswer {
        if(opcaoMarcada == 'A' || opcaoMarcada == 'B' || opcaoMarcada == 'C'){
            this.opcaoMarcada = opcaoMarcada;
        }else{
            throw new NonExistentCorrectAnswer("Resposta inválida, valores válidos são A, B e C");
        }
    }
  
    public double calculaNotaObtida(){
        if(opcaoMarcada == 'A'){
            return this.notaObtida = getNotaPadrao() / 100 * valorOpcaoA;
        }
        if(opcaoMarcada == 'B'){
            return this.notaObtida = getNotaPadrao() / 100 * valorOpcaoB;
        }
        if(opcaoMarcada == 'C'){
            return this.notaObtida = getNotaPadrao() / 100 * valorOpcaoC;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return(
            "\n" +
            "*** Questão Resposta Proporcional ***" + "\n" + 
            "\n" +
            "Número          : " + getIdQuestao() + "\n" + 
            "\n" +
            "Enunciado       : " + getEnunciado() + "\n" +
            "\n" +
            "A - " + getOpcaoA() + "\n" + 
            "B - " + getOpcaoB() + "\n" +
            "C - " + getOpcaoC() + "\n" +
            "\n" +
            "Nota da questão : " + getNotaPadrao()
        );
    }
    
    public void setValorOpcaoA(int valorOpcao) throws NonExistentCorrectAnswer{
        if(valorOpcao == 100 || valorOpcao == 50 || valorOpcao == 25){
            this.valorOpcaoA = valorOpcao;
        }else{
            throw new NonExistentCorrectAnswer("Valor inválido, valores válidos são 100%, 50% e 25%");
        }
    }

        public void setValorOpcaoB(int valorOpcao) throws NonExistentCorrectAnswer{
        if(valorOpcao == 100 || valorOpcao == 50 || valorOpcao == 25){
            this.valorOpcaoB = valorOpcao;
        }else{
            throw new NonExistentCorrectAnswer("Valor inválido, valores válidos são 100%, 50% e 25%");
        }
    }
    
        public void setValorOpcaoC(int valorOpcao) throws NonExistentCorrectAnswer{
        if(valorOpcao == 100 || valorOpcao == 50 || valorOpcao == 25){
            this.valorOpcaoC = valorOpcao;
        }else{
            throw new NonExistentCorrectAnswer("Valor inválido, valores válidos são 100%, 50% e 25%");
        }
    }
}
