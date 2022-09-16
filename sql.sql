-- rockola_thor.Genero definition

###########################
#### CREA TABLA GENERO ####
###########################

CREATE TABLE IF NOT EXISTS rockola_thor.Genero (
	id INT UNSIGNED NOT NULL,
	genero varchar(35) NOT NULL,
	ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_genero PRIMARY KEY (id)
);

############################
### CREA TABLA ARTISITA ####
############################

CREATE TABLE IF NOT EXISTS rockola_thor.Artista (
	id INT UNSIGNED NOT NULL,
	nombre VARCHAR(35),
	ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_artista PRIMARY KEY (id)
);

###########################
##### CREA TABLA DISCO ####
###########################

CREATE TABLE IF NOT EXISTS rockola_thor.Disco (
	id INT UNSIGNED NOT NULL,
	nombre VARCHAR(35) NOT NULL,
	año INT UNSIGNED,
	tipo VARCHAR(35) NOT NULL,
	ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_disco PRIMARY KEY (id)
);

###########################
#### CREA TABLA CANCION ###
###########################

CREATE TABLE IF NOT EXISTS rockola_thor.Cancion (
	id INT UNSIGNED NOT NULL,
	nombre VARCHAR(35) NOT NULL,
	vinculo VARCHAR(50) NOT NULL,
	id_artista INT UNSIGNED NOT NULL,
	id_disco INT UNSIGNED NOT NULL,
	id_genero INT UNSIGNED NOT NULL,
	ultima_actualizacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	CONSTRAINT pk_cancion PRIMARY KEY (id),
	CONSTRAINT fk_artista FOREIGN KEY (id_artista) REFERENCES rockola_thor.Artista (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT fk_disco FOREIGN KEY (id_disco) REFERENCES rockola_thor.Disco (id) ON DELETE NO ACTION ON UPDATE NO ACTION,
	CONSTRAINT fk_genero FOREIGN KEY (id_genero) REFERENCES rockola_thor.Genero (id) ON DELETE NO ACTION ON UPDATE NO ACTION
);


