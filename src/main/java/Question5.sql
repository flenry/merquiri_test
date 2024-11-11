SELECT p.Name, s.Sport, SUM(s.Score) AS "Total Score"
FROM players p
JOIN scores s ON p.Player_no = s.Player_no
GROUP BY p.Name, s.Sport
ORDER BY p.Name, s.Sport;