--Crear tablas

CREATE TABLE alternativa (
    id_alternativa        INTEGER NOT NULL,
    descripcion           VARCHAR2(200),
    es_correcta           VARCHAR2(2),
    porcentaje            INTEGER,
    pregunta_id_pregunta  INTEGER NOT NULL,
    alumno_rut            VARCHAR2(12) NOT NULL
);

ALTER TABLE alternativa ADD CONSTRAINT alternativa_pk PRIMARY KEY ( id_alternativa );

CREATE TABLE alumno (
    rut             VARCHAR2(12) NOT NULL,
    nombre          VARCHAR2(50),
    apellido        VARCHAR2(50),
    curso_id_curso  INTEGER NOT NULL
);

ALTER TABLE alumno ADD CONSTRAINT alumno_pk PRIMARY KEY ( rut );

CREATE TABLE curso (
    id_curso     INTEGER NOT NULL,
    descripcion  VARCHAR2(20)
);

ALTER TABLE curso ADD CONSTRAINT curso_pk PRIMARY KEY ( id_curso );

CREATE TABLE pregunta (
    id_pregunta   INTEGER NOT NULL,
    enunciado     VARCHAR2(200),
    puntaje       INTEGER,
    test_id_test  INTEGER NOT NULL
);

ALTER TABLE pregunta ADD CONSTRAINT pregunta_pk PRIMARY KEY ( id_pregunta );

CREATE TABLE test (
    id_test           INTEGER NOT NULL,
    nombre_test       VARCHAR2(50) NOT NULL,
    descripcion_test  VARCHAR2(100) NOT NULL,
    unidad            VARCHAR2(5) NOT NULL,
    autor             VARCHAR2(30) NOT NULL,
    fecha_creacion    DATE NOT NULL
);

ALTER TABLE test ADD CONSTRAINT test_pk PRIMARY KEY ( id_test );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_alumno_fk FOREIGN KEY ( alumno_rut )
        REFERENCES alumno ( rut );

ALTER TABLE alternativa
    ADD CONSTRAINT alternativa_pregunta_fk FOREIGN KEY ( pregunta_id_pregunta )
        REFERENCES pregunta ( id_pregunta );

ALTER TABLE alumno
    ADD CONSTRAINT alumno_curso_fk FOREIGN KEY ( curso_id_curso )
        REFERENCES curso ( id_curso );

ALTER TABLE pregunta
    ADD CONSTRAINT pregunta_test_fk FOREIGN KEY ( test_id_test )
        REFERENCES test ( id_test );