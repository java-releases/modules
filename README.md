### Tópico: Módulos

### Objetivos
- Descrever o módulo JDK;
- Declarar módulo e ativar acesso entre módulos;
- Descrever como um projeto módulo é compilado e executado;

<hr>

### Resumo
- Um módulo não pode ter ao mesmo tempo um “required” e um “required transitive” para um mesmo módulo. Isso não compila.
- Um arquivo module-info.java pode ser vazio.
- Uma dependência ciclica, sempre envolve pelo menos 2 dependências obrigatórias. `(requires)`

<hr>

> #### **Diretivas**
  - module: nome do módulo;
  - exports: permite que todos os módulos acessem o pacote;
  - exports <package> to: permite que um módulo em específico acessem o pacote;
  - requires: indica que um módulo depende de outro módulo;
  - requires transitive: indica que o módulo e todos os módulos que usem esse módulo, dependem de um outro módulo;
  - opens: permite usar reflection; 
  <br/><br/>
  
> #### **Jmod command**
  - create
  - list
  - describe
  - extract 
  - hash
  <br/><br/>
  
> #### **javac**
  - `-cp`: caminho dos jar’s em programas não modulares
  - `-classpath`: caminho dos jar’s em programas não modulares
  - `--class-path`: caminho dos jar’s em programas não modulares
  - `-d`: diretório onde será colocado todos arquivos compilados
  - `-p`: caminho dos jar’s em programas modulares
  - `--module-path`: caminho dos jar’s em programas modulares  
<br/><br/>
  
> #### **java**
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
<br/><br/>
  
> #### **jar**
  - `--create`: criar um novo JAR file
  - `-c`: criar um novo JAR file
  - `--file`: JAR filename
  - `-f`: JAR filename
  - `--verbose`: exibir detalhes
  - `-v`: exibir detalhes
  - `-C`: diretório que contém arquivos usados para criar o JAR
  - `--describe-module`: descrição de detalhes de um módulo
  - `-d`: descrição de detalhes de um módulo
<br/><br/>
  
> #### **jdeps**
  - `--module-path`: caminho dos jar’s em programas modulares
  - `-summary`: exibir sumário
  - `-s`: exibir sumário
<br/><br/>

> #### **Módulos fornecidos pelo JDK**
  - java.base
  - java.desktop
  - java.logging
  - jdk.compiler
<br/><br/>
  
> #### **Vantagens dos Módulos**
  - Encapsulamento de pacotes
