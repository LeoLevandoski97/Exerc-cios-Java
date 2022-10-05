import java.util.Scanner;

public class OurBank {
    private String tipoOperacao;
    private Float  valorSaque;
    private Boolean transferencia;
    private Float saldo;
    private Float valorTranferencia;
    private String tipoTransferencia;
    private  String extrato;

    final static Scanner input =new Scanner(System.in);

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Float getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Float valorSaque) {
        this.valorSaque = valorSaque;
    }

    public Boolean getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Boolean transferencia) {
        this.transferencia = transferencia;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getValorTranferencia() {
        return valorTranferencia;
    }

    public void setValorTranferencia(Float valorTranferencia) {
        this.valorTranferencia = valorTranferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
    public static OurBank saque(OurBank conta) {
        if(conta.getSaldo() !=null && conta.getSaldo() >0) {
        System.out.println("Saque Realizado no Valor de " + conta.getSaldo());
        }else{
        System.out.println("Nao Existe Nenhum Saldo em Sua Conta, Deseja Realizar um Deposito?");
        String perguntaDeDeposito = input.next();
        if (perguntaDeDeposito.equals("Sim")) {
            System.out.println("Digite o Valor de Deposito Por Favor:");
            Float valorDeDeposito = input.nextFloat();
            deposito(valorDeDeposito);
        }
    }
    return  conta;
}
    public  static void deposito(Float saldoDeDeposito) {
    System.out.println("Deposito no Valor de R$:" + saldoDeDeposito + " Reais Foi Realizado com Sucesso em Sua Conta Leonardo! ");
    System.out.println("Obrigado Por Usar OURBANK!");
    }

    public static void transferencia(OurBank conta, String nomeDoBeneficiado) {
        if (nomeDoBeneficiado.length() < 3) {
            System.out.println("Nome Invalido, Digite um Nome que Contenha mais de 3 caracteres Por Favor.");
        } else {
            System.out.println("Transferencia no Valor de R$:" + conta.getValorTranferencia() + " Reais Realizada com Sucesso!!" + " Em Nome De: " + nomeDoBeneficiado);
            System.out.println("Obrigado Por Usar OURBANK!");
        }
    }
    public  static void main(String[] args) {
        System.out.println("Bem Vindo ao OURBANK!");
        OurBank conta=new OurBank();
        System.out.println("Informe o Tipo de Operacao que deseja fazer:");
        String tipoDeOperacaoDigitada = input.next();
        conta.setTipoOperacao(tipoDeOperacaoDigitada);
        if (conta.getTipoOperacao().equals("Saque")) {
            System.out.println("A Opcao Escolhida Foi de Saque.");
            System.out.println("Informe o Valor de Saque Por Favor:");
            Float valorSaque = input.nextFloat();
            conta.setValorSaque(valorSaque);
            saque(conta);
        }else if (conta.getTipoOperacao().equals("Deposito")) {
            System.out.println("A Opcao Escolhida Foi de Deposito.");
            System.out.println("Digite o Valor de Deposito Por Favor:");
            Float saldoDigitado = input.nextFloat();
            conta.setSaldo(saldoDigitado);
            deposito(saldoDigitado);
        }else if (conta.getTipoOperacao().equals("Transferencia")) {
            System.out.println("Informe o Nome do Beneficiado Por Favor:");
            String nomeDoBeneficiado = input.next();
            System.out.println("Digite o Valor para Deposito Por Favor:");
            Float saldoDigitado = input.nextFloat();
            conta.setValorTranferencia(saldoDigitado);
            transferencia(conta, nomeDoBeneficiado);
        }
    }
}
