package ATM;

public class Nota50Handler extends AbstractSaqueHandler {

    public static final int N50 = 2;

	@Override
	protected int handleSaque(int valor) {
          int valorRestante = super.valorRestante(valor, 50);
           return valorRestante;
	}

	@Override
	protected int getTipoNota() {
            return N50;
	}
}
