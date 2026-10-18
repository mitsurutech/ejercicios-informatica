SELECT line, SUM(passengers) AS total FROM rides GROUP BY line ORDER BY line;
