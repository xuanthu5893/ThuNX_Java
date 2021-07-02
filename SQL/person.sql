
SELECT * FROM person WHERE gender = 'Male' AND YEAR(birthdate) > (YEAR(CURDATE()) -45);

SELECT * FROM person WHERE gender = 'Female' AND job = 'driver';

SELECT m.job, m.malecount, f.femalecount, m.malecount/f.femalecount FROM  
(SELECT job, COUNT(*) AS malecount FROM person WHERE gender = 'Male' AND job = 'developer') AS m 
JOIN 
(SELECT job, COUNT(*) AS femalecount FROM person WHERE gender = 'Female' AND job = 'developer') AS f ON m.job = f.job;

SELECT city, COUNT(*) FROM person WHERE gender = 'Female' GROUP BY city ORDER BY COUNT(*) DESC  LIMIT 5;
