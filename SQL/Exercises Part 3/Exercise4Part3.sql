USE capgemini_arg;
SELECT  emp.FIRST_NAME,  emp.LAST_NAME , '' 'es empleado de',
       man.FIRST_NAME, man.LAST_NAME 
FROM employees emp JOIN employees man
ON (emp.MANAGER_ID = man.employee_id);