CREATE TABLE films (
  id INTEGER PRIMARY KEY,
  title TEXT,
  minutes INTEGER
);
CREATE TABLE screenings (
  id INTEGER PRIMARY KEY,
  film_id INTEGER,
  room INTEGER,
  start_time TEXT,
  FOREIGN KEY (film_id) REFERENCES films(id)
);
INSERT INTO films VALUES (1, 'La isla del tesoro', 95);
INSERT INTO films VALUES (2, 'Mar de dudas', 110);
INSERT INTO films VALUES (3, 'El último tren', 88);
INSERT INTO screenings VALUES (1, 2, 1, '17:00');
INSERT INTO screenings VALUES (2, 1, 2, '17:30');
INSERT INTO screenings VALUES (3, 3, 1, '20:00');
INSERT INTO screenings VALUES (4, 2, 3, '21:15');
