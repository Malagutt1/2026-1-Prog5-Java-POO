package PROVA;

public class AnaliseCodigo {
    public static abstract class Animal {// Classe abstrata
        public abstract void som();
    }

    public static final class Cachorro extends Animal {// Classe final
        @Override
        public void som() {
            System.out.println("Latido");
        }
    }

/*
	1 pt) Quais conceitos de POO estão sendo utilizados?
	R: Herança (Cachorro herda de Animal), polimorfismo (Cachorro fornece implementação do método abstrato), 
	   abstração (Animal é abstrato), classe final (Cachorro não pode ser estendido).
	
	1 pt) O método som() foi sobrescrito ou sobrecarregado?
	R: Sobrescrito
	
	1 pt) Qual será a saída do método da classe Cachorro?
	R: Latido
*/
}