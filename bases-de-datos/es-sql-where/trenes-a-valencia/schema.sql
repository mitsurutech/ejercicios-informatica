CREATE TABLE trains (
  id INTEGER PRIMARY KEY,
  destination TEXT,
  departure TEXT,
  price REAL,
  seats INTEGER
);
INSERT INTO trains VALUES (1, 'Valencia', '08:15', 24.5, 40);
INSERT INTO trains VALUES (2, 'Madrid', '09:30', 35.0, 0);
INSERT INTO trains VALUES (3, 'Valencia', '11:00', 19.9, 12);
INSERT INTO trains VALUES (4, 'Sevilla', '12:45', 42.0, 8);
INSERT INTO trains VALUES (5, 'Valencia', '17:20', 29.5, 25);
