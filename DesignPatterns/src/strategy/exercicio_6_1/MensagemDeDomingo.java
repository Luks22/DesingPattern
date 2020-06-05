package strategy.exercicio_6_1;

public class MensagemDeDomingo implements MensagemDoDia {

	@Override
	public String mensagem() {
		return "Mas já é Domingo?";
	}
}
