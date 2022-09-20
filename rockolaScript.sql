#############################
### CREA LA BASE DE DATOS ###
#############################

CREATE DATABASE IF NOT EXISTS rockola;


###########################
#### CREA TABLA GENERO ####
###########################

CREATE TABLE IF NOT EXISTS rockola.genero (
	idgenero INT UNSIGNED NOT NULL,
	genero varchar(35) NOT NULL,
	CONSTRAINT pk_genero PRIMARY KEY (idgenero)
);

############################
### CREA TABLA ARTISITA ####
############################

CREATE TABLE IF NOT EXISTS rockola.artista (
	idartista INT UNSIGNED NOT NULL,
	nombre VARCHAR(35),
	CONSTRAINT pk_artista PRIMARY KEY (idartista)
);

###########################
##### CREA TABLA DISCO ####
###########################

CREATE TABLE IF NOT EXISTS rockola.disco (
	iddisco INT UNSIGNED NOT NULL,
	nombre VARCHAR(35) NOT NULL,
	año INT UNSIGNED,
	tipo VARCHAR(35) NOT NULL,
	CONSTRAINT pk_disco PRIMARY KEY (iddisco)
);

###########################
#### CREA TABLA CANCION ###
###########################

CREATE TABLE IF NOT EXISTS rockola.cancion (
	idcancion INT UNSIGNED NOT NULL,
	nombre VARCHAR(35) NOT NULL,
	vinculo VARCHAR(50) NOT NULL,
	idartista INT UNSIGNED NOT NULL,
	iddisco INT UNSIGNED NOT NULL,
	idgenero INT UNSIGNED NOT NULL,
	CONSTRAINT pk_cancion PRIMARY KEY (idcancion),
	CONSTRAINT fk_artista FOREIGN KEY (idartista) REFERENCES rockola.artista (idartista) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT fk_disco FOREIGN KEY (iddisco) REFERENCES rockola.disco (iddisco) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT fk_genero FOREIGN KEY (idgenero) REFERENCES rockola.genero (idgenero) ON DELETE NO ACTION ON UPDATE NO ACTION
);

