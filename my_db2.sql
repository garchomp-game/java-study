use my_db;
DROP TABLE IF EXISTS posts;
CREATE TABLE posts (
  id INT NOT NULL AUTO_INCREMENT,
  message VARCHAR(140),
  likes INT,
  created DATETIME,
  PRIMARY KEY (id)
);

INSERT INTO posts (message, likes, created) VALUES
  ('Thanks', 12, '2020-05-01'),
  ('Merci', 4, '2020-05-03'),
  ('Arigato', 4, '2020-06-14'),
  ('Gracias', 15, '2020-07-04'),
  ('Danke', 8, '2020-08-22');

-- select
--   created,
--   year(created) as year,
--   month(created) as month,
--   day(created) as day
-- from posts;

-- select
--   created,
--   date_format(created, '%M %D %Y, %W') as date
-- from
--   posts;
  
-- select
--   created,
--   date_add(created, interval 7 day) as next
-- from
--   posts;
  
select
  created,
  now(),
  datediff(created, now()) as diff
from
  posts;