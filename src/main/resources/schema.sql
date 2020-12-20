create table "poemslightweight"
(
	id varchar(255) not null primary key,
	poem varchar(255)
);

CREATE TABLE poems(
    id SERIAL UNIQUE PRIMARY KEY,
    poem_name VARCHAR UNIQUE NOT NULL,
    poem VARCHAR (1024),
    created_on TIMESTAMP NOT NULL DEFAULT NOW()
);

