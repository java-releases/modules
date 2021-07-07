/**
 * ########################################################################################
 * ################################## MODULO COMUNICACAO ##################################
 * ########################################################################################
 */
module modulo.comunicacao {

	// Limitando o acesso, apenas para o modulo.pessoal
	exports zoo.animal.comunicacao.conteudo to modulo.pessoal;
	
	exports zoo.animal.comunicacao.agendamento;
	exports zoo.animal.comunicacao.midia;

	// requires modulo.alimentacao;
	// requires modulo.cuidado;
	requires transitive modulo.cuidado;

}