USE capgemini_arg;
SELECT emp.FIRST_NAME, emp.LAST_NAME,  dep.DEPARTMENT_NAME,  dep.LOCATION_ID
FROM employees emp JOIN departments  dep 
ON (emp.DEPARTMENT_ID = dep.DEPARTMENT_ID)
AND emp.MANAGER_ID = 149;
                                    
                    
                    