CREATE TABLE user_role (
  PRIMARY KEY (id),

  id   SMALLSERIAL NOT NULL,
  name VARCHAR(15) NOT NULL
);

CREATE TABLE its_users (
  PRIMARY KEY (id),

  id       SERIAL,
  username VARCHAR(55),
  password VARCHAR(55)


);

CREATE TABLE users_roles (
  user_id INTEGER  NOT NULL,
  role_id SMALLINT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES its_users (id),
  FOREIGN KEY (role_id) REFERENCES user_role (id)
);

