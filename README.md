# API FISIOTERAPEUTA

## Visão Geral
Este repositório contém o código-fonte de uma aplicação cliente-servidor multiplataforma, projetada para rodar em ambientes Windows e Mobile.

## Arquitetura
O núcleo da nossa aplicação é construído em torno de uma API robusta desenvolvida em Java, que interage com um banco de dados (DB) para realizar operações CRUD através de endpoints bem definidos.
![image](https://github.com/user-attachments/assets/823058d5-dfdb-4e1c-a4d5-3ee120c3b918)


### Cliente
- O CLIENTE interage com nossa API para realizar operações.
- O sistema é projetado para ser multiplataforma, com suporte dedicado para dispositivos WINDOWS e MOBILE.

### API Java
- Nossa API facilita todas as interações cliente-servidor.
- Ela lida com solicitações de clientes WINDOWS e MOBILE de forma integrada.

### Banco de Dados (DB)
- O DB armazena todos os dados necessários exigidos pela API.
- Ele suporta consultas complexas da camada API, garantindo integridade e segurança dos dados.
  ![image](https://github.com/user-attachments/assets/49bc248d-0a79-4070-83e7-49d402dbe6b1)

### Deploy: Square Cloud Services
Nossa aplicação é implantada usando os serviços da Square Cloud, garantindo alta disponibilidade e escalabilidade em todas as plataformas.

## Endpoints

### Patient (`/api/patient`)
- `GET`: Recupera informações do paciente.
- `POST`: Cria novos pacientes.
  
### Treatment (`/api/patient/treatment/{id do paciente}`)
- `GET`: Busca detalhes dos tratamentos.
- `POST`: Cadastra novos tratamentos para o cliente.

## Respostas
Nossa API usa códigos de resposta HTTP padrão para indicar o sucesso ou falha de uma solicitação de API:
  
Exemplo:
  - `200 OK`: A solicitação foi bem-sucedida.
  - `500 INTERNAL SERVER ERROR`: Erro no servidor
  - Outros...

## Conclusão
Este projeto visa proporcionar uma experiência contínua em diferentes plataformas, garantindo confiabilidade através de sua arquitetura orientada a serviços. Para mais informações sobre como usar esta aplicação, consulte os arquivos de documentação dentro deste repositório.
