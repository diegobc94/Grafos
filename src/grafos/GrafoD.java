package grafos;

public class GrafoD extends Grafo{
	
	public GrafoD(int v, int e) {
		super(v, e);
	}

	@Override
	public void conectarNodosPonderado(int origen, int destino, int peso) {
		super.ady[origen][destino]=peso;
	}

	@Override
	public void conectarNodos(int origen, int destino) {
		super.ady[origen][destino]=1;
	}
	
	
	
}
