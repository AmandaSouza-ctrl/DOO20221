package ATM;

public class Nota5Handler extends AbstractSaqueHandler {

	public static final int N5 = 2;

	@Override
	protected int handleSaque(int valor) {
	int valorRestante = super.valorRestante(valor, 5);

            return valorRestante;
	}

	@Override
	protected int getTipoNota() {
            return N5;
	}
}
