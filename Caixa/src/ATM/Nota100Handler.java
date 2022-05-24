package ATM;

public class Nota100Handler extends AbstractSaqueHandler {

	public static final int N100 = 1;

	@Override
	protected int handleSaque(int valor) {
            int valorRestante = super.valorRestante(valor, 100);

            return valorRestante;
	}

	@Override
	protected int getTipoNota() {
            return N100;
	}
}
