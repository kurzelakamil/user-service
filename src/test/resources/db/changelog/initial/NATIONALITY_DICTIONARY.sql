CREATE TABLE if NOT EXISTS "nationality_dictionary" (
	id bigserial NOT NULL,
	label varchar(50) NOT NULL,
	CONSTRAINT nationality_dictionary_pk PRIMARY KEY (id),
	CONSTRAINT nationality_un UNIQUE (label)
);