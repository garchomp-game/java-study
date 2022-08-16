use my_db;
DROP TABLE IF EXISTS posts;
CREATE TABLE posts (
  id INT NOT NULL AUTO_INCREMENT,
  message VARCHAR(140),
  likes INT,
  created datetime default now(),
  updated datetime default now() on update now(),
  PRIMARY KEY (id)
);

INSERT INTO posts (message, likes) VALUES
  ('Thanks', 12),
  ('Merci', 4),
  ('Arigato', 4),
  ('Gracias', 15),
  ('Danke', 8);
select * from posts;

-- alter table posts add author varchar(255) after id;
-- desc posts;
-- select id, created, updated from posts;
-- select sleep(3);
-- update posts set likes = 100 where id = 1;
-- select id, created, updated from posts;
-- update posts set likes = likes + 5 where likes >= 10;
-- update
--   posts
-- set
--   likes = likes + 5,
--   message = upper(message)
-- where
--   likes >= 10;
-- delete from posts where likes < 10;
-- delete from posts;
-- truncate table posts;
-- insert into posts (message, likes) values ('xie xie', 10);
-- select * from posts;