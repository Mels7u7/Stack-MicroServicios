INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$9YFTp4bGejreEVFpuoWhcOas/TWFrL/WNz8o43R9.wOj26CI19F4S', 1, 'Andres', 'Guzman', 'gaa@gmail.com')
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('melisa', '69696', 1, 'Melisa', 'Bravo', 'meli@gmail.com')

INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')

INSERT INTO usuario_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuario_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuario_roles (usuario_id, role_id) VALUES (2, 1);