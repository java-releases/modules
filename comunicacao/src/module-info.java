module modulo.comunicacao {

	exports zoo.animal.comunicacao.agendamento;
	exports zoo.animal.comunicacao.conteudo;
	exports zoo.animal.comunicacao.midia;

	requires modulo.alimentacao;
	requires modulo.cuidado;

}