USE business;
SELECT * FROM bonus;

SELECT * FROM employee;

-- IN
SELECT * FROM `employee`
WHERE employee_id IN (1,3,7,8,5,9);

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- NOT BETWEEN
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 3;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 4;

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE 'B%'; -- empieza con B

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE '%A'; -- termina con A

-- LIKE CASE SENSITIVE
SELECT * FROM employee
WHERE last_name LIKE BINARY'%a';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '2014-02-20%'; 

-- UPDATE
UPDATE employee
SET salary = 300000
WHERE employee_id = 5;

SELECT * FROM employee
WHERE department = 'HR';

UPDATE employee
SET salary = 150000
WHERE department = 'HR';

SELECT * FROM employee
WHERE department = 'Account';

UPDATE employee
SET salary = 200000
WHERE department = 'Account';

SELECT * FROM employee
WHERE department = 'Admin';

UPDATE employee
SET salary = 1000000
WHERE department LIKE 'ad%';

-- Agregar Nuevos empleados
INSERT INTO employee
(first_name, last_name, salary, join_date, department)
VALUES
('Josue', 'Trinidad', 2000000, '2010-02-10', 'Management'),
('Elsy', 'Gonzalez', 5000000, '2010-01-01', 'Management'),
('Alex', 'Soto', 40000, '2010-02-04', 'Developers'),
('Oscar', 'Cervantes', 100000000, '2010-04-29', 'Developers'),
('Carlos', 'Brito', 100000, '2010-06-13', 'Direccion');


-- ORDER BY
SELECT * FROM employee
ORDER BY salary ASC;

-- SELECT MIN
SELECT MIN(salary) FROM employee;

-- SELECT MAX
SELECT MAX(salary) FROM employee;

-- AVERAGE
SELECT AVG(salary) AS promedio FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;
