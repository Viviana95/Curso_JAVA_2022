USE capgemini_arg;
SELECT JOB_TITLE, MIN_SALARY + MAX_SALARY AS SALARY, JOB_ID FROM JOBS
WHERE job_id  < ALL (SELECT AVG(MIN_SALARY + MAX_SALARY) >=13000)  AND JOB_ID NOT LIKE '%REP%'
ORDER BY SALARY DESC