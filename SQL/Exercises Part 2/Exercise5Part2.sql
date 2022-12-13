USE capgemini_arg;
SELECT * FROM employees;
SELECT MANAGER_ID, LAST_NAME, JOB_ID
FROM employees
WHERE JOB_ID NOT IN('SA_REP', 'AD_VP') AND
      (LAST_NAME LIKE 'K%' OR  -- no hay manager_id 100 con letra k
      MANAGER_ID = 100)
ORDER BY MANAGER_ID DESC, LAST_NAME; 