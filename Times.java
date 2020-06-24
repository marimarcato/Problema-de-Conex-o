
package Modelos;

public class Times {
        private int posicao;
	private int cod_time;
	private String nome;
	private int pontos;
	private int vitorias;
	private int empates;
	private int derrotas;
	private int cartoesVermelhos; 
	private int cartoesAmarelos;
	private int golsFeitos;
	private int golsTomados;
	private int saldoGols;
        private int NumPartida;
	
	public Times(int posicao, String nome, int pontos,
			int vitorias, int empates, int derrotas, int cartoesVermelhos,
			int cartoesAmarelos, int golsFeitos, int golsTomados, int saldoGols, int NumPartida) {
                
                this.posicao = posicao;
		this.nome = nome;
		this.pontos = pontos;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.cartoesVermelhos = cartoesVermelhos;
		this.cartoesAmarelos = cartoesAmarelos;
		this.golsFeitos = golsFeitos;
                this.golsTomados = golsTomados;
                this.saldoGols = saldoGols;
                this.NumPartida = NumPartida;
    
} 

    public Times() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getCod_time() {
        return cod_time;
    }

    public void setCod_time(int cod_time) {
        this.cod_time = cod_time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(int cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public int getGolsTomados() {
        return golsTomados;
    }

    public void setGolsTomados(int golsTomados) {
        this.golsTomados = golsTomados;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getNumPartida() {
        return NumPartida;
    }

    public void setNumPartida(int NumPartida) {
        this.NumPartida = NumPartida;
    }
    
    
    public String ToText() {
        return "Times{" + " posicao=" + posicao + ", cod_time=" + cod_time + ", nome=" + nome + ", pontos=" + pontos + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + ", cart\u00f5esVermelhos=" + cartoesVermelhos + ", cart\u00f5esAmarelos=" + cartoesAmarelos + ", golsFeitos=" + golsFeitos + ", golsTomados=" + golsTomados + ", saldoGols=" + saldoGols + ", NumPartida=" + NumPartida + '}';
    }
}

    
   
   
        
       

    