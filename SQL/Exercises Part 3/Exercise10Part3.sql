USE capgemini_arg;
SELECT EMPLOYEE_ID, LAST_NAME,  JOB_ID,  SALARY
FROM employees 
WHERE  SALARY > ALL(SELECT SALARY 
				   FROM employees
                   WHERE JOB_ID LIKE '%IT_PROG%') AND  JOB_ID <> 'IT_PROG'