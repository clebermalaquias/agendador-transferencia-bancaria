
#Agendamento transferência - Spring-Boot

##Instruções para instalação

O projeto foi desenvolvido usando o Spring Boot para facilitar a instalação, que pode se feita
de duas maneiras,usando uma IDE ou através de linha de comando.



pré requesitos:

	- Java 8
	- Maven 2+
	- Git 2+
	
Linha de comando:

	1 - Vamos clonar o repositorio

	$ git clone https://github.com/clebermalaquias/agendador-transferencia-springboot.git


	2 -Entra na pasta do repositorio:

	$ cd agendador-transferencia-springboot/

	
	3 - Rodar a aplicação pelo Maven

	$ mvn spring-boot:run


Após esses passos o maven deve começar baixar as dependencias, e subir o Tomcat,
com na imagem abaixo:



  	4 - Após o maven terminar de baixar as dependencias e subir o tomcat, você pode acessar no browser:

	http://localhost:8080/

Obs: Estou considerando que você tenha o maven no PATH do seu sistema operacional,
e que não tenha nenhuma aplicação usando a porta 8080 do seu computador.


IDE:

	1 - Clonar o repositorio

	$ git clone https://github.com/clebermalaquias/agendador-transferencia-springboot.git


	2 - Importa o projeto com maven


	3 - Procurar a Classe AgTrBancariaApplication e rodar como uma classe Java JSE(metodo main),Botão direito em cima da classe
	opção Run

	
	No console da sua IDE deve começar baixar as dependencias, e subir o Tomcat
	
	4 - Após o maven terminar de baixar as dependencias e subir o tomcat, você pode acessar no browser:

	http://localhost:8080/

Obs: Estou considerando que não tenha nenhuma aplicação usando a porta 8080 do seu computador.





##Arquitetura
 
	O projeto foi desenvolvido usando o padrão MVC para clareza e separação melhor das camadas,
	Facilitando o entendimento e manuntenção da aplicação.

	Para o negocio, o problema apresentado para o calculo de taxa de acordo,
	com algumas variaveis usei o Strategy do padrão de projeto, 
	que atende de forma clara e com a possibilidade de escalabilidade da aplicação  
	usando o padrão pode-se adicionar diversas taxas,sem muito esforço e sem comprometer o que já esta funcionando.

	Optei em usar o Java 8 pela facilidade para maninpulação de datas com o Chrono,
	O Framework Spring pela simplicidade em criar serviços rest. Usei o AngularJs pela produtividade e fácil uso.

	Nos testes unitários usei o Junit.

##Versões:
 
 	- Java 8
	- Spring 4.1.4
	- Spring Boot 1.3.5.
	- Junit 4.11
	- Apache Tomcat 8
	- AngularJS v1.5.6
	- Bootstrap v3.3.5 

##Ferramentas:

	- IntelliJ IDEA 2016.1.2
