use my_db;
drop table if exists posts;
CREATE TABLE posts (
  id INT NOT NULL AUTO_INCREMENT,
  message VARCHAR(140),
  likes INT,
  PRIMARY KEY (id)
);

INSERT INTO posts (message, likes) VALUES
  ('Thank you!', 12),
  ('thanks 100%', 4),
  ('Gracias', 4),
  ('Arigato_gozaimasu', 15),
  ('Arigato! desu', 8);

-- %: 0文字以上の任意の文字
-- _: 任意の1文字
-- select * from posts where message like '__a%';
-- select * from posts where message not like '__a%';
-- select * from posts where message like '%\%%';
-- select * from posts where message like '%\_%';
-- select * from posts where likes != 12 or likes is null;
-- select * from posts where likes != 12 or likes is not null;
-- select * from posts order by likes;
-- select * from posts order by likes desc, message limit 3;
-- select * from posts order by likes desc, message limit 3 offset 2;
-- select * from posts order by likes desc, message limit 2, 3;
-- select
--   likes * 500 / 3 as bouns,
--   floor(likes * 500 / 3) as floor,
--   ceil(likes * 500 / 3) as ceil,
--   round(likes * 500 / 3, 2) as round
-- from posts;
-- select message, substring(message, 3, 2) from posts;
select concat(message, ' - ', likes) from posts;
select message, length(message) as len from posts;
select message, char_length(message) as len from posts;

-- select id, message from posts
  -- where likes
  -- not between 10 and 20;
  -- not in(20, 22);
  -- where message
  -- like 'm%';
  -- like binary 'M%';