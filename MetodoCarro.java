public class MetodoCarro {
    private Integer diametropneu;
    private String motor;
    private String farol;
    private String porta;
    private String busina;
    private Boolean chave;
    private Boolean acelerador;
    private Boolean desligar;

    public Boolean getDesligar() {
        return desligar;
    }

    public void setDesligar(Boolean desligar) {
        this.desligar = desligar;
    }

    public Integer getDiametropneu() {
        return diametropneu;
    }

    public void setDiametropneu(Integer diametropneu) {
        this.diametropneu = diametropneu;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBusina() {
        return busina;
    }

    public void setBusina(String busina) {
        this.busina = busina;
    }

    public Boolean getChave() {
        return chave;
    }

    public void setChave(Boolean chave) {
        this.chave = chave;
    }

    public Boolean getAcelerador() {
        return acelerador;
    }

    public void setAcelerador(Boolean acelerador) {
        this.acelerador = acelerador;
    }
    public static Boolean ligarCarro(Boolean chaveDoCarro) {
        if (chaveDoCarro !=null && chaveDoCarro) {
            System.out.println("A Partida do Carro esta sendo Acionada!");
            acelerarCarro(chaveDoCarro, true);
            desligarCarro(chaveDoCarro,true);
        }else{
            System.out.println("O Carro infelizmente esta Sem a Chave de Ignicao.");
            acelerarCarro(chaveDoCarro, true);
            desligarCarro(chaveDoCarro,true);
        }
        return chaveDoCarro;
    }

    public static Boolean acelerarCarro(Boolean chaveDoCarro, Boolean acelerador ) {
        if (chaveDoCarro !=null && chaveDoCarro) {
            System.out.println("Agora Voce Ja Pode Acelerar o Carro!");
        }else{
            System.out.println("Impossivel Acelerar o Carro Porque Nao Ha Chave na Ignicao.");
        }
        return acelerador;
    }
    public static Boolean desligarCarro(Boolean chaveDoCarro, Boolean desligar) {
        if (chaveDoCarro != null && chaveDoCarro) {
            System.out.println("Impossivel Desligar o Carro Porque Ja esta em Funcionamento.");
        } else {
            System.out.println("Impossivel Ligar o Carro Agora , Por Favor Insira a Chave na Ignicao.");
        }
        return desligar;
    }
        public static void main(String[] args) {
       ligarCarro(false); //
    }
}
