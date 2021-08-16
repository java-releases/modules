![](https://github.com/ocpjp-study/modules/blob/main/ocpjp.jpg)

[Preparação para o Exame 1Z0-817](https://education.oracle.com/pt_BR/upgrade-ocp-java-6-7-8-to-java-se-11-developer/pexam_1Z0-817)

### Tópico: Módulos

### Objetivos
- Descrever o módulo JDK;
- Declarar módulo e ativar acesso entre módulos;
- Descrever como um projeto módulo é compilado e executado;

### Regras
- Um módulo não pode ter ao mesmo tempo um “required” e um “required transitive” para um mesmo módulo. Isso não compila.
- Um arquivo module-info.java pode ser vazio.

- **Diretivas:**
  - module: nome do módulo;
  - exports: permite que todos os módulos acessem o pacote;
  - exports <package> to: permite que um módulo em específico acessem o pacote;
  - requires: indica que um módulo depende de outro módulo;
  - requires transitive: indica que o módulo e todos os módulos que usem esse módulo, dependem de um outro módulo;
  - opens: permite usar reflection; 
  
- **Jmod command:**
  - create
  - list
  - describe
  - extract 
  - hash
  
- **javac:**
  - `-cp`: caminho dos jar’s em programas não modulares
  - `-classpath`: caminho dos jar’s em programas não modulares
  - `--class-path`: caminho dos jar’s em programas não modulares
  - `-d`: diretório onde será colocado todos arquivos compilados
  - `-p`: caminho dos jar’s em programas modulares
  - `--module-path`: caminho dos jar’s em programas modulares  

- **java:**
  - `-cp`: caminho dos jar’s em programas não modulares
  - `-classpath`: caminho dos jar’s em programas não modulares
  - `--class-path`: caminho dos jar’s em programas não modulares
  - `-p`: caminho dos jar’s em programas modulares
  - `--module-path`: caminho dos jar’s em programas modulares
  - `--describe-module`: descrição de detalhes do módulo
  - `-d`: descrição de detalhes do módulo
  - `--module`: nome do modulo (modulo.name/Xpto.java)
  - `-m`: nome do modulo (modulo.name/Xpto.java)
  - `--show-module-resolution`: exibe módulos ao rodar o programa
  - `--list-modules`: lista de módulos sem rodar um programa

  
  
