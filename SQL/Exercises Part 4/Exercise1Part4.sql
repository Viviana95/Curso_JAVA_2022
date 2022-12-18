USE capgemini_arg;
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY, DEPARTMENT_ID
FROM employees
WHERE FIRST_NAME = 'kimberely';

-- department id 60
select DEPARTMENT_NAME, DEPARTMENT_ID
FROM departments
where DEPARTMENT_NAME = 'IT';

-- primer empleado salary 9000
select SALARY
from employees
where HIRE_DATE = (select min(HIRE_DATE)
from employees
where DEPARTMENT_ID =60);


update employees
set SALARY = 9000, DEPARTMENT_ID = 60
where EMPLOYEE_ID = 178




