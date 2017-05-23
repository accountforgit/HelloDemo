drop table if exists hellotext;
CREATE TABLE hellotext (
  id    int primary key auto_increment,
  text  VARCHAR(100)
);

INSERT INTO hellotext VALUES(1,'Tomcat');