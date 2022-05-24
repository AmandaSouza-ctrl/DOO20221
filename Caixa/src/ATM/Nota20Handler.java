package ATM;

public class Nota20Handler extends AbstractSaqueHandler {

	public static final int N20 = 2;

	@Override
	protected int handleSaque(int valor) {
            int valorRestante = super.valorRestante(valor, 20);

            return valorRestante;
	}

	@Override
	protected int getTipoNota() {
            return N20;
	}
}
