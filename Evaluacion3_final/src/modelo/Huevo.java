package modelo;

public class Huevo {
	
	private int columna;
    private int fila;
    private int puntaje;
        public Huevo (int columna, int fila, int puntaje) {
        this.columna = columna;
        this.fila = fila;
        this.puntaje = puntaje;
     }
		@Override
		public String toString() {
			return "huevo [columna=" + columna + ", fila=" + fila + ", puntaje=" + puntaje + "]";
		}
		public int getColumna() {
			return columna;
		}
		public void setColumna(int columna) {
			this.columna = columna;
		}
		public int getFila() {
			return fila;
		}
		public void setFila(int fila) {
			this.fila = fila;
		}
		public int getPuntaje() {
			return puntaje;
		}
		public void setPuntaje(int puntaje) {
			this.puntaje = puntaje;
		}

}
