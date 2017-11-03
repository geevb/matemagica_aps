package Modelo;

public class Jogo {
	
	private int numQuestao = 1;
	private String dificuldade;
	private String operacao;



	public Jogo() {}
	
	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void setNumQuestao(int numQuestao) {
		this.numQuestao = numQuestao;
	}

	public void fluxoJogoUmJogador(Jogador jogador) {
		
		/*
		 * 0 - Chamar tela do jogo
		 * 1 - Verificar quantidade de questões apresentadas
		 * 2 - Apresentar questão
		 * 3 - Receber resposta
		 * 4 - Validar(Pontuar ou não) questão
		 * 5 - Cabou? Contabilizar resultado
		 * 6 - Verificar se entra no ranking
		 * 7 - Adicionar ou não ao ranking
		 * 8 - Deseja jogar novamente?		  
		 */		
		
	}
	
        public void iniciarPartidaUmJogador(Jogador jogador){
        
            
        
        }
        
	public void fluxoJogoDoisJogadores() {
		
		/*
		 * 0 - Chamar tela do jogo
		 * 1 - Verificar quantidade de questões apresentadas
		 * 2 - Apresentar questões ao jogador 1,
		 * 3 - Apresentar questão escolhida ao jogador 2; 
		 * 3 - Receber resposta
		 * 4 - Validar(Pontuar ou não) questão
		 *   - Apresentar questões ao jogador 2
		 *   - Apresentar questão escolhida ao jogador 1
		 * 5 - Cabou? Contabilizar resultado
		 * 6 - Verificar se entra no ranking
		 * 7 - Adicionar ou não ao ranking
		 * 8 - Deseja jogar novamente?		  
		 */	
		
		
	}
	
	public int getNumQuestao() {
		return numQuestao;
	}
	
	public String getNumQuestaoString() {
		return Integer.toString(numQuestao);
	}

	public void incrementarNumQuestao() {
		numQuestao++;
	}
	
}
