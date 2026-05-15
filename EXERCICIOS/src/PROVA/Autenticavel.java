package PROVA;

public interface Autenticavel {
    boolean autenticar(String senha);
}


/*
Classe Final
	1 pt) O que é uma classe final?
	R: Uma classe final é uma classe que não pode ser herdada por outras classes. 
	   
	1 pt) O que acontece se tentarmos herdar dela?
	R: Se tentarmos criar uma subclasse de uma classe final, o compilador vai gerar um erro de compilação
*/