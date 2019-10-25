package grafos;

public abstract class Grafo {
	public int v;
	public int e;
	public int ady[][];
	
	public Grafo(int v, int e) {
		this.v=v;
		this.e=e;
		this.ady=new int[v][v];
	}
	
	
	public void iniciarAdy() {
		for(int i=0; i<v; i++)
			for(int j=0; j<v; j++)
				ady[i][j]=0;
	}


	public abstract void conectarNodosPonderado(int origen, int destino, int peso);
	public abstract void conectarNodos(int origen, int destino);
	
}
