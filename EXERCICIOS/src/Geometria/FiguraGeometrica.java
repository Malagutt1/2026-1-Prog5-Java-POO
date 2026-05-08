package Geometria;
//Serve para padronização de métodos, permitindo usar os mesmos nomes para diferentes classes.
//Por exemplo, um método DefinirCor() pode existir tanto em um carro quanto em um celular,
//mas cada um com sua própria implementação.

public interface FiguraGeometrica {
	public String getNomeFigura();
	public int getArea();
	public int getPerimetro();
}
