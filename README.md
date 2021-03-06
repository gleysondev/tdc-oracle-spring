# TDC Oracle Recife 2020!

## Sexta 30/10 | Trilha Java


# SpringBoot Star(ters) 

## Demonstrar os recursos e a produtividade adquirida utilizando Spring Boot Starters.

- Desafios com gerenciando de dependências 
- Benefícios dos Starters
- Lista de Starters
- Evolução e utilização do projeto
- Benefícios dos Starters para Cloud Native
- Construção e deploy de uma API no Cloud Oracle

## Compilar, construir e gerar pacote da aplicação
```bash
git clone https://github.com/gleysondev/tdc-oracle-spring.git
cd tdc-oracle-spring
mvn install
```

## Gerar e publicar imagem Docker
```bash
docker build -t tdc-oracle-spring:v1 .
docker tag tdc-oracle-spring:v1 frankmms/tdc-oracle-spring:v1
docker push frankmms/tdc-oracle-spring:v1
```

## Criar cluster no Oracle Cloud OKE

* Acessar sua conta no Oracle Cloud https://www.oracle.com/cloud/sign-in.html

* Menu > Serviços ao Desenvolvedor > Clusters de Container (OKE)

## Fazer o deploy da aplicação

```bash
kubectl run tdc-oracle-spring --image=frankmms/tdc-oracle-spring:v1 --port=8080
kubectl get deploy
```

## Expor o serviço da aplicação

```bash
kubectl expose deploy tdc-oracle-spring --type=LoadBalancer
kubectl get service
```

## Acessar a aplicação

curl http://{PUBLIC_IP}:8080/


## Visualizando a saúde da aplicaçaõ com Actuator

curl http://{PUBLIC_IP}:8080/actuator

curl http://{PUBLIC_IP}:8080/actuator/health (saúde em geral)

curl http://{PUBLIC_IP}:8080/actuator/liveness (estatus de execução)

curl http://{PUBLIC_IP}:8080/actuator/readiness (se a aplicação está pronta para utilização)


## Palestrantes
> **Gleyson Sampaio** Desenvolvedor na **Digytal** 

> **Frank Santos** Arquiteto na **Digytal** 
