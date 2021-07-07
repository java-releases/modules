/**
 * ########################################################################################
 * ################################## MODULO CUIDADO ######################################
 * ########################################################################################
 */
module modulo.cuidado {

	exports zoo.animal.cuidado.medico;

	// Obriga a dependencia do "modulo.alimentacao", e tambem disponibiliza o "modulo.alimentacao", para quem usar o modulo "modulo.cuidado".
	requires transitive modulo.alimentacao;

}