SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE user
(
	id bigint NOT NULL AUTO_INCREMENT,
	name char(20) NOT NULL,
	password char(20) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
);



