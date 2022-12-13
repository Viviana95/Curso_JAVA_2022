USE capgemini_arg;
-- SELECT * from employees;
SELECT DISTINCT(FIRST_NAME), COUNT(FIRST_NAME) from employees
GROUP BY FIRST_NAME
