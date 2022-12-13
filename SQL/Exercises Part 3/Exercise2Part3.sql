USE capgemini_arg;
desc departments;
SELECT emp.FIRST_NAME, emp.LAST_NAME,  dep.DEPARTMENT_NAME, CITY
FROM employees EMP 
JOIN departments DEP ON dep.DEPARTMENT_ID = EMP.DEPARTMENT_ID
JOIN locations LOC ON dep.LOCATION_ID = loc.LOCATION_ID