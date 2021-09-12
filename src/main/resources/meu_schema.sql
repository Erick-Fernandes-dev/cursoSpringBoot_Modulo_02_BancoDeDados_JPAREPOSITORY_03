CREATE TABLE CLIENTE(

    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100)

);

CREATE TABLE PRODUTO(

    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    DESCRICAO VARCHAR(100),
    PRECO_UNITARIO NUMERIC(20, 2)

),

CREATE TABLE PEDIDO(

    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    CLIENTE_ID INTEGER REFERENCES CLIENTE (ID),
    DATA_PEDIDO TIMESTAMP,
    TOTAL NUMERIC(20, 2)
),

CREATE TABLE ITEM_PEDIDO (

    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    PEDIDO_ID INTEGER REFERENCES PEDIDO (ID),
    PRODUTO_ID INTEGER REFERENCES PRODUTO (ID),
    QUANTIDADE INTEGER
    
)