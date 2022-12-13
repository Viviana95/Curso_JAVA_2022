USE capgemini_arg;
SELECT * from employees;
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM employees;

SELECT emp.FIRST_NAME, emp.LAST_NAME, emp.HIRE_DATE,
		DATE_ADD(emp.hire_date, INTERVAL 6 MONTH) AS FIRST_REVISION, 
        DATE_SUB(emp.hire_date, INTERVAL DAYOFWEEK(emp.hire_date)- 6 DAY) AS FIRST_FRIDAY
from employees emp
 JOIN departments dep
ON emp.DEPARTMENT_ID = dep.DEPARTMENT_ID
WHERE DEPARTMENT_ID LIKE '%Marketing%';