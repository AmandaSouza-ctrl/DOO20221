package ATM;

public class Nota10Handler extends AbstractSaqueHandler {

	public static final int N10 = 2;

	@Override
	protected int handleSaque(int valor) {
            int valorRestante = super.valorRestante(valor, 10);

            return valorRestante;
	}

	@Override
	protected int getTipoNota() {
            return N10;
	}
}
