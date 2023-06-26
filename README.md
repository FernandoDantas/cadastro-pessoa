# Projeto cadastro de pessoas com JSF
Esse projeto foi desenvolvido como teste para a empresa kumulus

## Para criar a imagem docker executa o comando:
```shell script
docker-compose up
```

## Para iniciar o docker já com a imagem criada executa o comando:
```shell script
- docker-compose up -d
```

## Para encerrar a execução da imagem com o banco postgres criado utilizar o comando:
```shell script
- docker stop postgres_cadastro
```

## Para executar o start com o banco postgres criado utilizar o comando:
```shell script
- docker start postgres_cadastro
```

## Para testar a conexão, executar teste e criar tabelas:
- temos uma classe chamada HibernateUtilTest no pacote br.fernando.teste.util que roda o teste com o junit. Ele também cria as tabelas
- Os testes foram criados utilizando junit. Ambos ficam no pacote br.fernando.teste.dao

## Servidor web utilizado:
- Tomcat baixado no seguinte link: [https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.90/bin/apache-tomcat-8.5.90-windows-x64.zip](https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.90/bin/apache-tomcat-8.5.90-windows-x64.zip)

https://www.youtube.com/watch?v=fCGYGqlQ0Fc
