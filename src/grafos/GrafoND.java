package grafos;

public class GrafoND extends Grafo{
	
	public GrafoND(int v, int e) {
		super(v, e);
	}

	@Override
	public void conectarNodosPonderado(int origen, int destino, int peso) {
		super.ady[origen][destino]=peso;
		super.ady[destino][origen]=peso;
	}

	@Override
	public void conectarNodos(int origen, int destino) {
		super.ady[origen][destino]=1;
		super.ady[destino][origen]=1;
	}

}
