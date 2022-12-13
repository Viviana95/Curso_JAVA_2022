USE capgemini_arg;
SELECT SALARY, DEPARTMENT_ID from employees;
SELECT * from departments;
SELECT emp.LAST_NAME, SALARY ,  dep.DEPARTMENT_NAME
FROM employees emp JOIN departments  dep 
ON (emp.DEPARTMENT_ID = dep.DEPARTMENT_ID)
WHERE SALARY  IN ( SELECT  MIN( SALARY)  
                  FROM employees  empA
                  WHERE emp.DEPARTMENT_ID = empA.DEPARTMENT_ID
                  GROUP BY   DEPARTMENT_ID 
);
SELECT emp.LAST_NAME, SALARY ,  dep.DEPARTMENT_NAME
FROM employees emp JOIN departments  dep 
ON (emp.DEPARTMENT_ID = dep.DEPARTMENT_ID)
WHERE SALARY  <= ANY ( SELECT  MIN( SALARY)  
                  FROM employees  empA
                  WHERE emp.DEPARTMENT_ID = empA.DEPARTMENT_ID
);