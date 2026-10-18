CREATE TABLE tickets (
  id INTEGER PRIMARY KEY,
  event TEXT,
  price INTEGER,
  status TEXT
);
INSERT INTO tickets VALUES (1, 'Concierto de verano', 10, 'abierto');
INSERT INTO tickets VALUES (2, 'Obra de teatro', 8, 'cancelado');
INSERT INTO tickets VALUES (3, 'Partido benéfico', 5, 'abierto');
INSERT INTO tickets VALUES (4, 'Cine al aire libre', 6, 'cancelado');
