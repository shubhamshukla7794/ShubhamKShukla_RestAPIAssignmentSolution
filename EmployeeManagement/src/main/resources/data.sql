INSERT INTO users (user_id,password,username) VALUES ( 1,'$2a$12$ylu1RX5i1U0h/MipWXtjsefe4hWIjVPLBcw0VM4UsY65RgJqluJ/C','admin');
INSERT INTO roles (role_id,name) VALUES ( 1, 'ADMIN' );

INSERT INTO users_roles (user_id,role_id) VALUES ( 1, 1);